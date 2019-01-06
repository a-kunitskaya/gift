package com.kunitskaya.data.mapper;

import com.kunitskaya.data.entity.chocolate.MilkChocolateEntity;
import com.kunitskaya.domain.chocolate.MilkChocolate;

public class MilkChocolateMapper extends Mapper<MilkChocolate, MilkChocolateEntity> {
    @Override
    public MilkChocolate map(MilkChocolateEntity milkChocolateEntity) {
        return new MilkChocolate.MilkChocolateBuilder()
                .price(milkChocolateEntity.getPrice())
                .countryOfOrigin(milkChocolateEntity.getCountryOfOrigin())
                .weight(milkChocolateEntity.getWeight())
                .cocoaPercentage(milkChocolateEntity.getCocoaPercentage())
                .milkPercentage(milkChocolateEntity.getMilkPercentage())
                .build();
    }
}
