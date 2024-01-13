import java.util.*;
class Guesser {
    int guessNum;

    int guessingNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the Number between 1 to 10");
        guessNum = s.nextInt();
        return guessNum;
    }
}

class Player{
    int guessNum;
    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    void verfiedNum(){
        if(numFromGuesser>=1 && numFromGuesser<=10){
            System.out.println("Verified Number! Move Ahead");
        }
        else{
            System.out.println("Invalid Number!!!");
            System.out.println("Restart the Game");
            System.exit(0);
        }
    }
    void collectNumFromPlayers(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser == numFromPlayer3){
                System.out.println("All Players are Correct");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player1 and Player2 Are Winner");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player1 and Player3 Are Winner");
            }
            else {
                System.out.println("Player1 Won the Game");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromPlayer2==numFromPlayer3){
                System.out.println("Player2 and Player3 Are Winner");
            }
            else {
                System.out.println("Player2 Won the Game");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player3 Won the Game");
        }
        else{
            System.out.println("Game Lost! Start");
        }
    }

}

public class game {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.verfiedNum();
        u.collectNumFromPlayers();
        u.compare();

    }
}