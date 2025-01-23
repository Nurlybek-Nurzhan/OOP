package Assignment_3.Task_33;

public class Earth {
  public static void main(String[] args) {
    Africa africa = new Africa(30_370_000);
    Antarctica antarctica = new Antarctica(14_200_000);
    Australia australia = new Australia(8_600_000);
    Eurasia eurasia = new Eurasia(55_000_000);
    NorthAmerica northAmerica = new NorthAmerica(24_709_000);
    SouthAmerica southAmerica = new SouthAmerica(17_840_000);

    System.out.println("Area of Africa: " + africa.getArea());
    System.out.println("Area of Antarctica: " + antarctica.getArea());
    System.out.println("Area of Australia: " + australia.getArea());
    System.out.println("Area of Eurasia: " + eurasia.getArea());
    System.out.println("Area of North America: " + northAmerica.getArea());
    System.out.println("Area of South America: " + southAmerica.getArea());
    System.out.println("Total area: " + (africa.getArea() + antarctica.getArea() + australia.getArea()
        + eurasia.getArea() + northAmerica.getArea() + southAmerica.getArea()));
  }
}