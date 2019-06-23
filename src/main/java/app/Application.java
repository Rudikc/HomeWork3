package app;

import properties.AgeGroup;
import properties.ToySize;
import toys.*;

import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        Playroom playroom = new Playroom(3100);

        Ball ball1 = new Ball("Basketball", 20, 350, ToySize.MEDIUM, AgeGroup.YOUNGTEEN);
        Ball ball2 = new Ball("Football", 20, 450, ToySize.MEDIUM, AgeGroup.YOUNGTEEN);
        Doll doll = new Doll("White", "Barbie", 250, ToySize.SMALL, AgeGroup.MIDDLECHILD);
        Puzzles puzzles = new Puzzles(3000, ToySize.LARGE, 1299, AgeGroup.YOUNGTEEN);
        Car car = new Car("Black", 100, ToySize.SMALL, AgeGroup.PRESCHOOLER);
        Car car2 = new Car("White", 500, ToySize.MEDIUM, AgeGroup.MIDDLECHILD);
        Car car3 = new Car("Yellow", 2000, ToySize.LARGE, AgeGroup.YOUNGTEEN);

        playroom.addToy(ball1);
        playroom.addToy(ball2);
        playroom.addToy(doll);
        playroom.addToy(puzzles);
        playroom.addToy(car);
        playroom.addToy(car2);
        playroom.addToy(car3);
        playroom.addMoney(2000);
        playroom.addToy(car3);

        System.out.println("\n\u001b[33mBefore sort:\u001b[0m");
        for (Toy toy : playroom.getToys()) {
            System.out.println(toy.toString());
        }

        System.out.println("\n\u001b[33mAfter sort by age group:\u001b[0m");
        Collections.sort(playroom.getToys());
        for (Toy toy :
                playroom.getToys()) {
            System.out.println(toy);
        }

        System.out.println("\n\u001b[33mSearching for toys in range from 1000 to 3000\u001b[0m");
        for (Toy toy :
                playroom.getToysForPrice(1000, 3000)) {
            System.out.println(toy);
        }
    }

}
