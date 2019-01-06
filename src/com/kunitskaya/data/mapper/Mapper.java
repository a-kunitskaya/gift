package com.kunitskaya.data.mapper;

public abstract class Mapper <To, From> {
    public abstract To map(From from);
}
