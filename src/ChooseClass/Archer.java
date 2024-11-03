package ChooseClass;

import Characters.Character;

public class Archer implements Character
{
    private String _name = "Archer";
    private int _lifePoints;
    private int _defense = 10;

    public Archer(int life)
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
        System.out.println("Shooting Arrow");
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
