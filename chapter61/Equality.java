import java.util.Arrays;
import java.io.*;

public class Equality{

    public static boolean myEquals(int[] a,int[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i ++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arrayA = { 1, 2, 3, 4 };
        int[] arrayB = { 1, 2, 3, 4 };

        System.out.print("Arrays says: ");
        if (Arrays.equals(arrayE, null)){
            System.out.println("Equal");
        }
        else{
            System.out.println("NOT Equal");      
        }

        System.out.print("myEquals says: ");

        if (Arrays.equals(arrayE, null)){
            System.out.println( "Equal" );
        }
        else{
            System.out.println("NOT Equal");
        }
    }
}