package by.overone.lesson10;

/**
 * @author Karina Narbutovich
 */
public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy(100);
        Enemy enemy2=new Enemy(115);
        Enemy enemy3=new Enemy(120);

        Warrior firstNameOfWarrior = new Warrior("SuperMan",100);
        firstNameOfWarrior.attackEnemy(enemy1);
        enemy1.isAlive();
        Mage firstNameOfMage = new Mage("Merlin",140);
        firstNameOfMage.attackEnemy(enemy2);
        enemy2.isAlive();
        Archer firstNameOfArcher = new Archer("Lara Croft",120);
        firstNameOfArcher.attackEnemy(enemy3);
        enemy3.isAlive();




    }
}
