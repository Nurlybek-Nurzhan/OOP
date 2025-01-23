package Assignment_3;

public class Task_28 {

  public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
      this.model = model;
      this.year = year;
    }

    public int hashCode() {
      int result = 17;
      result = 31 * result + (model != null ? model.hashCode() : 0);
      result = 31 * result + year;
      return result;
    }
  }

  public static void main(String[] args) {
    Task_28 task = new Task_28();
    Car lamborghini = task.new Car("Lamborghini", 2020);
    Car lamborghini1 = task.new Car("Lamborghini", 2020);
    Car ferrari = task.new Car("Ferrari", 2020);
    Car ferrari1 = task.new Car("Ferrari", 2020);
    Car bugatti = task.new Car("Bugatti", 2020);
    Car bugatti1 = task.new Car("Bugatti", 2020);

    System.out.println(ferrari.hashCode() == ferrari.hashCode());
    System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
    System.out.println(ferrari.hashCode() == ferrari1.hashCode());
    System.out.println(bugatti.hashCode() == bugatti1.hashCode());
    System.out.println(bugatti.hashCode() == lamborghini.hashCode());
    System.out.println(lamborghini.hashCode() == ferrari.hashCode());
  }
}
