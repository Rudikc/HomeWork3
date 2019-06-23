package toys;

import properties.AgeGroup;
import properties.ToySize;

public class Puzzles extends Toy {

    private int quantityOfPieces;

    public Puzzles(int quantityOfPieces, ToySize size, double price, AgeGroup ageGroup) {
        super(price, size, ageGroup);
        this.quantityOfPieces = quantityOfPieces;

    }

    @Override
    public String toString() {
        return "Puzzles{" +
                "quantityOfPieces=" + quantityOfPieces +
                "} " + super.toString();
    }
}
