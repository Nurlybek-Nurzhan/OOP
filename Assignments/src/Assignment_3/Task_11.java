package Assignment_3;

public class Task_11 {
  public static void main(String[] args) {
  }

  // can move
  public interface Movable {
    void move();
  }

  // can be eaten
  public interface Edible {
    void beEaten();
  }

  // might eat someone
  public interface Eat {
    void eat();
  }

  public class Cat implements Movable, Edible, Eat {
    @Override
    public void move() {
    }

    @Override
    public void beEaten() {
    }

    @Override
    public void eat() {
    }
  }

  public class Mouse implements Movable, Edible {
    @Override
    public void move() {
    }

    @Override
    public void beEaten() {
    }
  }

  public class Dog implements Movable, Eat {
    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }
  }
}
