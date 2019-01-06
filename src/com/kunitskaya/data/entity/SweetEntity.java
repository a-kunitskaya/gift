package com.kunitskaya.data.entity;

import com.kunitskaya.domain.SweetCountryOfOrigin;

import javax.xml.bind.annotation.*;

@XmlTransient
public class SweetEntity {

    @XmlElement(name = "Price")
    private double price;

    @XmlElement(name = "Weight")
    private double weight;

    @XmlElement(name = "CountryOfOrigin")
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
}
