import java.util.Scanner;

public class metric {
    public static void main(String[] args)
    {

        //variables
        double meters = 0;
        double inch = 0;
        double feet = 0;
        double miles = 0;
        String wrongInput = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter measurement in meters " );
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




    }
}