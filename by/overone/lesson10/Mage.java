package by.overone.lesson10;

/**
 * @author Karina Narbutovich
 */
public class Mage extends Hero {
    private String nameOfMage;
    private int healthOfMage;

    public int getHealthOfMage() {
        return healthOfMage;
    }

    public String getNameOfMage() {
        return nameOfMage;
    }

    public Mage(String nameOfMage,int healthOfMage) {
        this.nameOfMage = nameOfMage;
        this.healthOfMage = healthOfMage;
    }


    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(getNameOfMage() + " casts a spell");
        damage.takeDamage(40);

    }

}
