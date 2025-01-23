package Assignment_3;

public class Task_25 {
  public class Programmer {
    private int salary = 1000;

    public int getSalary() {
      return salary;
    }

    public void setSalary(int newSalary) {
      if (newSalary > salary) {
        salary = newSalary;
      }
    }
  }

  public static void main(String[] args) {
    Task_25 task = new Task_25();
    Programmer programmer = task.new Programmer();
    System.out.println(programmer.getSalary());
    programmer.setSalary(1200);
    System.out.println(programmer.getSalary());
    programmer.setSalary(1100);
    System.out.println(programmer.getSalary());
    programmer.setSalary(1000);
    System.out.println(programmer.getSalary());
    programmer.setSalary(2000);
    System.out.println(programmer.getSalary());
  }
}