import java.util.Scanner;

/**
 * Created by eeliz_000 on 2/14/2017.
 */
public class diagonalDifference {

    public static  int n; // number of rows

 public static void main (String[] args) {


     int array[][];

     //set up scanner
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a N X N matrix");

     n = scan.nextInt();

     //number of rows and columns are populated by user
     array = new int [n][n];

     //set up array
     System.out.println("Enter array values");
     for(int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             array[i][j] = scan.nextInt();
         }
     }

     // prints 2d array
     for(int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             System.out.print(array[i][j]);
         }

         System.out.println();
     }

     System.out.println();

     // create diagonal arrays
     int[] diagArray1 = {array[0][0],array[1][1],array[2][2]};
     int[] diagArray2 = {array[2][0],array[1][1],array[0][2]};

     System.out.println("Diag1: ");

     for(int i = 0; i < diagArray1.length; i++) {
         System.out.print(diagArray1[i] + " ");
     }

     System.out.println();
     System.out.println("Diag2: ");

     for(int i = 0; i < diagArray1.length; i++) {
         System.out.print(diagArray2[i] + " ");
     }

     System.out.println();
     System.out.println("Sums of diagonal 1 is: " + sumDiagonals(diagArray1));
     System.out.println("Sums of diagonal 2 is: " + sumDiagonals(diagArray2));

    System.out.println("Absolute difference is: " +
            differenceSum(sumDiagonals(diagArray1), sumDiagonals(diagArray2)));

    }

    public static int sumDiagonals (int arr[]) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int differenceSum(int sum1, int sum2) {
        int difference = sum1 - sum2;
        return Math.abs(difference);
    }


}
