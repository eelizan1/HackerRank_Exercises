/**
 * Created by eeliz_000 on 2/20/2017.
 */
public class arrayDelete {


    private static int[] array = new int[50];
    private static int size = 10;


    public static void main(String[] args) {

        arrayDelete myArray = new arrayDelete();

        myArray.generateArray();

        myArray.print();

        //myArray.getValueIndex(3);

        myArray.delete(3);

        System.out.println();

        myArray.print();

    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

    }

    public void generateArray() {
        for(int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*10)+10;
        }
    }

    public int getValueIndex(int index) {
        if(index < size){
            return array[index];
        }

        return 0;
    }

    public void delete(int index) {


           if (index < size) {
               for(int i = index; i < (array.length - 1); i++) {

                   array[i] = array[i+1];

               }

               size--;

           }

    }
}
