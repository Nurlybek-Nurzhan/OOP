package Assignment_3;

public class Task_23 {
  public class Building {
    private String type;

    public void initialize(String type) {
      this.type = type;
    }
  }

  public static void main(String[] args) {
    Building building = new Task_23().new Building();
    building.initialize("Restaurant");
    System.out.println(building.type);

    building.initialize("Barbershop");
    System.out.println(building.type);
  }
}
