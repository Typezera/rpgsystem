package ChooseClass;

import Characters.Character;

public class Warrior implements Character
{
    private String _name = "Warrior";
    private int _lifePoints;
    private int _defense = 15;

    public Warrior(int life)
    {
        this._lifePoints = life;
    }

    public void getName()
    {
        System.out.println("Name: " + _name);
    }
    public void getLifePoints()
    {
        System.out.println("Life: " + _lifePoints);
    }
    public void getDefense()
    {
        System.out.println("Defense: " + _defense);
    }

    public int getDefenseVal(){
        return _defense;
    }
    public int get_lifePointsVal(){
        return _lifePoints;
    }

    @Override
    public void atack()
    {
        System.out.println("Attack with the sword");
    }

    @Override
    public void defense()
    {
        System.out.println("Dodge");
    }

    public void reducelife(int reduce)
    {
        _lifePoints -= reduce;
    }
}
