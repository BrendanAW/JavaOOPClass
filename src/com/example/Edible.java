package com.example;

import com.example.Creature.Animal;

public interface Edible {
    void eat(Animal animal) throws Exception;
    void beEaten();
}
