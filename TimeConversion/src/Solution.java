import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        // input would be an array that splits on ':'
        // example input: 07:05:45PM
        String listTime[] = time.split(":");
        String hour = listTime[0];
        String minute = listTime[1];
        // need to substring to not get the PM
        String second = listTime[2].substring(0,2);
        String caser = listTime[2].substring(2, 4);

        if(caser.equals("AM")) {
            if(hour.equals("12"))
                hour ="00";
            System.out.println(hour + ":" + minute + ":" + second);
        } else {
            if(!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            System.out.println(hour + ":" + minute + ":" + second);
        }
    }
}
