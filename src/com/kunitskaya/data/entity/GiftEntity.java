package com.kunitskaya.data.entity;

import com.kunitskaya.data.entity.candy.CandyEntity;
import com.kunitskaya.data.entity.candy.CaramelCandyEntity;
import com.kunitskaya.data.entity.chocolate.ChocolateEntity;
import com.kunitskaya.data.entity.chocolate.DarkChocolateEntity;
import com.kunitskaya.data.entity.chocolate.MilkChocolateEntity;
import com.kunitskaya.data.entity.marmalade.MarmaladeEntity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.FIELD)
public class GiftEntity {

    @XmlElementWrapper(name = "Gift")
    @XmlElements({
            @XmlElement(name = "Chocolate", type = ChocolateEntity.class),
            @XmlElement(name = "DarkChocolate", type = DarkChocolateEntity.class),
            @XmlElement(name = "Marmalade", type = MarmaladeEntity.class),
            @XmlElement(name = "MilkChocolate", type = MilkChocolateEntity.class),
            @XmlElement(name = "Candy", type = CandyEntity.class),
            @XmlElement(name = "CaramelCandy", type = CaramelCandyEntity.class)
    })
    private ArrayList<SweetEntity> sweets;

    public ArrayList<SweetEntity> getSweets() {
        return sweets;
    }

    public void setSweets(ArrayList<SweetEntity> sweets) {
        this.sweets = sweets;
    }

}
