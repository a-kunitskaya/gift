package com.kunitskaya.domain.chocolate;

import com.kunitskaya.domain.Sweet;
import com.kunitskaya.domain.SweetCountryOfOrigin;

public class Chocolate extends Sweet {

    private int cocoaPercentage;

    public static class ChocolateBuilder {
        private double price;
        private double weight;
        private SweetCountryOfOrigin countryOfOrigin;
        private int cocoaPercentage;

        public ChocolateBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ChocolateBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public ChocolateBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        public ChocolateBuilder cocoaPercentage(int cocoaPercentage) {
            this.cocoaPercentage = cocoaPercentage;
            return this;
        }

        public Chocolate build() {
            return new Chocolate(this);
        }
    }

    public Chocolate(ChocolateBuilder builder) {
        this.setPrice(builder.price);
        this.setWeight(builder.weight);
        this.setCountryOfOrigin(builder.countryOfOrigin);
        this.setPrice(builder.price);
        this.cocoaPercentage = builder.cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Chocolate{" +
                "cocoaPercentage=" + cocoaPercentage +
                '}';
    }
}
