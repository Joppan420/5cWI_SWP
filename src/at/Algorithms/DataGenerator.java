package at.Algorithms;

import java.util.Random;

public class DataGenerator {
    
   public int[] generateData(int size){
       int[] data = new int[size];
       Random r = new Random();
       for (int i = 0; i < size; i++) {
           data[i] = r.nextInt();
       }
       return data;
   }


    public static void printArray(int[] data){
        for (int number : data) {
            System.out.println(number + "  ");
        }
        System.out.println();
    }
}
