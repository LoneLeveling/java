package ProblemSolving;

import java.util.Random;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game=new GuessGame();
        game.startGame();
    }
}

class Player {
    private static final Random random=new Random();
       public int guess() {
           return random.nextInt(10);

    }
}

class GuessGame
{
    Player p1;
    Player p2;
    Player p3;
    public void startGame()
    {
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int attempts=0;

        System.out.println("I'm thinking of a number between 0 and 9");
        int targetNumber=(int) (Math.random()*10);
        while (true)
{
    attempts++;
    boolean p1IsRight=false;
    boolean p2IsRight=false;
    boolean p3IsRight=false;
//    System.out.println("Number to guess is "+targetNumber);

 int guessp1= p1.guess();
  int guessp2=p2.guess();
  int guessp3=p3.guess();
    System.out.println("Player 1 guessed: "+guessp1);
    System.out.println("Player 2 guessed: "+guessp2);
    System.out.println("player 3 guessed: "+guessp3);

    if(guessp1==targetNumber)
    {
        p1IsRight=true;
    }
    if (guessp2==targetNumber)
    {
        p2IsRight=true;
    }
    if (guessp3==targetNumber)
    {
        p3IsRight=true;
    }
    if (p1IsRight||p2IsRight||p3IsRight)
    {
        System.out.println("We have a winner!");
        System.out.println("Player one got it right ? "+p1IsRight);
        System.out.println("Player two got it right ? "+p2IsRight);
        System.out.println("Player three got it right ? "+p3IsRight);
        System.out.println("Game finished in "+attempts+ " attempts and is over.");
        break;
    }
    else
    {
        System.out.println("Players will try again ... ");
    }

}
    }

}
