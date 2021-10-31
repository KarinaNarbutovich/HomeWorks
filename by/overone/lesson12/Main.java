package by.overone.lesson12;

import by.overone.lesson12.Task3.Store;

public class Main {
    public static void main(String[] args) {
        Student person = new Student();
        person.outPut();


        Animal firstDog = new Dog();
        firstDog.eat();
        firstDog.speak();

        Store first = new Store("Mila");
        Store second = new Store("Moskovskaya,7", "Ostrov");
        first.setName("luk");
        first.setAddress("mogilev");
        System.out.println(" Address of store - "+first.getAddress()+" Name of store -  "+first.getName());
    }
}
