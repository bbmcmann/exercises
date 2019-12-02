import java.util.Arrays;
import java.io.*;

public class Reversal2{

    public static void main(String[] args) {
     
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] reversedData = new int[14];

        for(int i = 0; i < data.length; i++){
            reversedData[i] = data[data.length-1-i];
        }
      
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(reversedData));
    }

}