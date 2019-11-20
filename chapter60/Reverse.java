import java.util.Arrays;

class Reverse{
    public static void main(String[] args) {
        int[] val = {0,1,2,3};
        int temp;

        System.out.println(Arrays.toString(val));

        //reverse it
        for(int i = 0; i < val.length/2; i++){
            int swapSpot = val.length-1-i;
            temp = val[i];
            val[i] = val[swapSpot];
            val[swapSpot] = temp;
        }

        System.out.println(Arrays.toString(val));
    }
}