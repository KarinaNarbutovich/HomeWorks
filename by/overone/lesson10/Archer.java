package by.overone.lesson10;

/**
 * @author Karina Narbutovich
 */
public class Archer extends Hero {
    private String nameOfArcher;
    private int healthOfArcher;

    public int getHealthOfArcher() {
        return healthOfArcher;
    }

    public String getNameOfArcher() {
        return nameOfArcher;
    }

    public Archer(String nameOfArcher,int healthOfArcher) {
        this.nameOfArcher = nameOfArcher;
        this.healthOfArcher=healthOfArcher;
    }

    @Override
    public void attackEnemy(Enemy damage) {
        System.out.println(getNameOfArcher() + " shoots at the enemy");
        damage.takeDamage(50);

    }

}