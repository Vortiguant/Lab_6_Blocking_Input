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
        String trash = ""


        do
        {
            IO.print("Enter the tank capacity in gallons: ");
            if(in.hasNextDouble())
            {

                tankCapacity = in.nextDouble();
                in.nextLine();
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid tank capacity and not " + trash);
                IO.println("Please try again!");
            }
        }while (!done);
    }
}
