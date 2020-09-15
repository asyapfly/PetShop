package org.example;

public class PetShop {
    private Animal dog = new Dog("Rex", 5);
    private Animal cat = new Cat("Murzik", 22);

    public PetShop(){
        System.out.println("Welcome to out PetShop!");
        System.out.println("We have 1 cat and 1 dog");
    }

    public Animal getAnimal(AnimalType type){
        switch(type){
            case CAT:
                return cat;
            case DOG:
                return dog;
            default:
                throw new RuntimeException("wrong type of animal");
        }
    }

    public void sell(Man man, Animal animal){
        if(animal instanceof Cat){
            man.buyPet(animal);
            cat = null;
        }
        else if (animal instanceof Dog){
            man.buyPet(animal);
            dog = null;
        }
    }
}
