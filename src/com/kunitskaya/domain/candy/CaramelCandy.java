package com.kunitskaya.domain.candy;

import com.kunitskaya.domain.SweetCountryOfOrigin;

public class CaramelCandy extends Candy {
    private CaramelCandyFlavor flavor;
    private boolean isLollipop;

    public static class CaramelCandyBuilder extends CandyBuilder {
        private CaramelCandyFlavor flavor;
        private boolean isLollipop;

        public CaramelCandyBuilder price(double price) {
            super.price(price);
            return this;
        }

        public CaramelCandyBuilder weight(double weight) {
            super.weight(weight);
            return this;
        }

        public CaramelCandyBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            super.countryOfOrigin(countryOfOrigin);
            return this;
        }

        public CaramelCandyBuilder size(CandySize size) {
            super.size(size);
            return this;
        }

        public CaramelCandyBuilder flavor(CaramelCandyFlavor flavor) {
            this.flavor = flavor;
            return this;
        }

        public CaramelCandyBuilder isLollipop(boolean isLollipop) {
            this.isLollipop = isLollipop;
            return this;
        }

        public CaramelCandy build() {
            return new CaramelCandy(this);
        }

    }

    public CaramelCandy(CaramelCandyBuilder builder) {
        super(builder);
        this.flavor = builder.flavor;
        this.isLollipop = builder.isLollipop;
    }

    public CaramelCandyFlavor getFlavor() {
        return flavor;
    }

    public boolean isLollipop() {
        return isLollipop;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CaramelCandy{" +
                "flavor=" + flavor +
                ", isLollipop=" + isLollipop +
                '}';
    }
}
