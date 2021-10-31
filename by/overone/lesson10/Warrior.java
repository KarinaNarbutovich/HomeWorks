package by.overone.lesson10;

/**
 * @author Karina Narbutovich
 */
public class Warrior extends Hero {
    private String nameOfWarrior;
    private int healthOfWarrior;

    public int getHealthOfWarrior() {
        return healthOfWarrior;
    }

    public String getNameOfWarrior() {
        return nameOfWarrior;
    }

    public Warrior(String nameOfWarrior,int healthOfWarrior) {
        this.nameOfWarrior = nameOfWarrior;
        this.healthOfWarrior=healthOfWarrior;
    }

    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(getNameOfWarrior() + " hits the enemy");
        damage.takeDamage(30);

    }

}
