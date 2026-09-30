import java.util.Scanner;

public class FuelCost
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double tankCapacity = 0;
        double mpg = 0;
        double ppg = 0;
        boolean done = false;
        String trash = "";
        double driveCost = 0;
        double distance  = 0;


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

        IO.println("The tank capacity is: " + tankCapacity);

        done = false;

        do
        {
            IO.print("Enter the Miles per Gallon: ");
            if(in.hasNextDouble())
            {

                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid miles per gallon and not " + trash);
                IO.println("Please try again!");
            }
        }while (!done);

        IO.println("The Miles per Gallon is: " + mpg);

        done = false;

        do
        {
            IO.print("Enter the Price per Gallon in dollars: ");
            if(in.hasNextDouble())
            {

                ppg = in.nextDouble();
                in.nextLine();
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid price and not " + trash);
                IO.println("Please try again!");
            }
        }while (!done);

        IO.println("The Price per Gallon is: " + ppg);

        driveCost = (100/mpg) * ppg;

        IO.println("The price to drive 100 gallons is " + driveCost +  " dollars");

        distance = tankCapacity * mpg;

        IO.println("The total distance on a full tank is " + distance + " miles");




    }
}
