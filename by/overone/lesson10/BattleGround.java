package by.overone.lesson10;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy(100);

        Warrior firstNameOfWarrior = new Warrior("SuperMan",100);
        firstNameOfWarrior.attackEnemy(enemy1);
        enemy1.isAlive();
        Mage firstNameOfMage = new Mage("Merlin",140);
        firstNameOfMage.attackEnemy(enemy1);
        enemy1.isAlive();
        Archer firstNameOfArcher = new Archer("Lara Croft",120);
        firstNameOfArcher.attackEnemy(enemy1);
        enemy1.isAlive();
        enemy1.outPut();
    }
}