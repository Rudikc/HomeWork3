package toys;

import properties.AgeGroup;
import properties.ToySize;

public class Ball extends Toy {
    private String type;
    private double diameter;


    public Ball(String type, double diameter, double price, ToySize size, AgeGroup ageGroup) {
        super(price, size, ageGroup);
        this.type = type;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", diameter=" + diameter +
                "} " + super.toString();
    }
}
