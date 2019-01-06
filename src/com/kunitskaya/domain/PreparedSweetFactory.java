package com.kunitskaya.domain;

import com.kunitskaya.domain.candy.CandySize;
import com.kunitskaya.domain.candy.CaramelCandy;
import com.kunitskaya.domain.candy.CaramelCandyFlavor;
import com.kunitskaya.domain.candy.ChocolateCandy;
import com.kunitskaya.domain.chocolate.DarkChocolate;
import com.kunitskaya.domain.chocolate.MilkChocolate;
import com.kunitskaya.domain.marmalade.Marmalade;
import com.kunitskaya.domain.marmalade.MarmaladeFruit;

public class PreparedSweetFactory {
    public static Sweet getPreparedSweet(Class sweetClass) throws IllegalArgumentException {
        if (sweetClass == CaramelCandy.class) {
            return new CaramelCandy.CaramelCandyBuilder()
                    .isLollipop(false)
                    .flavor(CaramelCandyFlavor.VANILLA)
                    .size(CandySize.SMALL)
                    .price(10.5)
                    .weight(1.5)
                    .countryOfOrigin(SweetCountryOfOrigin.BELARUS)
                    .build();
        } else if (sweetClass == ChocolateCandy.class) {
            return new ChocolateCandy.ChocolateCandyBuilder()
                    .isWithWaffles(true)
                    .isWithNuts(false)
                    .size(CandySize.BIG)
                    .price(15)
                    .weight(3)
                    .countryOfOrigin(SweetCountryOfOrigin.FRANCE)
                    .build();
        } else if (sweetClass == Marmalade.class) {
            return new Marmalade.MarmaladeBuilder()
                    .flavor(MarmaladeFruit.ORANGE)
                    .price(18.5)
                    .weight(5.5)
                    .countryOfOrigin(SweetCountryOfOrigin.FRANCE)
                    .build();
        } else if (sweetClass == DarkChocolate.class) {
            return new DarkChocolate.DarkChocolateBuilder()
                    .isBitter(true)
                    .cocoaPercentage(70)
                    .price(50)
                    .weight(100)
                    .countryOfOrigin(SweetCountryOfOrigin.BELGIUM)
                    .build();
        } else if (sweetClass == MilkChocolate.class) {
            return new MilkChocolate.MilkChocolateBuilder()
                    .milkPercentage(50)
                    .cocoaPercentage(40)
                    .price(33.5)
                    .weight(95)
                    .countryOfOrigin(SweetCountryOfOrigin.BELGIUM)
                    .build();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
