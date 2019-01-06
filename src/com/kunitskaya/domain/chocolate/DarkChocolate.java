package com.kunitskaya.domain.chocolate;

import com.kunitskaya.domain.SweetCountryOfOrigin;

public class DarkChocolate extends Chocolate {
    private boolean isBitter;

    public static class DarkChocolateBuilder extends ChocolateBuilder {
        private boolean isBitter;

        public DarkChocolateBuilder price(double price) {
            super.price(price);
            return this;
        }

        public DarkChocolateBuilder weight(double weight) {
            super.weight(weight);
            return this;
        }

        public DarkChocolateBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            super.countryOfOrigin(countryOfOrigin);
            return this;
        }

        public DarkChocolateBuilder cocoaPercentage(int cocoaPercentage) {
            super.cocoaPercentage(cocoaPercentage);
            return this;
        }

        public DarkChocolateBuilder isBitter(boolean isBitter) {
            this.isBitter = isBitter;
            return this;
        }

        public DarkChocolate build() {
            return new DarkChocolate(this);
        }
    }

    public DarkChocolate(DarkChocolateBuilder builder) {
        super(builder);
        this.isBitter = builder.isBitter;
    }

    public boolean isBitter() {
        return isBitter;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DarkChocolate{" +
                "isBitter=" + isBitter +
                '}';
    }
}
