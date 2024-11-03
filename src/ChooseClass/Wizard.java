package ChooseClass;

import Characters.Character;

public class Wizard implements Character
{
    private String _name = "Wizard";
    private int _lifePoints;
    private int _defense = 5;

    public Wizard(int life)
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
        System.out.println("Casting spell");
    }

    @Override
    public void defense()
    {
        System.out.println("Casting spell");
    }

    public void reducelife(int reduce)
    {
        _lifePoints -= reduce;
    }
}
