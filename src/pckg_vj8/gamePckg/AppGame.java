package pckg_vj8.gamePckg;
import pckg_vj8.auxPckg.Generator;

public class AppGame {
    public static void main(String[] args)  {
        int newGuess = Generator.genAge2Guess();
        Game newGame = new Game(newGuess);
        Game.runGame();
    }

    public AppGame() {
    }
}
