package edu.psu.ist;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;

    //Constructor Method
    public Customer(int _customerId){
        this.customerId = _customerId;
    }

    public Customer(){
    }

    //Setters and Getters
    public int getcustomerId() { return customerId; }
    public void setcustomerId(int _customerId) {this.customerId = _customerId;}
    
}
