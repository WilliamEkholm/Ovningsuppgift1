package se.su.ovning1;

import java.util.ArrayList;
import java.util.Arrays;

public class Order{

    final long orderNumber;
    private static long counter = 1;
    private final ArrayList<Item> orderList;

    public Order(Item... item){
        this.orderList = new ArrayList<>(Arrays.asList(item));
        this.orderNumber = counter++;

    }

    public String getReceipt(){
        return "receipt";
    }

    public double getTotalValuePlusVAT(){
        double price = 0;
        double VATValue = 0;
        for (Item item : orderList){
            price += item.getPrice();
            VATValue += item.getVAT();
        }
        return price + VATValue;
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Item items : orderList){
           totalValue += items.getPrice();
        }
        return totalValue;
    }
}
