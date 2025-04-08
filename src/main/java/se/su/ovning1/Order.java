package se.su.ovning1;

import java.util.ArrayList;
import java.util.Arrays;

public class Order{

    final long orderNumber;
    static long counter;
    private final ArrayList<Item> orderList;

    public Order(Item... Item){
        this.orderList = new ArrayList<>(Arrays.asList(Item));

    }

    public String getReceipt(){
        return "receipt";
    }

    public double getTotalValuePlusVAT(){
        return 12;
    }

    public double getTotalValue(){
        return 10;
    }
}
