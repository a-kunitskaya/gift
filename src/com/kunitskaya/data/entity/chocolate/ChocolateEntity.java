package com.kunitskaya.data.entity.chocolate;

import com.kunitskaya.data.entity.SweetEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Chocolate")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChocolateEntity extends SweetEntity {

    @XmlElement(name = "CocoaPercentage")
    private int cocoaPercentage;

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }
}
