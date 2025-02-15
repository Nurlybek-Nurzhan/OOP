package Classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class CarDealershipGUI extends JFrame {
  private JTable carTable;
  private DefaultTableModel tableModel;
  private JTextField brandField, maxPassengersField, costField, quantityField, searchField;
  private JButton addButton, updateButton, deleteButton, searchButton;
  private Connection conn;

  @SuppressWarnings("unused")

  public CarDealershipGUI() {
    super("Car Dealership Management");
    setSize(800, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Table for displaying all cars
    String[] columns = { "ID", "Brand", "Max Passengers", "Cost", "Quantity" };
    tableModel = new DefaultTableModel(columns, 0);
    carTable = new JTable(tableModel);
    add(new JScrollPane(carTable), BorderLayout.CENTER);

    // Panel for entering new car info
    JPanel inputPanel = new JPanel(new GridLayout(2, 5));
    brandField = new JTextField();
    maxPassengersField = new JTextField();
    costField = new JTextField();
    quantityField = new JTextField();
    searchField = new JTextField();

    addButton = new JButton("Add Car");
    updateButton = new JButton("Update Car");
    deleteButton = new JButton("Delete Car");
    searchButton = new JButton("Search Car");

    inputPanel.add(new JLabel("Brand:"));
    inputPanel.add(brandField);
    inputPanel.add(new JLabel("Max Passengers:"));
    inputPanel.add(maxPassengersField);
    inputPanel.add(addButton);

    inputPanel.add(new JLabel("Cost:"));
    inputPanel.add(costField);
    inputPanel.add(new JLabel("Quantity:"));
    inputPanel.add(quantityField);
    inputPanel.add(updateButton);

    JPanel searchPanel = new JPanel(new GridLayout(1, 2));
    searchPanel.add(new JLabel("Search by Brand:"));
    searchPanel.add(searchField);
    searchPanel.add(searchButton);
    searchPanel.add(deleteButton);

    add(inputPanel, BorderLayout.NORTH);
    add(searchPanel, BorderLayout.SOUTH);

    // Button Actions
    addButton.addActionListener(e -> addCar());
    updateButton.addActionListener(e -> updateCar());
    deleteButton.addActionListener(e -> deleteCar());
    searchButton.addActionListener(e -> searchCar());

    // Connect to database
    connectToDatabase();
    loadCars();
  }

  // Connect to database
  private void connectToDatabase() {
    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_dealership", "root", "12344321");
      System.out.println("Connected to MySQL!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Load all cars from database
  private void loadCars() {
    try {
      tableModel.setRowCount(0);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM cars");
      while (rs.next()) {
        tableModel.addRow(new Object[] {
            rs.getInt("id"), rs.getString("brand"), rs.getInt("max_passengers"),
            rs.getDouble("cost"), rs.getInt("quantity")
        });
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Reset auto increment value to 1 if table is empty
  private void resetAutoIncrement() {
    try {
      String checkQuery = "SELECT COUNT(*) FROM cars";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(checkQuery);
      if (rs.next() && rs.getInt(1) == 0) {
        stmt.executeUpdate("ALTER TABLE cars AUTO_INCREMENT = 1");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Validate user inputs
  private boolean validateInputs() {
    try {
      int maxPassengers = Integer.parseInt(maxPassengersField.getText().trim());
      double cost = Double.parseDouble(costField.getText().trim());
      int quantity = Integer.parseInt(quantityField.getText().trim());

      if (maxPassengers < 0 || cost < 0 || quantity < 0) {
        JOptionPane.showMessageDialog(this, "Max Passengers, Cost, and Quantity must be 0 or higher!", "Input Error",
            JOptionPane.ERROR_MESSAGE);
        return false;
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(this, "Max Passengers, Cost, and Quantity must be valid numbers!", "Input Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }
    return true;
  }

  // Add car to database
  private void addCar() {
    if (!validateInputs())
      return;

    try {
      String query = "INSERT INTO cars (brand, max_passengers, cost, quantity) VALUES (?, ?, ?, ?)";
      PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
      stmt.setString(1, brandField.getText().trim());
      stmt.setInt(2, Integer.parseInt(maxPassengersField.getText().trim()));
      stmt.setDouble(3, Double.parseDouble(costField.getText().trim()));
      stmt.setInt(4, Integer.parseInt(quantityField.getText().trim()));
      stmt.executeUpdate();

      ResultSet rs = stmt.getGeneratedKeys();
      if (rs.next()) {
        int newID = rs.getInt(1);
        System.out.println("New car added with ID: " + newID);
      }

      loadCars();
      JOptionPane.showMessageDialog(this, "Car added successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Update car in database
  private void updateCar() {
    if (!validateInputs())
      return;

    try {
      int selectedRow = carTable.getSelectedRow();
      if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select a car to update!");
        return;
      }
      int id = (int) tableModel.getValueAt(selectedRow, 0);
      String query = "UPDATE cars SET brand=?, max_passengers=?, cost=?, quantity=? WHERE id=?";
      PreparedStatement stmt = conn.prepareStatement(query);
      stmt.setString(1, brandField.getText().trim());
      stmt.setInt(2, Integer.parseInt(maxPassengersField.getText().trim()));
      stmt.setDouble(3, Double.parseDouble(costField.getText().trim()));
      stmt.setInt(4, Integer.parseInt(quantityField.getText().trim()));
      stmt.setInt(5, id);
      stmt.executeUpdate();
      loadCars();
      JOptionPane.showMessageDialog(this, "Car updated successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Delete car from database
  private void deleteCar() {
    try {
      int selectedRow = carTable.getSelectedRow();
      if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Select a car to delete!");
        return;
      }
      int id = (int) tableModel.getValueAt(selectedRow, 0);
      String query = "DELETE FROM cars WHERE id=?";
      PreparedStatement stmt = conn.prepareStatement(query);
      stmt.setInt(1, id);
      stmt.executeUpdate();
      resetAutoIncrement();
      loadCars();
      JOptionPane.showMessageDialog(this, "Car deleted successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Search for car in database
  private void searchCar() {
    try {
      String searchBrand = searchField.getText().trim();
      if (searchBrand.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter a brand to search!");
        loadCars(); // Reload all cars if search is empty
        return;
      }

      tableModel.setRowCount(0); // Clear table before adding search results
      String query = "SELECT * FROM cars WHERE LOWER(brand) LIKE LOWER(?)"; // Case-insensitive search
      PreparedStatement stmt = conn.prepareStatement(query);
      stmt.setString(1, "%" + searchBrand + "%");
      ResultSet rs = stmt.executeQuery();

      boolean found = false;
      while (rs.next()) {
        found = true;
        tableModel.addRow(new Object[] {
            rs.getInt("id"), rs.getString("brand"), rs.getInt("max_passengers"),
            rs.getDouble("cost"), rs.getInt("quantity")
        });
      }

      if (!found) {
        JOptionPane.showMessageDialog(this, "No cars found for the brand: " + searchBrand);
        loadCars(); // Reload all cars if nothing is found
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
