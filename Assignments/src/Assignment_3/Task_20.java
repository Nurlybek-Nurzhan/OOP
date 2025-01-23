package Assignment_3;

public class Task_20 {
  public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";

    public Skyscraper() {
      System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floorsCount) {
      System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floorsCount);
    }

    public Skyscraper(String developer) {
      System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }
  }
}


