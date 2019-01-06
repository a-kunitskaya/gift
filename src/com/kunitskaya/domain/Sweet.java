package com.kunitskaya.domain;


public abstract class Sweet {
    private double price;
    private double weight;
    private SweetCountryOfOrigin countryOfOrigin;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public SweetCountryOfOrigin getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "price=" + price +
                ", weight=" + weight +
                ", countryOfOrigin=" + countryOfOrigin +
                '}';
    }
}
