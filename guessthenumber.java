import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Guess The Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes, You Guessed It Right, It Was %d\nYou Guessed It In %d Attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too Low...");
        }
        else if(inputNumber>number){
            System.out.println("Too High...");
        }
        return false;
    }

}
public class guessthenumber {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

