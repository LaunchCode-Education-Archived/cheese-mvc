package org.launchcode.models;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    // add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    // remove
    public static void remove(int id) {
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }

    // getById
    public static Cheese getById(int id) {

        Cheese theCheese = null;

        for (Cheese candidateCheese : cheeses) {
            if (candidateCheese.getCheeseId() == id) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }

}
