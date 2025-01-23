package Assignment_3;

import java.awt.Color;

public class Task_16 {
  public static void main(String[] args) throws Exception {
  }

  public interface Animal {
    Color getColor();

    Integer getAge();
  }

  public static abstract class Fox implements Animal {
    public String getName() {
      return "Fox.";
    }
  }
}
