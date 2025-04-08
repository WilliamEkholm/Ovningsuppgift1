package se.su.ovning1;
import java.time.LocalDate;

public class LongPlay extends Recording{

    int currentYear = LocalDate.now().getYear();


    public LongPlay(String name, String artist, int year, int condition, double price){
        super (name, artist, year, condition, price);
    }
    @Override
    public String getType (){
        return "LP";
    }

    @Override
    public double getPrice(){
        return super.getPrice() + ((currentYear - super.getYear()) * 5);
    }
}