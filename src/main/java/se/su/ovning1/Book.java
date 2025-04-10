package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{
    private static double BOUND_EXTRA = 1.3;
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

    @Override
    public double getPrice(){
        return bound ? price * BOUND_EXTRA : price;
    }

    @Override
    public String toString(){
        return getType() +  ":" + "name=" + "'" + getName() + "', " + "author=" + "'" + getAuthor() + "', " + "bound=" + isBound() + ", " + "price=" + getPrice() + ", " + "price+vat=" + getPriceWithVAT();
    }

    private String getType(){
        return "Book";
    }
}
