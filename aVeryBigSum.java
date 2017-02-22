/**
 * Created by eeliz_000 on 2/14/2017.
 */

import java.util.Scanner;

public class aVeryBigSum {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size");

        int size = scan.nextInt();
        long[] array = new long[size];

        System.out.print("Enter array values");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println(sum);

    }
}
