/**
 * Display left angle triangle of * using nested for loops
 */

public class Program15_leftAngleTriangle {

    public static void main (String args [])
    {
        int rows = 4;

        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

}
