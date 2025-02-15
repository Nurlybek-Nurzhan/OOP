package Classes;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
  private String name;
  private List<Car> cars;

  public CarDealership(String name) {
    this.name = name;
    this.cars = new ArrayList<>();
  }

  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Car> getCars() {
    return cars;
  }

  // Core functionality
  public void addCar(Car car) {
    cars.add(car);
    car.setDealership(this);
  }

  public Car findCarByBrand(String brand) {
    for (Car car : cars) {
      if (car.getBrandName().equalsIgnoreCase(brand)) {
        return car;
      }
    }
    return null;
  }
}
