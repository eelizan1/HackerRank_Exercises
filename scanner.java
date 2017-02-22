/**
 * Created by eeliz_000 on 2/14/2017.
 *
 */

import java.util.Scanner;
import java.io.*;

public class scanner {
    public static void main (String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);

        int j = 0;
        double k = 0.0;
        String s2;

        j = scan.nextInt();
        k = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();


        System.out.println(j + i);
        System.out.println(d + k);
        System.out.println(s + " " + s2);

    }
}
