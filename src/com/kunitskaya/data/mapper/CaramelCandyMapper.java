package com.kunitskaya.data.mapper;

import com.kunitskaya.data.entity.candy.CaramelCandyEntity;
import com.kunitskaya.domain.candy.CaramelCandy;

public class CaramelCandyMapper extends Mapper <CaramelCandy, CaramelCandyEntity> {
    @Override
    public CaramelCandy map(CaramelCandyEntity caramelCandyEntity) {
        return new CaramelCandy.CaramelCandyBuilder()
                .price(caramelCandyEntity.getPrice())
                .countryOfOrigin(caramelCandyEntity.getCountryOfOrigin())
                .weight(caramelCandyEntity.getWeight())
                .size(caramelCandyEntity.getSize())
                .flavor(caramelCandyEntity.getFlavor())
                .isLollipop(caramelCandyEntity.isLollipop())
                .build();
    }
}
