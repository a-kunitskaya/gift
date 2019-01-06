package com.kunitskaya.data.entity.marmalade;

import com.kunitskaya.data.entity.SweetEntity;
import com.kunitskaya.domain.marmalade.MarmaladeFruit;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Marmalade")
@XmlAccessorType(XmlAccessType.FIELD)
public class MarmaladeEntity extends SweetEntity {

    @XmlElement(name = "Flavor")
    private MarmaladeFruit flavor;

    public MarmaladeFruit getFlavor() {
        return flavor;
    }

    public void setFlavor(MarmaladeFruit flavor) {
        this.flavor = flavor;
    }
}
