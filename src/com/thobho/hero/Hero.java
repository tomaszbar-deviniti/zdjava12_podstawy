package com.thobho.hero;

import java.util.Objects;
import java.util.Scanner;

public class Hero {

    public static final int DEFAULT_HEALTH = 100;
    public static final String UNKNOWN_HERO_NAME = "Anonymous";

    private String name;
    private int health;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
    }

    public Hero() {
        this(UNKNOWN_HERO_NAME);
    }

    public String getName() {
        return name;
    }

    public String getUpperCaseName() {
        return name.toUpperCase();
    }

    public int getHealth() {
        return health;
    }


    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return health == hero.health &&
                Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health);
    }
}
