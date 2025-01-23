package Assignment_3;

public class Task_27 {
  public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
      this.model = model;
      this.color = color;
      this.price = price;
    }

    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }

      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }

      Iphone iphone = (Iphone) obj;
      return price == iphone.price && model.equals(iphone.model) && color.equals(iphone.color);
    }
  }

  public static void main(String[] args) {
    Task_27 task = new Task_27();
    Iphone iphone1 = task.new Iphone("X", "Black", 999);
    Iphone iphone2 = task.new Iphone("X", "Black", 999);
    System.out.println(iphone1.equals(iphone2));

    Iphone iphone3 = task.new Iphone("X", "Black", 1000);
    System.out.println(iphone1.equals(iphone3));

    System.out.println(iphone1.equals(null));
  }
}
