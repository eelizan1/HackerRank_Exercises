/**
 * Created by eeliz_000 on 2/19/2017.
 */
public class checkers {
    public static void main (String[] args) {
        int[][] array = new int[8][8];
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == j % 2) {
                    array[i][j] = 1;
                } else
                    array[i][j] = 0;
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
