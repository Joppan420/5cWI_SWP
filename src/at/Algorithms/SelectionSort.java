package at.Algorithms;

public class SelectionSort implements Algorithm {

    @Override
    public int[] doSort(int[] data) {
        int minIndex;
        int swap;
        for (int i = 0; i < data.length; i++) {
            minIndex = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            swap = data[i];
            data[i] = data[minIndex];
            data[minIndex] = swap;
        }
        return data;
    }
}
