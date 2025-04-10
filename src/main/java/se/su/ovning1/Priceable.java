package se.su.ovning1;

public interface Priceable {

    double getPrice();

    double getVAT();

    default double getPriceWithVAT(){
        return (1 + getVAT()) * getPrice();

    }
}