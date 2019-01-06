package com.kunitskaya.domain;

import java.util.ArrayList;
import java.util.Comparator;

public class Gift {
    private ArrayList<Sweet> sweets = new ArrayList<>();
    private double weight;

    public ArrayList<Sweet> getSweets() {
        return sweets;
    }

    public double getWeight() {
        return weight;
    }

    public void setSweets(ArrayList<Sweet> sweets) {
        this.sweets = sweets;
        this.recalculateWeight();
    }

    /**
     * Get a new list of Sweet instances sorted by price
     *
     * @return sorted list of Sweet instances
     */
    public ArrayList<Sweet> getSweetsSorted() {
        ArrayList<Sweet> sortedList = this.sweets;
        sortedList.sort(Comparator.comparingDouble(Sweet::getPrice));
        return sortedList;
    }

    /**
     * Add separate sweets objects to the list
     *
     * @param sweet - an instance of Sweet class
     */
    public void putSweets(Sweet... sweet) {
        for (Sweet item : sweet) {
            this.sweets.add(item);
        }
        this.recalculateWeight();
    }

    /**
     * Recalculate the total weight of all sweets
     * Should be always triggered when sweets are changed
     */

    private void recalculateWeight() {
        double sweetWeight;
        double giftWeight = 0.0;

        for (Sweet sweet : this.sweets) {
            sweetWeight = sweet.getWeight();
            giftWeight += sweetWeight;
        }

        this.weight = giftWeight;
    }

    /**
     * Get a Sweet instance from the list that
     * has the specified price and countryOfOrigin
     *
     * @param minPrice        - the expected min price
     * @param maxPrice        - the expected max price
     * @param countryOfOrigin - the expected countryOfOrigin
     * @return - a Sweet instance
     */
    public Sweet getSweetWithParameters(double minPrice, double maxPrice, SweetCountryOfOrigin countryOfOrigin) {
        Sweet sweetWithParameters = null;
        for (Sweet sweet : this.sweets) {
            if (sweet.getPrice() >= minPrice && sweet.getPrice() <= maxPrice) {
                if (sweet.getCountryOfOrigin() == countryOfOrigin) {
                    sweetWithParameters = sweet;
                }
            }
        }
        return sweetWithParameters;
    }
}
