import java.util.Scanner;

public class metric {
    public static void main(String[] args)
    {

        //variables
        double meters = 0;
        double inches;
        double feet;
        double miles;
        String wrongInput;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter measurement in meters ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
        }
        else
        {
            wrongInput = in.nextLine();
            System.out.println("You said the measurement was " + wrongInput);
            System.out.println("Run the program again and enter correct measurement in numbers only");
            System.exit(0);//terminates program
        }

        //figured 1 meter = 39.36 inches
        inches = meters * 39.36;
        feet = meters * 3.28;
        miles = meters / 1609.344;


        System.out.println(meters + " meters = " + inches + " inches");
        System.out.println(meters + " meters = " + feet + " feet");
        System.out.println(meters + " meters = " + miles + " miles");


    }
}