import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 38) {
                System.out.println(array[i]);
            } else {
                System.out.println(roundGrade(array[i]));
            }
        }
    }

    public static int roundGrade(int grade) {
        int nextMultiple = grade;
        int difference;
       // System.out.println("Initial grade: " + grade);
        while(nextMultiple % 5 != 0) {
            nextMultiple++;
        }
       // System.out.println("Next Multiple of 5: " + nextMultiple);
        difference = nextMultiple - grade;
        //System.out.println("Difference: " + difference);
        if(difference < 3) {
            grade = nextMultiple;
        }
       return grade;
    }
}
