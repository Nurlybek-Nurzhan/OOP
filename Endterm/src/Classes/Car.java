package Classes;

import java.util.ArrayList;
import java.util.List;

public class Car {
  private String brandName;
  private int maxPassengers;
  private double cost;
  private int quantityInStock;
  private CarDealership dealership;
  private List<PurchaseRequest> requests;

  public Car(String brandName, int maxPassengers, double cost, int quantityInStock) {
    this.brandName = brandName;
    this.maxPassengers = maxPassengers;
    this.cost = cost;
    this.quantityInStock = quantityInStock;
    this.requests = new ArrayList<>();
  }

  // Getters and setters
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getQuantityInStock() {
    return quantityInStock;
  }

  public void setQuantityInStock(int quantityInStock) {
    this.quantityInStock = quantityInStock;
  }

  public CarDealership getDealership() {
    return dealership;
  }

  public void setDealership(CarDealership dealership) {
    this.dealership = dealership;
  }

  // Automatic availability calculation
  public boolean isAvailable() {
    return quantityInStock > requests.size();
  }

  // Request management
  public void addRequest(PurchaseRequest request) {
    requests.add(request);
    request.setCar(this);
  }

  public void removeRequest(PurchaseRequest request) {
    requests.remove(request);
    request.setCar(null);
  }

  public List<PurchaseRequest> getRequests() {
    return requests;
  }
}