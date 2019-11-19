import java.util.Arrays;

class SameSum{


    public static void main(String[] args) {
        
        int[] valA = {13,-22,82,17};
        int[] valB = {0,0,0,0};

        for(int i = 0; i < 4; i++){
            valB[i] = 25-valA[i];
        }

        System.out.println(Arrays.toString(valA));
        System.out.println(Arrays.toString(valB));
    }


}