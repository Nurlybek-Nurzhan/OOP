package Assignment_3;

public class Task_21 {
  public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper() {
      this.floorsCount = 5;
      this.developer = "JavaRushDevelopment";
    }

    public Skyscraper(int floorsCount, String developer) {
      this.floorsCount = floorsCount;
      this.developer = developer;
    }
  }

  public static void main(String[] args) {
    Task_21 task = new Task_21();
    Skyscraper skyscraper = task.new Skyscraper();
    Skyscraper skyscraperUnknown = task.new Skyscraper(50, "Unknown");

    System.out.println("The number of Known Skyscraper floors is: " + skyscraper.floorsCount);
    System.out.println("The developer of Known Skyscraper is: " + skyscraper.developer);

    System.out.println("The number of Unknown Skyscraper floors is: " + skyscraperUnknown.floorsCount);
    System.out.println("The developer of Unknown Skyscraper is: " + skyscraperUnknown.developer);
  }
}
