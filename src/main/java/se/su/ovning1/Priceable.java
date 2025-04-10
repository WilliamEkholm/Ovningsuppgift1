package se.su.ovning1;

public interface Priceable {

    double getPrice();

    double getVAT();

    default double getPriceWithVAT(){
        double price = getPrice();
        return price + (price * getVAT());
    }
}