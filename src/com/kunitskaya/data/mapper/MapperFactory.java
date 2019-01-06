package com.kunitskaya.data.mapper;

import com.kunitskaya.data.entity.candy.CandyEntity;
import com.kunitskaya.data.entity.candy.CaramelCandyEntity;
import com.kunitskaya.data.entity.chocolate.ChocolateEntity;
import com.kunitskaya.data.entity.chocolate.DarkChocolateEntity;
import com.kunitskaya.data.entity.chocolate.MilkChocolateEntity;
import com.kunitskaya.data.entity.marmalade.MarmaladeEntity;

public class MapperFactory {
    public static Mapper getEntityToDomainMapper(Class associatedModelClass) {

        if (associatedModelClass == MarmaladeEntity.class) {
            return new MarmaladeMapper();
        }
        if (associatedModelClass == ChocolateEntity.class) {
            return new ChocolateMapper();
        }
        if (associatedModelClass == CandyEntity.class) {
            return new CandyMapper();
        }
        if (associatedModelClass == CaramelCandyEntity.class) {
            return new CaramelCandyMapper();
        }
        if (associatedModelClass == DarkChocolateEntity.class) {
            return new DarkChocolateMapper();
        }
        if (associatedModelClass == MilkChocolateEntity.class) {
            return new MilkChocolateMapper();
        }

        return null;
    }
}
