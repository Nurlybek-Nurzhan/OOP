public class Car {
  private String brandName;
  private int maxNumberOfPassengers;
  private float cost;
  private int quantitInStock;
  private boolean availability;

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public int getMaxNumberOfPassengers() {
    return maxNumberOfPassengers;
  }

  public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
    this.maxNumberOfPassengers = maxNumberOfPassengers;
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  public int getQuantitInStock() {
    return quantitInStock;
  }

  public void setQuantitInStock(int quantitInStock) {
    this.quantitInStock = quantitInStock;
  }

  public boolean isAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }
}
