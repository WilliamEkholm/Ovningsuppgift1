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
        double VATValue = 0;
        for (Item item : orderList){
            VATValue += item.getVAT();
        }
        return getTotalValue() + VATValue;
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Item items : orderList){
           totalValue += items.getPrice();
        }
        return totalValue;
    }
}
