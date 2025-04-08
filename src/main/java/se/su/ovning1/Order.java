package se.su.ovning1;

import java.util.ArrayList;
import java.util.Arrays;

public class Order{

    final long orderNumber;
    private static long counter = 1;
    private final ArrayList<Item> orderList;

    public Order(Item... items){
        this.orderList = new ArrayList<>(Arrays.asList(items));
        this.orderNumber = counter++;

    }

    public String getReceipt(){
        return "receipt";
    }

    public double getTotalValuePlusVAT(){ return 10;
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Item items : orderList){
           totalValue += items.getPrice();
        }
        return totalValue;
    }
}
