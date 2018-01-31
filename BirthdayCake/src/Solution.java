/*
* You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones.

For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out  candles successfully, since the tallest candle is of height  and there are  such candles.

Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.

Input Format

integer

Colleen's age
 space-separated integers

candle heights
Output Format

Print the number of candles Colleen blows out.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

We have one candle of height , one candle of height , and two candles of height . Your niece only blows out the tallest candles, meaning the candles where . Because there are  such candles, we print  on a new line.
* */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        int highestCount = 0;
        int highest = 0;
        // get highest number
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if(array[i] > highest) {
                highest = array[i];
            }
        }
        // count how many of elements are of the highest number
        for(int i = 0; i < array.length; i++) {
            if(array[i] == highest) {
                highestCount++;
            }
        }
        System.out.println(highestCount);
    }
}
