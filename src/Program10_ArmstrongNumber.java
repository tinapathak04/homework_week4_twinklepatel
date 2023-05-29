/**
 * Write a program to input any number and check if it Armstrong number or not
 */

import java.util.Scanner;
public class Program10_ArmstrongNumber {

    public static void main(String[] args)
    {
        number();
    }
  public static void number(){
        Scanner in = new Scanner(System.in);
      System.out.println("Enter Number: ");
      int num = in.nextInt();
      System.out.println("Number is: " + num);

        int n = 153;
        int temp = n;
        int p = 0;

        /*function to calculate
          the sum of individual digits
         */
        while (n > 0) {

            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }

        /* condition to check whether
           the value of P equals
           to user input or not. */
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
    }
}