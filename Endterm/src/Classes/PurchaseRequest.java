package Classes;

public class PurchaseRequest {
  private String buyerName;
  private String phoneNumber;
  private Car car;

  public PurchaseRequest(String buyerName, String phoneNumber) {
    this.buyerName = buyerName;
    this.phoneNumber = phoneNumber;
  }

  // Getters and setters
  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }
}