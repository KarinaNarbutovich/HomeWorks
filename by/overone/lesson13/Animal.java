package by.overone.lesson13;

import java.util.Objects;

public class Animal {
    private int countOfPaws;
    private int id;
    private boolean angry;
    private String name;


    public Animal(String name, int countOfPaws, boolean angry, int id) {
        this.name = name;
        this.countOfPaws = countOfPaws;
        this.angry = angry;
        this.id = id;

    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Name of animal: " + name +
                "\nCount of paws of animal: " + countOfPaws +
                "\nIs this animal evil? " + angry + "\nid: " + id+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if(null==obj){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Animal otherAnimal = (Animal) obj;
        return this.name == otherAnimal.name && this.id == otherAnimal.id && this.countOfPaws == otherAnimal.countOfPaws && this.angry == otherAnimal.angry;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.id;
        result = 31 * result + this.countOfPaws;
        result = 31 * result + (angry ? 1 : 0);
        result = 31 * result + (name == null ? 0 : name.hashCode());
        return result;
    }


}
