package com.kunitskaya.data;

import com.kunitskaya.domain.Sweet;

import java.util.List;


public interface BaseRepository {
    List<Sweet> readSweets();
}
