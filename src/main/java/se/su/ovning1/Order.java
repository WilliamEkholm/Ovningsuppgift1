package se.su.ovning1;

import java.util.ArrayList;
import java.util.Arrays;

public class Order{

    private static long counter;
    final long orderNumber;
    private final ArrayList<Item> orderList;

    public Order(Item... item){
        this.orderList = new ArrayList<>(Arrays.asList(item));
        this.orderNumber = counter++;

    }

    public String getReceipt(){
        StringBuilder receipt = new StringBuilder();
        receipt.append("Order #").append(orderNumber).append("\nItems:\n");
        for (Item item : orderList){
            receipt.append("- ").append(item.toString()).append("\n");
        }
        receipt.append(String.format("Total (excl.VAT): %.2f\n", getTotalValue()));
        receipt.append(String.format("Total (incl VAT): %.2f\n", getTotalValuePlusVAT()));
        return receipt.toString();
    }

    public double getTotalValuePlusVAT(){
        double value = 0;
        for (Item item : orderList){
            value += item.getPriceWithVAT();
        }
        return value;
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Item items : orderList){
           totalValue += items.getPrice();
        }
        return totalValue;
    }
}
