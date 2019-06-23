package toys;

import app.Playroom;
import properties.AgeGroup;
import properties.ToySize;

import java.util.*;

public abstract class Toy implements Comparable<Toy> {

    private double price;
    private ToySize size;
    private AgeGroup ageGroup;


    public ToySize getSize() {
        return size;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Toy toy) {

        return (this.ageGroup.ordinal() < toy.ageGroup.ordinal()) ? -1 :
                ((this.ageGroup.ordinal() == toy.ageGroup.ordinal()) ? 0 : 1);
    }

    public Toy(double price, ToySize size, AgeGroup ageGroup) {
        this.price = price;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "price=" + price +
                ", size=" + size +
                ", ageGroup=" + ageGroup +
                '}';
    }
}
