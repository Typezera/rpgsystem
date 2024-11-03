package StartGame;

import ChooseClass.Archer;
import ChooseClass.Warrior;
import ChooseClass.Wizard;
import Game.GameConfig;

public class Main
{
    public static void main(String[] args) {
        Archer archer = new Archer( 15);
        Warrior warrior = new Warrior(20);
        Wizard wizard = new Wizard( 10);


        GameConfig gameConfig = new GameConfig(archer,warrior,wizard);

        gameConfig.startGame();
    }
}
