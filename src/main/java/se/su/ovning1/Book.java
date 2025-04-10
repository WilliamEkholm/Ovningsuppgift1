package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{

    private final double price;
    private final boolean bound;
    private final String author;

    public Book(String namn, String author, double price, boolean bound) {
        super (namn);
        this.price = price;
        this. bound = bound;
        this.author = author;
    }

    private boolean isBound(){
        return bound;
    }

    private String getAuthor(){
        return author;
    }

    public double getPrice(){
        double newPrice = price;
        if (bound) newPrice = price * 1.3;
        return newPrice;
    }

    @Override
    public String toString(){
        return getType() +  ":" + "name=" + "'" + getName() + "', " + "author=" + "'" + getAuthor() + "', " + "bound=" + isBound() + ", " + "price=" + getPrice() + ", " + "price+vat=" + getPriceWithVAT();
    }

    private String getType(){
        return "Book";
    }
}
