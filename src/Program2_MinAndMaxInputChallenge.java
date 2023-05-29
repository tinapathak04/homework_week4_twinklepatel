import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */

public class Program2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        max();
    }
    public static void max(){
        Scanner tv = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true) {
            System.out.println("Enter number: ");

            boolean isAnInt = tv.hasNextInt();
            if (isAnInt) {
                int number = tv.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            tv.nextLine();
        }
        System.out.println("Max = " + max + "and = " + min);
        tv.close();
            }
            }



