package com.pavan;

public class Account {
    int number;
    int noOfAccountHolders;
    String  acType;
    int balance;

    public Account(int number, int noOfAccountHolders, String acType, int balance) {
        this.number = number;
        this.noOfAccountHolders = noOfAccountHolders;
        this.acType = acType;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNoOfAccountHolders() {
        return noOfAccountHolders;
    }

    public void setNoOfAccountHolders(int noOfAccountHolders) {
        this.noOfAccountHolders = noOfAccountHolders;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
