package pckg_vj8.gamePckg;

import pckg_vj8.auxPckg.UserInpts;
import pckg_vj8.auxPckg.UsrInptException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private static int age2Guess;
    private static int cnt = 0;
    private static boolean gameCont;
    private static Scanner scanner;
    public Game(int a2G) {
        age2Guess = a2G;
        gameCont = true;
        scanner = new Scanner(System.in);
    }

    public static void runGame()  {
        while(gameCont){
            try {
                UserInpts usrInpt;
                usrInpt =  userInpts();
                if(usrInpt != null){
                    boolean guessStatus = guessStatus(usrInpt, cnt+1);
                    if(guessStatus && !gameCont){
                        break;
                    }
                }
            } catch (UsrInptException e) {
                throw new RuntimeException(e);
            }finally {
                if(gameCont){
                gameCont = contGame();
                }
                if(!gameCont){
                    System.out.println("Player leaving!");
                }
            }
        }
        scanner.close();
    }


    private static UserInpts userInpts() throws InputMismatchException, UsrInptException {
        UserInpts userInpts = null;
        try {
            UsrInptException exc = new UsrInptException("User input exception!");
            userInpts = new UserInpts();

            System.out.println("Please enter one integer value [1 -> 120] for lower bound:");
            int lower = scanner.nextInt();
            isInptNegative(lower);
            exc.setLwr(lower);
            System.out.println("Please enter one integer value [1 -> 120] for upper bound:");
            int upper = scanner.nextInt();
            isInptNegative(upper);
            exc.setUppr(upper);
            System.out.println("Please enter one integer value [1 -> 120] for your guess:");
            int guess = scanner.nextInt();
            isInptNegative(guess);
            userInpts.setInputs(lower, upper, guess);
            exc.setPlGuess(guess);

        }catch (InputMismatchException e){
            System.out.println("Positive integer is expected!!");
        } catch (UsrInptException e) {
            System.out.println(e.getMessage());
        }
        return userInpts;
    }


    private static void isInptNegative(int input) throws UsrInptException {
        if (input<0){
            throw new UsrInptException("Negative values are not allowed!!!");
        }
    }

    private static boolean contGame(){
        System.out.println("************************************************");
        System.out.println("Do you want to continue playing this game?");
        System.out.println("Y = YES any other for exit!!!");
        System.out.println("************************************************");
        scanner.nextLine();
        String gameContinue = scanner.next();

        return gameContinue.equalsIgnoreCase("Y");
    }

    private static boolean guessStatus(UserInpts userInpts,int count){
        int lower = userInpts.getLwr();
        int upper = userInpts.getUppr();
        int guess = userInpts.getGuess();

        cnt = count;
        if (guess == age2Guess){
            System.out.println("***************************************************");
            System.out.println("You won!!!");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<< Attempts: "+cnt+" >>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Looked for value: "+age2Guess+"\t Your guess: "+guess);
            System.out.println("***************************************************");
            gameCont = false;

            return true;
        }
        else if(lower > age2Guess){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Tip for playing >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Age to guess has value lower than -> "+ lower );
            System.out.println("Attempts: "+cnt+"\t Guessed value: "+guess);

        }else if (upper < age2Guess){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Tip for playing >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Age to guess has value higher than -> "+ upper );
            System.out.println("Attempts: "+cnt+"\t Guessed value: "+guess);

        }else {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Tip for playing >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Age to guess is in the interval ->[ "+lower+","+upper+" ]");
            System.out.println("Attempts: "+cnt+"\t Guessed value: "+guess);

        }
        userInpts.setStatus(false);
        return false;
        }


}
