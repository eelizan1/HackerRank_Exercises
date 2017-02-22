/**
 * Created by eeliz_000 on 2/18/2017.
 */
import java.util.*;

public class plusMinus {

    public static int n;

    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        double[] array = new double[n];

        for(int i = 0; i < n; i++) {
            array[i] = scan.nextFloat();
        }
        //check for pos
        double arrayPos = checkPos(array);

        //print
        double percentPos = arrayPos / n;
        System.out.println(percentPos);

        //check for neg
        double arrayNeg = checkNeg(array);
        //print
        double percentNeg = arrayNeg / n;
        System.out.println(percentNeg);

        //check for 0
        double arrayZero = checkZero(array);
        //print
        double percentZero = arrayZero / n;
        System.out.println(percentZero);
    }

    public  static double checkPos (double[] arr) {

        double num = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0){
                num++;
            }
        }

        return num;
    }

    public static double checkNeg (double[] arr) {

        double num = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0){
                num++;
            }
        }

        return num;
    }

    public static double checkZero (double[] arr) {

        double num = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0){
                num++;
            }
        }

        return num;
    }

}
