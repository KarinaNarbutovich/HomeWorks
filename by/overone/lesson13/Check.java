package by.overone.lesson13;

import by.overone.lesson14.Person;

import java.math.BigDecimal;

public class Check {
    public static void main(String[] args) {
        Animal first = new Animal("Yasya", 4, false, 24);
        Animal second = new Animal("Yasya", 4, false, 24);
        Animal third = new Animal("Alma", 2, true, 22);
        System.out.println(first.toString() + second.toString() + third.toString());
        System.out.println("First&Second: " + first.equals(second) + "\nFirst&Third: " + first.equals(third));
        System.out.println("HashCode values: " + "\n" + first.hashCode() + "\n" + second.hashCode() + "\n" + third.hashCode());

    }

}

class Check2 {
    public static void main(String[] args)  {
        ArithOperation first = new ArithOperation();
        first.toString();
        first.sum(1111111111.00012524534501);
        BigDecimal argument3 = BigDecimal.valueOf(214647.50432523559);
        BigDecimal argument4 = BigDecimal.valueOf(1111111111.00012524534501);
        first.sum(argument3);
        first.sum(argument3, argument4);
        first.subtract(argument4);
        first.subtract(1111111111.00012524534501);
        first.subtract(argument4, 214647.50432523559);
        first.multiply(argument3, argument4);
        first.multiply(argument3);
        first.divide(argument3);
        first.divide(argument3, argument4);
    }
}
    class Check3 {
        public static void main(String[] args) throws Exception {
            Byte    countOfCat = new Byte((byte) 1);
            Person person=new Person("Olivia",35,false,countOfCat);
            Person personClone= (Person) person.clone();
            System.out.println("Person: "+person+"\nClone of Person: "+personClone+"\n"+person.equals(personClone));
}}
