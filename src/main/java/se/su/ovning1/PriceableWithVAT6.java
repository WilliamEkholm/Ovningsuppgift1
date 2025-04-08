package se.su.ovning1;

public interface PriceableWithVAT6 extends Priceable{
    double VAT6 = 0.06;

    @Override
    default double getVAT(){
        return VAT6;

    }
}
