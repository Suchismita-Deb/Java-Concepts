package com.teach.a4_designPatterns.behavioural.strategy.thehardway;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class IndianSort implements Strategy{

    @Override
    public <T> void sort(List<T> list) {
        System.out.println("Indian Sort :: " + list.getClass());
    }
}