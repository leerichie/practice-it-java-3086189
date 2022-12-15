package _02_02;


public class Ticket {
  private String destination;
  private double price;
  private boolean isReturn;

  public Ticket(){
  }

  public String getDestination(){
    return destination;
  }
  public void setDestination(String destination){
    this.destination = destination;
  }
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public boolean getIsReturn(){
    return isReturn;
  }
  public void setIsReturn(boolean isReturn){
   this.isReturn = isReturn;
  }
}

// 1. Create a class called Ticket
// 2. Give the class an empty constructor
// 3. Create 3 private field variables in the class:  
// - A field of type String called destination
// - A field called price of type double
// - A field called isReturn of type boolean