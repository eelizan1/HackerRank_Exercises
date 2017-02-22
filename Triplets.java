import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Triplets {
    public static void main(String[] args) {

        int bobScore = 0;
        int aliceScore = 0;

        Scanner scan = new Scanner(System.in);

        int[] aList = getArray(scan);
        int[] bList = getArray(scan);

        for (int i = 0; i < aList.length; i++) {
            if(aList[i] > bList[i]) {
                aliceScore++;
            } else
                if (aList[i] < bList[i]) {
                bobScore++;
            }
        }


        System.out.println();

        System.out.print(aliceScore + " ");
        System.out.print(bobScore);

        scan.close();

    }

    static int[] getArray (Scanner scan) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        // returns array
        return arr;
    }
}
