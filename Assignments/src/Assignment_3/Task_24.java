package Assignment_3;

public class Task_24 {
  public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public Bugatti() {
    }

    public Bugatti(String color, int year, String body) {
      this.color = color;
      this.year = year;
      this.body = body;
    }

    public String getBody() {
      return body;
    }

    public void setBody(String body) {
      this.body = body;
    }
  }

  public static void main(String[] args) {
    Task_24 task = new Task_24();
    Bugatti bugatti = task.new Bugatti();
    System.out.println("");
    System.out.println("Current Bugatti:");
    System.out.println("Color: " + bugatti.color);
    System.out.println("Year: " + bugatti.year);
    System.out.println("Body: " + bugatti.body);
    System.out.println("");

    bugatti.setBody("Convertible");
    System.out.println("After changing the body:");
    System.out.println("Body: " + bugatti.getBody());
    System.out.println("");

    System.out.println("New Bugatti:");
    System.out.println("Color: " + bugatti.color);
    System.out.println("Year: " + bugatti.year);
    System.out.println("Body: " + bugatti.body);
    System.out.println("");

    Bugatti bugatti1 = task.new Bugatti("RED", 2021, "SUV");
    System.out.println("Completly Changed Bugatti:");
    System.out.println(bugatti1.color);
    System.out.println(bugatti1.year);
    System.out.println(bugatti1.body);
  }
}
