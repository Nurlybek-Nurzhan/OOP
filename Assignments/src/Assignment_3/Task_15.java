package Assignment_3;

public class Task_15 {
  public static void main(String[] args) throws Exception {
  }

  interface Selectable {
    void onSelect();
  }

  interface Updatable extends Selectable {
    void refresh();
  }

  class Screen implements Updatable {
    @Override
    public void onSelect() {
    }

    @Override
    public void refresh() {
    }
  }
}
