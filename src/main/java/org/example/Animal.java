package org.example;

import lombok.Getter;

@Getter

public abstract class Animal implements IVoice{
    protected final String name;
    protected int age;
    protected double price;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void voice(byte animalFood);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

}
