import java.util.Scanner;

public class RectangleInfo
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;
        boolean done = false;
        String trash = "";

        do {

            IO.print("Enter the length of the rectangle: ");

            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You have entered an invalid value, please enter a valid width and length and not " + trash);
                IO.println("Please try again!");

            }

        }while (!done);

        IO.println("The rectangle length is: " + length);

        done = false;

        do {

            IO.print("Enter the length of the rectangle: ");

            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You have entered an invalid value, please enter a valid width and length and not " + trash);
                IO.println("Please try again!");

            }

        }while (!done);

        IO.println("The rectangle width is: " + width);

        done = false;

        area = length * width;
        perimeter = (length * 2) + (width * 2);
        IO.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter);

        hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        IO.println("The hypotenuse is: " + hypotenuse);


    }
}
