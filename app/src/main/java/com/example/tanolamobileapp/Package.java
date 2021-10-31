package com.example.tanolamobileapp;



public class Package {
    private String senderAddress;
    private String recipientAddress;

    private double weight;
    private double costPerOunce;

    public Package(String senderAddr, String recipientAddr, double wei, double cost) {
        this.senderAddress = senderAddr;
        this.recipientAddress = recipientAddr;

        if (wei > 0.0 && cost > 0.0) {
            this.weight = wei;
            this.costPerOunce = cost;
        } else {
            this.weight = 0.0;
            this.costPerOunce = 0.0;
        }
    }

    public void setSenderAddress(String senderAddr) {
        this.senderAddress = senderAddr;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setRecipientAddress(String recipientAddr) {
        this.recipientAddress = recipientAddr;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setweight(double wei)
    {

        this.weight = wei;
    }

    public double getweight()
    {
        return weight;
    }

    public void setcostperounce(double cost)
    {

        this.costPerOunce = cost;
    }

    public double getcostperounce()
    {
        return costPerOunce;
    }

    public double calculateCost(double wei, double cost)
    {
        return wei * cost;
    }

    public String toString(){
        return "(" + senderAddress + ", " + recipientAddress + ", " + weight + ", " +costPerOunce +")";
    }
    public static void main(String[] args){
        Package p = new Package("ranger", "pooc", 12.2, 551.2) ;
        System.out.println(p);
    }


}

class TwoDayPackage extends Package{
    private double twoDayDeliveryFee;

    public TwoDayPackage(String senderAddr, String recipientAddr, double wei, double cost) {
        super(senderAddr, recipientAddr, wei, cost);
    }


    public double getTwoDayDeliveryFee()
    {
        return twoDayDeliveryFee;
    }

    public void setTwoDayDeliveryFee(double twoDayFee)
    {
        this.twoDayDeliveryFee = twoDayFee;
    }

    public double calculateCost()
    {
        double result;
        result = super.calculateCost(getweight(),getcostperounce()) + twoDayDeliveryFee;
        return result;
    }
}

class OvernightPackage extends Package{
    private double overnightDeliveryFee;

    public OvernightPackage(String senderAddr, String recipientAddr, double wei, double cost) {
        super(senderAddr, recipientAddr, wei, cost);
    }

    public double getOvernightDeliveryFee()
    {
        return overnightDeliveryFee;
    }

    public void setOvernightDeliveryFee(double overnightDeliveryFee)
    {
        this.overnightDeliveryFee = overnightDeliveryFee;
    }

    public double calculateCost()
    {
        double result;
        result = super.calculateCost(getweight(),getcostperounce()) + overnightDeliveryFee;
        return result;
    }
}







