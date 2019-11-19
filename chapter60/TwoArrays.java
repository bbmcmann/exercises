import java.util.Arrays;

class TwoArrays{

    public static void main(String[] args) {
        
        int[] val = {13,-4,82,17};
        int[] twice;

        System.out.println(Arrays.toString(val));

        twice = new int[4];

        for(int i = 0; i < 4; i++){
            twice[i] = val[i] * 2;
        }

        System.out.println(Arrays.toString(twice));
        
    }

}