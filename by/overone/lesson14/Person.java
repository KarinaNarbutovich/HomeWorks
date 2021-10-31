package by.overone.lesson14;

import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;
    private boolean angry;
    private Byte countOfCat;


    public Person(String name, int age, boolean angry,Byte countOfCat) {
        this.name = name;
        this.age = age;
        this.angry = angry;
        this.countOfCat = countOfCat;
    }

    public Person() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name of Person: " + name +
                "\nAge of Person: " + age +
                "\nIs this animal evil? " + angry +
                "\nA person has so many cats: " + countOfCat;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.age;
        result = 31 * result + this.countOfCat;
        result = 31 * result + (angry ? 1 : 0);
        result = 31 * result + (name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person person1 = (Person) obj;
        return this.angry == person1.angry && this.age == person1.age && this.name == person1.name && this.countOfCat== person1.countOfCat;

    }

}
