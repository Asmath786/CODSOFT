import java.util.Random;
import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int score=0;
        boolean playAgain=true;
        System.out.println("Guess Number Game");
        while(playAgain)
        {
            int numberToguess=ran.nextInt(100)+1;
            int maxAttempts=5;
            int attempts=0;
            boolean guessedCorrectly=false;
            System.out.println("\nThe number is between 1 to 100");
            System.out.println("\nYou have "+maxAttempts+" attempts to guess it!");
            while(attempts<maxAttempts)
            {
                System.out.println("\nEnter your guess: ");
                int guess=sc.nextInt();
                attempts++;
                if(guess==numberToguess)
                {
                    System.out.println("Correct! You guessed the number in"+attempts+"attempts");
                        score++;
                        guessedCorrectly=true;
                        break;
                }
                else if(guess>numberToguess)
                {
                    System.out.println("Too High!");
                }
                else
                {
                    System.out.println("Too Low!");
                }
            }
            if(!guessedCorrectly)
            {
                System.out.println("\nYou've used all attempts. The correct number was: "+numberToguess);
            }
            System.out.println("\nDo you want to play another round?(Yes/No): ");
            String choice=sc.next().toLowerCase();
            if(!choice.equals("yes"))
            {
                playAgain=false;
            }
        }
        System.out.println("\nGame Over!");
        System.out.println("Your total score : "+score);
        System.out.println("Thank You for playing");
        sc.close();
    }
}
