package by.overone.lesson10;

/**
 * @author Karina Narbutovich
 */
public class Enemy implements Mortal {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
        System.out.println("damage of hero = " + damage + "\nhealth of enemy = " + health);

    }

    @Override
    public boolean isAlive() {
        System.out.println(health>0);
        return health < 0;
    }
    public void outPut(){
        if (health<=0){
            System.out.println("The enemy died");
        }
    }
}
