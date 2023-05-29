/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
import java.util.Scanner;
public class Program13_SharedDigit {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Result: "+hasSharedDigit(a, b));
    }

    public static boolean hasSharedDigit(int p, int q)
    {
        if (p<10 || q>99)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
    }
}

