/**
 * Created by eeliz_000 on 3/3/2017.
 */
public class Palindrone {

    public static void main (String[] args) {

        String str = "122";

        if (check(str) == 1)
            System.out.println(str + " is a palindrone");
        else
            System.out.println(str + " is not a palindrone");

    }

    static int check(String string) {

        char[] array = string.toCharArray();
        int pal = 1;
        int length = array.length;
        int half = string.length()/2;

        for(int i = 0; i < half; i++){
            // the algorithm
            if(array[i] != array[array.length - 1 - i]) {
                pal = 0;
                break;
            }
        }

        return pal;
    }


}
