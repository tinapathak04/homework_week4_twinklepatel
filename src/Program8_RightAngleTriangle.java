import java.util.Scanner;
public class Program8_RightAngleTriangle {
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {

       shape();
    }

    public static void shape() {
        System.out.println("Enter rows: ");
        int rows = in.nextInt();

        int a, b;
        for ( a = 0; a < rows; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("@");
            }

            System.out.println();
        }
    }

}