package by.overone.lesson12;

import by.overone.lesson10.Enemy;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }


    public abstract void speak();
    public abstract void eat();
}
