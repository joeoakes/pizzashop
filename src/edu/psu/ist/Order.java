package edu.psu.ist;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}
    
}
