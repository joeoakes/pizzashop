package edu.psu.ist;

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;

    //Constructor Method
    public Transaction(int _transactionId){
        this.transactionId = _transactionId;
    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

}
