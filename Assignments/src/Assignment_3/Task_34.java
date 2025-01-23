package Assignment_3;

public class Task_34 {
  public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
      this.model = model;
      this.year = year;
      this.color = color;
    }
  }

  public static void main(String[] args) {
    Task_34 task = new Task_34();
    Car car = task.new Car();
    car.initialize("Aventador", 2021, "RED");
    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.color);
  }
}
