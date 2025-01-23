package Assignment_3;

public class Task_6 {
  public static void main(String[] args) throws Exception {
  }

  interface Selectable {
    void onSelect();
  }

  interface Updatable {
    void refresh();
  }

  class Screen implements Selectable, Updatable {
    public void onSelect() {
    }

    public void refresh() {
    }
  }
}
