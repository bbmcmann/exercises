import java.io.*;

class TwoLarge{

    public static void main(String[] args) {
        
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        int largest = data[0];
        int secondLarge = data[0];

        for (int i = 0; i < data.length; i++){
            if(data[i] > largest){
                secondLarge = largest;
                largest = data[i];
            }
            else if(data[i] > secondLarge){
                secondLarge = data[i];
            }
        }
      
        System.out.println(largest);
        System.out.println(secondLarge);

    }

}