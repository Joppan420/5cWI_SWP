package at.Algorithms;

import java.util.Random;

public class DataGenerator {
    
   public static void generateData(int[] arr){
       Random r = new Random();
       for (int i = 0; i < arr.length; i++) {
           arr[i] = r.nextInt(100);
       }
   }


    public static void printArray(int[] data){
        if (data.length == 0) {
            System.out.println("[ ]");
            return;
        }

        System.out.println("[");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + ", ");
        }
        System.out.println(data[data.length -1] + "]");
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int valueToSort = arr[i];
            int k = i;
            while(k > 0 && arr[k-1] > valueToSort){
                arr[k] = arr[k-1];
                k--;
            }
            arr[k]  = valueToSort;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        generateData(arr);
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
