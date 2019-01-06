package com.kunitskaya.domain.marmalade;

import com.kunitskaya.domain.Sweet;
import com.kunitskaya.domain.SweetCountryOfOrigin;

public class Marmalade extends Sweet {
    private MarmaladeFruit flavor;

    public static class MarmaladeBuilder {
        private double price;
        private double weight;
        private SweetCountryOfOrigin countryOfOrigin;
        private MarmaladeFruit flavor;

        public MarmaladeBuilder price(double price) {
            this.price = price;
            return this;
        }

        public MarmaladeBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public MarmaladeBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        public MarmaladeBuilder flavor(MarmaladeFruit flavor) {
            this.flavor = flavor;
            return this;
        }

        public Marmalade build() {
            return new Marmalade(this);
        }
    }

    public Marmalade(MarmaladeBuilder builder) {
        this.setPrice(builder.price);
        this.setWeight(builder.weight);
        this.setCountryOfOrigin(builder.countryOfOrigin);
        this.flavor = builder.flavor;
    }

    public MarmaladeFruit getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Marmalade{" +
                "flavor=" + flavor +
                '}';
    }
}
