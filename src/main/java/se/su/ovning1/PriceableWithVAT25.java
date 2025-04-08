package se.su.ovning1;

public interface PriceableWithVAT25 extends Priceable {
    double VAT25 = 0.25;

    @Override
    default double getVAT(){
        return VAT25;
    }
}
