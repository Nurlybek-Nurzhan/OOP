package Assignment_3;

public class Task_14 {
  public static void main(String[] args) {
    System.out.println(Dream.HOBBY.toString());
    System.out.println(Hobby.INDEX);
  }

  interface Desire {
  }

  interface Dream {
    public static Hobby HOBBY = new Hobby();
  }

  static class Hobby implements Desire, Dream {
    static int INDEX = 1;

    @Override
    public String toString() {
      INDEX++;
      return "" + INDEX;
    }
  }
}
