import javax.swing.SwingUtilities;
import Classes.CarDealershipGUI;

public class Main {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      new CarDealershipGUI().setVisible(true);
    });
  }
}
