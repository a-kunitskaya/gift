package com.kunitskaya.data.entity.candy;

import com.kunitskaya.domain.candy.CaramelCandyFlavor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CaramelCandy")
@XmlAccessorType(XmlAccessType.FIELD)
public class CaramelCandyEntity extends CandyEntity {

    @XmlElement(name = "Flavor")
    private CaramelCandyFlavor flavor;

    @XmlElement(name = "isLollipop")
    private boolean isLollipop;

    public CaramelCandyFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(CaramelCandyFlavor flavor) {
        this.flavor = flavor;
    }

    public boolean isLollipop() {
        return isLollipop;
    }

    public void setLollipop(boolean lollipop) {
        isLollipop = lollipop;
    }

}
