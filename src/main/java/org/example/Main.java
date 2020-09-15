package org.example;

public class Main {
    public static void main(String[] args){
        PetShop shop = new PetShop();
        Man man = new Man("John Connor", 42);

        Animal cat = shop.getAnimal(AnimalType.CAT);
        Animal dog = shop.getAnimal(AnimalType.DOG);

        dog.setPrice(7);
        cat.setPrice(2);

        shop.sell(man, dog);
        shop.sell(man, cat);

    }
}
