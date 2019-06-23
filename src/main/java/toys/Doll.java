package toys;

import properties.AgeGroup;
import properties.ToySize;

public class Doll extends Toy {

    private String skinColor;
    private String name;

    public Doll(String skinColor, String name, double price, ToySize toySize, AgeGroup ageGroup) {
        super(price, toySize, ageGroup);
        this.skinColor = skinColor;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doll{" +
                "skinColor='" + skinColor + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
