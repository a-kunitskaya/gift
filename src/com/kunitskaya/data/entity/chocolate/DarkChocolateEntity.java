package com.kunitskaya.data.entity.chocolate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DarkChocolate")
@XmlAccessorType(XmlAccessType.FIELD)
public class DarkChocolateEntity extends ChocolateEntity {

    @XmlElement(name = "IsBitter")
    private boolean isBitter;

    public boolean isBitter() {
        return isBitter;
    }

    public void setBitter(boolean bitter) {
        isBitter = bitter;
    }
}