import java.util.Arrays;

class Weight{
    private int[] data;
    
    // Constructor
    public Weight(int[] init)
    {

      int[] data = new int[init.length];
      
 
      for(int i = 0; i < data.length; i ++){
        data[i] = init[i];
      }
    }
    
    //Print
    public String toString(){
        return Arrays.toString(data);
   
    }
}