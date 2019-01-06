package com.kunitskaya.data.mapper;

import com.kunitskaya.domain.chocolate.Chocolate;
import com.kunitskaya.data.entity.chocolate.ChocolateEntity;

public class ChocolateMapper extends Mapper <Chocolate, ChocolateEntity> {

    @Override
    public Chocolate map(ChocolateEntity chocolateEntity) {
        return new Chocolate.ChocolateBuilder()
                .price(chocolateEntity.getPrice())
                .countryOfOrigin(chocolateEntity.getCountryOfOrigin())
                .weight(chocolateEntity.getWeight())
                .cocoaPercentage(chocolateEntity.getCocoaPercentage())
                .build();
    }
}
