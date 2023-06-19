package com.gradlefirstproject.demo.model;

public class CustomerData {

    private static int id;
    private String customerId;
    private String customerName;
    private double balance ;

    static {
        id = 1;
    }
    public CustomerData(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getCustomerId() {
        return "Customer#"+ id++;
    }
    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }



    public void printData(){
        System.out.println("Customer Id :" + getCustomerId());
        System.out.println("Customer Name :" + getCustomerName());
        System.out.println("Balance :" + getBalance());

    }
}
