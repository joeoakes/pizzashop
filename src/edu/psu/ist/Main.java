package edu.psu.ist;
/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Joe Oakes
Date Developed: 3/14/19
Last Date Changed: 3/13/19
Rev: 2
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer(1);
        Menu menu1 = new Menu(1);
        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1);

        cList.add(cust1);
        mList.add(menu1);
        oList.add(order1);
        tList.add(trans1);
        Customer custReturn = cList.get(0);
        System.out.println(custReturn.getcustomerId());

    }
}
