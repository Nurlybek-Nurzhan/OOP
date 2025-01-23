package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Task_18 {
  public static void main(String[] args) {
    List<Person> plot = new ArrayList<Person>();
    plot.add(new Person("Repka", "Repku"));
    plot.add(new Person("Dedka", "Dedku"));
    plot.add(new Person("Babka", "Babku"));
    plot.add(new Person("Granddaughter", "Granddaughter"));
    RepkaStory.tell(plot);
  }

  public static class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
      this.name = name;
      this.namePadezh = namePadezh;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getNamePadezh() {
      return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
      this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
      System.out.println(this.getName() + " for " + person.getNamePadezh());
    }
  }

  public interface RepkaItem {
    public String getNamePadezh();
  }

  public class RepkaStory {
    static void tell(List<Person> items) {
      Person first;
      Person second;

      for (int i = 1; i < items.size(); i++) {
        first = items.get(i - 1);
        second = items.get(i);
        second.pull(first);
      }
    }
  }
}