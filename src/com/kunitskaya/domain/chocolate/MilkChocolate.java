package com.kunitskaya.domain.chocolate;

import com.kunitskaya.domain.SweetCountryOfOrigin;

public class MilkChocolate extends Chocolate {
    private int milkPercentage;

    public static class MilkChocolateBuilder extends ChocolateBuilder {
        private int milkPercentage;

        public MilkChocolateBuilder price(double price) {
            super.price(price);
            return this;
        }

        public MilkChocolateBuilder weight(double weight) {
            super.weight(weight);
            return this;
        }

        public MilkChocolateBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            super.countryOfOrigin(countryOfOrigin);
            return this;
        }

        public MilkChocolateBuilder cocoaPercentage(int cocoaPercentage) {
            super.cocoaPercentage(cocoaPercentage);
            return this;
        }

        public MilkChocolateBuilder milkPercentage(int milkPercentage) {
            this.milkPercentage = milkPercentage;
            return this;
        }

        public MilkChocolate build() {
            return new MilkChocolate(this);
        }

    }

    public MilkChocolate(MilkChocolateBuilder builder) {
        super(builder);
        this.milkPercentage = builder.milkPercentage;
    }

    public int getMilkPercentage() {
        return milkPercentage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "MilkChocolate{" +
                "milkPercentage=" + milkPercentage +
                '}';
    }
}
