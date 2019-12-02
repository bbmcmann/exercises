import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class DataChange{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data = new double[13];
        double average = 0;
        double farthest;

        for(int i = 0; i < 13; i++){
            data[i] = input.nextDouble();
            average += data[i];
        }
        average = average/13;

        System.out.println(average);
        farthest = data[0];

        for(int i = 0; i < 13; i++){
            if(Math.abs(data[i] - average) > Math.abs(farthest-average)){
                farthest = data[i];
            }
        }

        average = ((average * 13) - farthest)/12;

        System.out.println(average);

    }

}