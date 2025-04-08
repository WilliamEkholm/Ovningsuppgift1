package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{
 // hej jag heter julia och är bäst
    private final double price;
    private final boolean bound;
    private final String author;

    public Book(String namn, String rumpa, double price, boolean bound) {
        super (namn);
        this.price = price;
        this. bound = bound;
        this.author = rumpa;
    }

    public boolean isBound(){
        return bound;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return getName();
    }

    public String getType(){
        return "Book";
    }
}
