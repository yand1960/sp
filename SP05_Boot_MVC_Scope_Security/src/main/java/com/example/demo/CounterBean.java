package com.example.demo;

import org.springframework.context.annotation.Scope;

public class CounterBean {
    private int counter = 0;

    public int incAndGet() {
        counter += 1;
        return counter;
    }
}
