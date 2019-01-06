package com.kunitskaya.data.mapper;

import com.kunitskaya.data.entity.marmalade.MarmaladeEntity;
import com.kunitskaya.domain.marmalade.Marmalade;

public class MarmaladeMapper extends Mapper <Marmalade, MarmaladeEntity> {

    @Override
    public Marmalade map(MarmaladeEntity marmaladeEntity) {
        return new Marmalade.MarmaladeBuilder()
                .price(marmaladeEntity.getPrice())
                .countryOfOrigin(marmaladeEntity.getCountryOfOrigin())
                .weight(marmaladeEntity.getWeight())
                .flavor(marmaladeEntity.getFlavor())
                .build();
    }
}
