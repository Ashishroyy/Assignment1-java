import java.util.Random;

public class ShuffleArr{
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7};

        // create an object (random) of Random class
        Random random = new Random();

        // shuffling array
        for(int i = array.length-1; i>0; i--){
            int index = random.nextInt(i+1);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        // print shuffled array
        System.out.println("Shuffled array:");
        for(int num : array){
            System.out.print(num+" ");
        }
    }
}