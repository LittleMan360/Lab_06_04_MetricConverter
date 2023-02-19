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

        //input prompt
        System.out.println("Enter measurement in meters ");
        if (in.hasNextDouble())
        {
            //input to make meters variable correct
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            //wrong input statement
            wrongInput = in.nextLine();
            System.out.println("You said the measurement was " + wrongInput);
            System.out.println("Run the program again and enter correct measurement in numbers only");
            System.exit(0);//terminates program
        }

        //found out 1 meter = 39.36 inches
        inches = meters * 39.36;
        feet = meters * 3.28;
        miles = meters / 1609.344;

        //fixed output to certian decimal places
        System.out.printf("inches = %.2f\n", + inches);
        System.out.printf("feet = %.2f\n", + feet);
        System.out.printf("Miles = %.4f\n", + miles);

    }
}