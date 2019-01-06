package com.kunitskaya.data.entity.chocolate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MilkChocolate")
@XmlAccessorType(XmlAccessType.FIELD)
public class MilkChocolateEntity extends ChocolateEntity {

    @XmlElement(name = "MilkPercentage")
    private int milkPercentage;

    public int getMilkPercentage() {
        return milkPercentage;
    }

    public void setMilkPercentage(int milkPercentage) {
        this.milkPercentage = milkPercentage;
    }
}
