/**
 * Created by eeliz_000 on 3/2/2017.
 */
public class findDuplicate {

    public static void main (String[] args) {

        int[] array = {0, 2, 1, 3, 2};

        //System.out.println(bruteForce(array));

        System.out.println(nonBrute(array));


    }

    public static boolean bruteForce(int arr[]) {

        boolean isTrue = false;

        // brute force method which is inneficient
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    isTrue = true;
            }
        }

        return isTrue;

    }

    public static int nonBrute(int arr[]) {

        int sum1 = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0 || arr[i] > arr.length - 2)
                throw new IllegalArgumentException("Invalid numbers");
            sum1 += arr[i];
        }

        int sum2 = ((arr.length -1 ) * (arr.length - 2)) >> 1;

        return sum1 - sum2;
    }

}
