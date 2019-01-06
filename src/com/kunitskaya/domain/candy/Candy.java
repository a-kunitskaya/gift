package com.kunitskaya.domain.candy;

import com.kunitskaya.domain.Sweet;
import com.kunitskaya.domain.SweetCountryOfOrigin;

public class Candy extends Sweet {
    private CandySize size;

    public static class CandyBuilder {
        private double price;
        private double weight;
        private SweetCountryOfOrigin countryOfOrigin;
        private CandySize size;

        public CandyBuilder price(double price) {
            this.price = price;
            return this;
        }

        public CandyBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public CandyBuilder countryOfOrigin(SweetCountryOfOrigin countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        public CandyBuilder size(CandySize size) {
            this.size = size;
            return this;
        }

        public Candy build() {
            return new Candy(this);
        }
    }

    public Candy(CandyBuilder builder) {
        this.setPrice(builder.price);
        this.setWeight(builder.weight);
        this.setCountryOfOrigin(builder.countryOfOrigin);
        this.setPrice(builder.price);
        this.size = builder.size;
    }

    public CandySize getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Candy{" +
                "size=" + size +
                '}';
    }
}