/**
 * Created by eeliz_000 on 2/19/2017.
 */
public class loop {
    public static void main (String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.print("Outer" + " ");
            for(int j = 0; j < 5; j++) {
                System.out.print("inner" + " ");
                for(int k = 0; k < 5; k++) {
                    System.out.print("middle" + " ");
                }

                System.out.println();
            }

            System.out.println();
        }

    }
}
