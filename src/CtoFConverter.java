import java.util.Scanner;

public class CtoFConverter
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        double cTemp = 0;
        double fTemp = 0;
        boolean done = false;
        String trash = "";


        do {

            IO.print("Enter the temperature in C: ");

            if(in.hasNextDouble())
            {
                cTemp = in.nextDouble();
                fTemp = (cTemp * 9.0/5.0) + 32;
                IO.println("The temperature in C was " + cTemp + " and the temperature in F is " + fTemp);
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You have entered an invalid value, please enter a value temperature in C and not " + trash);
                IO.println("Please try again!");

            }

        }while (!done);

    }
}
