package toys;

import properties.AgeGroup;
import properties.ToySize;

public class Car extends Toy {
    private String color;


    public Car(String color, double price, ToySize size, AgeGroup ageGroup) {
        super(price, size, ageGroup);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
