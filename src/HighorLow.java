import java.util.Scanner;
import java.util.Random;


public class HighorLow
{
    static void main()
    {
        Random gen =  new Random();
        boolean done = false;
        int randVal = gen.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);


        do
        {
            IO.print("Enter your guess [1-10]: ");

            if(in.hasNextInt())
            {

                userGuess = in.nextInt();
                in.nextLine();

                if (userGuess >= 1 && userGuess <= 10)
                {
                    if (userGuess == randVal) {
                        IO.println("You guessed the number correctly! The number was " + randVal);
                    }
                    else if (userGuess > randVal) {
                        IO.println("Your guess " + userGuess + " is greater than " + randVal);
                    }
                    else {
                        IO.println("Your guess " + userGuess + " is less than " + randVal);
                    }

                    done = true;
                }
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid value [1-10] and not " + trash);
                IO.println("Please try again!");
            }
        }while (!done);
    }
}
