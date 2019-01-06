package com.kunitskaya.data.entity.candy;

import com.kunitskaya.data.entity.SweetEntity;
import com.kunitskaya.domain.candy.CandySize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Candy")
@XmlAccessorType(XmlAccessType.FIELD)
public class CandyEntity extends SweetEntity {

    @XmlElement(name = "Size")
    private CandySize size;

    public CandySize getSize() {
        return size;
    }

    public void setSize(CandySize size) {
        this.size = size;
    }
}
