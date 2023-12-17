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

    public int[] generateData(int size, int min, int max) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(max - min) + min;
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
