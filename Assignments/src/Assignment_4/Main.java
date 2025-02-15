import Classes.Car;
import Classes.CarDealership;
import Classes.PurchaseRequest;

public class Main {
  public static void main(String[] args) {
    // Create dealership
    CarDealership bestCars = new CarDealership("Best Cars Dealer");

    // Create cars
    Car toyota = new Car("Toyota", 5, 25000.0, 3);
    Car honda = new Car("Honda", 7, 32000.0, 5);

    // Add cars to dealership
    bestCars.addCar(toyota);
    bestCars.addCar(honda);

    // Create purchase requests
    PurchaseRequest req1 = new PurchaseRequest("Alice Johnson", "555-0101");
    PurchaseRequest req2 = new PurchaseRequest("Bob Smith", "555-0202");
    PurchaseRequest req3 = new PurchaseRequest("Charlie Brown", "555-0303");
    PurchaseRequest req4 = new PurchaseRequest("Diana Prince", "555-0404");

    // Add requests to cars
    toyota.addRequest(req1); // 1 request for Toyota
    honda.addRequest(req2); // 3 requests for Honda
    honda.addRequest(req3);
    honda.addRequest(req4);

    // Display car information
    System.out.println("\nHonda Car Details:");
    System.out.println("  Brand: " + honda.getBrandName());
    System.out.println("  Price: $" + honda.getCost());
    System.out.println("  In Stock: " + honda.getQuantityInStock());
    System.out.println("  Available: " + (honda.isAvailable() ? "Yes" : "No"));

    // Display purchase requests
    System.out.println("\nPurchase Requests:");
    for (PurchaseRequest req : honda.getRequests()) {
      System.out.println("- " + req.getBuyerName() + " | " + req.getPhoneNumber());
    }

    // Search demonstration
    Car found = bestCars.findCarByBrand("toyota");
    if (found != null) {
      System.out.println("\nFound Car:");
      System.out.println("  Brand: " + found.getBrandName());
      System.out.println("  Max Passengers: " + found.getMaxPassengers());
      System.out.println("  Availability: " + (found.isAvailable() ? "Yes" : "No"));
    }
  }
}