import java.util.Arrays;

class Weight{
    private int[] data;
    
    // Constructor
    public Weight(int[] init){
      data = new int[init.length];
      
      for(int i = 0; i < init.length; i ++){
        //System.out.println(init[i]);
        data[i] = init[i];
        //System.out.println(data[i]);
      }
    }
    
    //Print
    public String toString(){
        return Arrays.toString(data);
    }
}