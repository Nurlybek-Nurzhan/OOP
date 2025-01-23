package Assignment_3;

public class Task_22 {
  public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
      this.model = model;
      this.year = year;
      this.color = color;
    }

    public CarConcern(String model, int year) {
      this(model, year, "Orange");
    }

    public CarConcern(String model) {
      this(model, 4321, "Orange");
    }
  }

  public static void main(String[] args) {
    Task_22 task = new Task_22();
    CarConcern car = task.new CarConcern("Aventador", 2021);
    System.out.println(car.manufacturer);
    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.color);
  }
}
