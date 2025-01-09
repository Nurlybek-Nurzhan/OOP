package Assignment_2;

public class Task_33 {
  class Entity {
    public void move() {
      System.out.println("I'm moving");
    }
  }

  class Human extends Entity {
    public void speak() {
      System.out.println("I can communicate.");
    }
  }

  class JavaDeveloper extends Human {
    public void code() {
      System.out.println("I know how to communicate in Java.");
    }
  }
}
