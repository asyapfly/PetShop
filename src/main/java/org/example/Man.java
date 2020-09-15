package org.example;
import lombok.Setter;

@Setter
public class Man {
    private final String name;
    private int age;
    private  Animal pet;
    private double balance;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 10;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public double getBalance() {
        return balance;
    }

   public void buyPet(Animal animal){

       if(animal.getPrice() < this.getBalance()){
           this.setPet(animal);
           this.setBalance(this.getBalance() - animal.getPrice());
           System.out.println(this.getName() + " buy this pet: " + animal.getName() + " from category: " + animal.getClass());
           System.out.println("Current balance: " + this.getBalance());
       }
       else{
           System.out.println(this.getName() + " does not have enough money to buy this pet: " + animal.getName() + " from category: " + animal.getClass() + ":(" );
       }

       //System.out.println(name + " buy " + pet.toString() + '\'');
   }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
