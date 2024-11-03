package Game;

import ChooseClass.Archer;
import ChooseClass.Warrior;
import ChooseClass.Wizard;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GameConfig
{
    private Archer archer;
    private Warrior warrior;
    private Wizard wizard;

    public GameConfig(Archer archer, Warrior warrior, Wizard wizard)
    {
        this.archer = archer;
        this.warrior = warrior;
        this.wizard = wizard;
    }

    public void startGame() {
        boolean value = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to medieval warfare!");
        System.out.println("You are in control of all the characters...");
        playerChoice();
        while(!value)
        {
            System.out.println("Enter attacker and defender (separated by space):");
            String chosenStriker = input.next();
            String chosenDefender = input.next();

            System.out.println("Attacker: " + chosenStriker + " | Defender: " + chosenDefender);

            if(chosenStriker.equals("Archer") && chosenDefender.equals("Warrior"))
            {
                var hitTheAttack = hitAttackChance();
                var damageAgainstEnemy = damageToEnemy();
                int valDefense = warrior.getDefenseVal();
                int valLife = warrior.get_lifePointsVal();

                if (hitTheAttack > valDefense)
                {
                    archer.atack();
                    if (valLife > 0) {
                        if (damageAgainstEnemy < 1)
                        {
                            System.out.println("The Archer missed the attack!");
                        }
                        else if (damageAgainstEnemy > 1)
                        {
                            warrior.reducelife(damageAgainstEnemy);
                            System.out.println("Archer gave " + damageAgainstEnemy + " to the Warrior.");
                            var damage = damageAgainstEnemy;
                            valLife -= damage;
                            System.out.println("Archer's remaining health: " + valLife );
                            if (damageAgainstEnemy > valLife)
                            {

                                System.out.println("The Archer killed the Warrior!");
                            }
                        }
                        else
                        {
                            System.out.println("The Archer missed the attack!");
                        }
                    }
                    else{
                        System.out.println("the Warrior is already dead!");
                    }
                }
            }
            else if (chosenStriker.equals("Archer") && chosenDefender.equals("Wizard"))
            {
                var hitTheAttack = hitAttackChance();
                var damageAgainstEnemy = damageToEnemy();
                int valDefense = wizard.getDefenseVal();
                int valLife = wizard.get_lifePointsVal();
                if (hitTheAttack > valDefense)
                {
                    archer.atack();
                    if (valLife > 0) {
                        if (damageAgainstEnemy < 1)
                        {
                            System.out.println("The Archer missed the attack!");
                        }
                        else if (damageAgainstEnemy > 1)
                        {
                            wizard.reducelife(damageAgainstEnemy);
                            System.out.println("Archer gave " + damageAgainstEnemy + " to the Wizard.");
                            var damage = damageAgainstEnemy;
                            valLife -= damage;
                            System.out.println("Wizard's remaining health: " + valLife );
                            if (damageAgainstEnemy > valLife)
                            {

                                System.out.println("The Archer killed the Wizard!");
                            }
                        }
                        else
                        {
                            System.out.println("The Archer missed the attack!");
                        }
                    }
                    else{
                        System.out.println("the Wizard is already dead!");
                    }
                }
            }
            else if (chosenStriker.equals("Warrior") && chosenDefender.equals("Archer"))
            {
                var hitTheAttack = hitAttackChance();
                var damageAgainstEnemy = damageToEnemy();
                int valDefense = archer.getDefenseVal();
                int valLife = archer.get_lifePointsVal();
                if (hitTheAttack > valDefense)
                {
                    warrior.atack();
                    if (valLife > 0) {
                        if (damageAgainstEnemy < 1)
                        {
                            System.out.println("The Warrior missed the attack!");
                        }
                        else if (damageAgainstEnemy > 1)
                        {
                            archer.reducelife(damageAgainstEnemy);
                            System.out.println("Warrior gave " + damageAgainstEnemy + " to the Archer.");
                            var damage = damageAgainstEnemy;
                            valLife -= damage;
                            System.out.println("Warrior's remaining health: " + valLife );
                            if (damageAgainstEnemy > valLife)
                            {
                                System.out.println("The Warrior killed the archer!");
                            }
                        }
                        else
                        {
                            System.out.println("The Warrior missed the attack!");
                        }
                    }
                    else{
                        System.out.println("the Archer is already dead!");
                    }
                }
            }
            else if (chosenStriker.equals("Warrior") && chosenDefender.equals("Wizard"))
            {
                var hitTheAttack = hitAttackChance();
                var damageAgainstEnemy = damageToEnemy();
                int valDefense = wizard.getDefenseVal();
                int valLife = wizard.get_lifePointsVal();
                if (hitTheAttack > valDefense)
                {
                    warrior.atack();
                    if (valLife > 0) {
                        if (damageAgainstEnemy < 1)
                        {
                            System.out.println("The Warrior missed the attack!");
                        }
                        else if (damageAgainstEnemy > 1)
                        {
                            wizard.reducelife(damageAgainstEnemy);
                            System.out.println("Warrior gave " + damageAgainstEnemy + " to the Wizard.");
                            var damage = damageAgainstEnemy;
                            valLife -= damage;
                            System.out.println("Wizard's remaining health: " + valLife );
                            if (damageAgainstEnemy > valLife)
                            {

                                System.out.println("The Warrior killed the Wizard!");
                            }
                        }
                        else
                        {
                            System.out.println("The Warrior missed the attack!");
                        }
                    }
                    else{
                        System.out.println("the Wizard is already dead!");
                    }
                }
            }
            else if (chosenStriker.equals("Wizard") && chosenDefender.equals("Archer"))
            {
                var hitTheAttack = hitAttackChance();
                var damageAgainstEnemy = damageToEnemy();
                int valDefense = archer.getDefenseVal();
                int valLife = archer.get_lifePointsVal();
                if (hitTheAttack > valDefense)
                {
                    wizard.atack();
                    if (valLife > 0) {
                        if (damageAgainstEnemy < 1)
                        {
                            System.out.println("The Wizard missed the spell");
                        }
                        else if (damageAgainstEnemy > 1)
                        {
                            archer.reducelife(damageAgainstEnemy);
                            System.out.println("Wizard gave " + damageAgainstEnemy + " to the archer.");
                            archer.getLifePoints();
                            var damage = damageAgainstEnemy;
                            valLife -= damage;
                            System.out.println("Archer's remaining health: " + valLife );
                            if (damageAgainstEnemy > valLife)
                            {
                                System.out.println("The Wizard killed the Archer!");
                            }
                        }
                        else
                        {
                            System.out.println("The Wizard missed the spell!");
                        }
                    }
                    else
                    {
                        System.out.println("the Archer is already dead!");
                    }
                }
            }
            else if (chosenStriker.equals("Wizard") && chosenDefender.equals("Warrior"))
            {
                var hitTheAttack = hitAttackChance();
                var damageAgainstEnemy = damageToEnemy();
                int valDefense = warrior.getDefenseVal();
                int valLife = warrior.get_lifePointsVal();
                if (hitTheAttack > valDefense)
                {
                    wizard.atack();
                    if (valLife > 0) {
                        if (damageAgainstEnemy < 1)
                        {
                            System.out.println("The Wizard missed the spell");
                        }
                        else if (damageAgainstEnemy > 1)
                        {
                            warrior.reducelife(damageAgainstEnemy);
                            System.out.println("Wizard gave " + damageAgainstEnemy + " to the Warrior.");
                            var damage = damageAgainstEnemy;
                            valLife -= damage;
                            System.out.println("Warrior's remaining health: " + valLife );
                            if (damageAgainstEnemy > valLife)
                            {
                                System.out.println("The Wizard killed the Warrior!");
                            }
                        }
                        else
                        {
                            System.out.println("The Wizard missed the spell!");
                        }
                    }
                    else{
                        System.out.println("the warrior is already dead!");
                    }
                }
            }
            var lifeWarrior = warrior.get_lifePointsVal();
            var lifeArcher = archer.get_lifePointsVal();
            var lifeWizard = wizard.get_lifePointsVal();

            if(lifeWizard == 0 && lifeArcher == 0 && lifeWarrior == 0)
            {
                System.out.println("the war is over");
                break;
            }
            else{
                System.out.println("The war is not over yet");
            }
        }
    }

    public void playerChoice()
    {
        System.out.println("Archer attributes!");
        archer.getName();
        archer.getLifePoints();
        archer.getDefense();
        System.out.println("*************************************");
        System.out.println("Warrior attributes!");
        warrior.getName();
        warrior.getLifePoints();
        warrior.getDefense();
        System.out.println("*************************************");
        System.out.println("Wizard attributes!");
        wizard.getName();
        wizard.getLifePoints();
        wizard.getDefense();
        System.out.println("*************************************");
    }

    public int hitAttackChance()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(21);
        return randomNumber;
    }

    public int damageToEnemy()
    {
        Random NewRandom = new Random();
        int randomDamage = NewRandom.nextInt(21);
        return randomDamage;
    }
}
