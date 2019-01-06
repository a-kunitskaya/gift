package com.kunitskaya.domain.candy;

import com.kunitskaya.domain.SweetCountryOfOrigin;

public class ChocolateCandy extends Candy {
    private boolean isWithWaffles;
    private boolean isWithNuts;

    public static class ChocolateCandyBuilder extends CandyBuilder {
        private boolean isWithWaffles;
        private boolean isWithNuts;

        public ChocolateCandyBuilder price(double price) {
            super.price(price);
            return this;
        }

        public ChocolateCandyBuilder weight(double weight) {
            super.weight(weight);
            return this;
        }

        public ChocolateCandyBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            super.countryOfOrigin(countryOfOrigin);
            return this;
        }

        public ChocolateCandyBuilder size(CandySize size) {
            super.size(size);
            return this;
        }

        public ChocolateCandyBuilder isWithWaffles(boolean isWithWaffles) {
            this.isWithWaffles = isWithWaffles;
            return this;
        }

        public ChocolateCandyBuilder isWithNuts(boolean isWithNuts) {
            this.isWithNuts = isWithNuts;
            return this;
        }

        public ChocolateCandy build() {
            return new ChocolateCandy(this);
        }
    }

    public ChocolateCandy(ChocolateCandyBuilder builder) {
        super(builder);
        this.isWithWaffles = builder.isWithWaffles;
        this.isWithNuts = builder.isWithNuts;
    }

    public boolean isWithWaffles() {
        return isWithWaffles;
    }

    public boolean isWithNuts() {
        return isWithNuts;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ChocolateCandy{" +
                "isWithWaffles=" + isWithWaffles +
                ", isWithNuts=" + isWithNuts +
                '}';
    }
}
