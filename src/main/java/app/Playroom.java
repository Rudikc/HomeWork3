package app;

import toys.Toy;

import java.util.ArrayList;

public class Playroom {

    private double budget;
    private double costOfToys = 0;
    private ArrayList<Toy> toys = new ArrayList<Toy>();

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public Playroom(double budget) {
        this.budget = budget;
    }

    public void addToy(Toy toy) {
        if (costOfToys + toy.getPrice() <= budget) {
            costOfToys += toy.getPrice();
            toys.add(toy);
            System.out.println("Toy added");
        } else {
            System.out.println("Sorry, you haven't enough money for that..");
        }
    }

    public ArrayList<Toy> getToysForPrice(double lower, double higher) {
        ArrayList<Toy> result = new ArrayList<Toy>();
        for (Toy toy : this.getToys()) {
            if (toy.getPrice() > lower && toy.getPrice() < higher) {
                result.add(toy);
            }
        }
        return result;
    }

    public void addMoney(double amount) {
        this.budget += amount;
    }

    public double getBudget() {
        return budget;
    }


    public void removeToy(Toy toy) {
        toys.remove(toy);
        costOfToys -= toy.getPrice();
    }
}
