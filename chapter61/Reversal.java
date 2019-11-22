import java.util.Arrays;
import java.io.*;

public class Reversal{

    public static void main(String[] args) {
     
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int temp;

        for(int i = 0; i < data.length/2; i++){
            int swapSpot = data.length-1-i;
            temp = data[i];
            data[i] = data[swapSpot];
            data[swapSpot] = temp;
        }
      
        System.out.println(Arrays.toString(data));

    }

}