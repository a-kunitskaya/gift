package com.kunitskaya.data.mapper;

import com.kunitskaya.data.entity.chocolate.DarkChocolateEntity;
import com.kunitskaya.domain.chocolate.DarkChocolate;

public class DarkChocolateMapper extends Mapper<DarkChocolate, DarkChocolateEntity> {
    @Override
    public DarkChocolate map(DarkChocolateEntity darkChocolateEntity) {
        return new DarkChocolate.DarkChocolateBuilder()
                .price(darkChocolateEntity.getPrice())
                .countryOfOrigin(darkChocolateEntity.getCountryOfOrigin())
                .weight(darkChocolateEntity.getWeight())
                .cocoaPercentage(darkChocolateEntity.getCocoaPercentage())
                .isBitter(darkChocolateEntity.isBitter())
                .build();
    }
}
