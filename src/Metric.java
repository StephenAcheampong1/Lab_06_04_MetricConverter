import java.util.Scanner;

public class Metric {
    public static void main(String[] args) {

        double meters = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the measurement in meters: ");
        meters = in.nextDouble();

        if (meters <= 0) {
            System.out.println("Input for measurement must be greater than zero");
        }
        else
        {
            double miles = meters * 0.00062137;
            double feet = meters * 3.28084;
            double inches = meters * 39.37;

            System.out.println("The equivalent measurement in miles is: " + miles);
            System.out.println("The equivalent measurement in feet is: " + feet);
            System.out.println("The equivalent measurement in inches is: " + inches);
        }
    }
    }