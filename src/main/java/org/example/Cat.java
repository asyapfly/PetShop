package org.example;


public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("Мяяяяууу");
    }

    public void voice(byte catFood){
        if(catFood < 2){
            voice();
        }else {
            System.out.println("........");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
