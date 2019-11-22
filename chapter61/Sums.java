import java.io.*;

class Sums{

    public static void main(String[] args) {
        
        int[] data = {3,2,5,7,9,12,97,24,54};
        int sum = 0;
        int evens = 0;
        int odds = 0;

        for(int i = 0; i < data.length; i++){
            sum += data[i];
            if(data[i]%2 == 0){
                evens += data[i];
            }
            else{
                odds += data[i];
            }
        }

        System.out.println(sum);
        System.out.println(evens);
        System.out.println(odds);

    }
}