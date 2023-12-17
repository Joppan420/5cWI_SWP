package at.Algorithms;

public class Main {
    public static void main(String[] args) {

        DataGenerator dataGenerator = new DataGenerator();
        int[] data = dataGenerator.generateData(5);

        SelectionSort selectionSort = new SelectionSort();

        Sorter sorter = new Sorter();
        sorter.setAlgorithm(selectionSort);

        DataGenerator.printArray(data);
        int[] result = sorter.doSort(data);

        DataGenerator.printArray(result);
    }
}
