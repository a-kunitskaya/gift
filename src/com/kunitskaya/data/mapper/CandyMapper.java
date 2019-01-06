package com.kunitskaya.data.mapper;

import com.kunitskaya.data.entity.candy.CandyEntity;
import com.kunitskaya.domain.candy.Candy;

public class CandyMapper extends Mapper<Candy, CandyEntity> {
    @Override
    public Candy map(CandyEntity candyEntity) {
        return new Candy.CandyBuilder()
                .price(candyEntity.getPrice())
                .countryOfOrigin(candyEntity.getCountryOfOrigin())
                .weight(candyEntity.getWeight())
                .size(candyEntity.getSize())
                .build();
    }
}
