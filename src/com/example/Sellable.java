package com.example;

public interface Sellable {
    void sell() throws Exception;

    void buy(Object obj, Object obj2, double price) throws Exception;
}
