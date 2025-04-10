package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25{

    private final String artist;
    private final int year;
    private int condition;
    private final double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super (name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist(){
        return artist;
    }

    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    @Override
    public double getPrice(){
        double newPrice = condition * price / 10;
        return (newPrice <= 10) ? 10 : newPrice;
    }
    @Override
    public String toString(){
        return getType() + ":" + "name=" + getName() + ", " + "artist=" + getArtist() + ", " + "year=" + getYear() + ", " + "condition=" + getCondition() + ", " + "orgininal price=" + getOriginalPrice() + ", " + "price=" + getPrice() + ", " + "price+vat=" + getPriceWithVAT();
    }

    public int getYear(){
        return year;
    }

    public double getVAT(){
        return VAT25;
    }
    protected double getOriginalPrice(){
        return price;
    }
}