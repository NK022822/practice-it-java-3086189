package _02_02;

public class tickets {
  private String destination;
  private double price;
  private boolean isReturn;

  public tickets(String destination, double price, boolean isReturn) {
    this.destination = destination;
    this.price = price;
    this.isReturn = isReturn;
  }

  public void setDestination(String destination)
  {
    this.destination = destination;
  }

  public void setPrice(double Price)
  {
    this.price = price;
  }

  public void setIsReturn(boolean isReturn)
  {
    this.isReturn = isReturn;
  }

  public String getDestination()
  {
    return this.destination;
  }
  public double getPrice()
  {
    return this.price;
  }

  public boolean getisReturn()
  {
    return this.isReturn;
  }
}
