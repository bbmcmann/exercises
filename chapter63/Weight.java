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
    
    public int average(){
        int average = 0;
        for(int i = 0; i < data.length; i++){
            average += data[i]; 
        }
        return average/data.length;
    }

    public int subAverage(int start, int end){
        int average = 0;
        if(start < end){
            for(int i = start; i <= end; i++){
                average += data[i];
            }
            return average/(end-start);
        }
        else{
            return 0;
        }
        
    }
    //Print
    public String toString(){
        return Arrays.toString(data);
    }
}