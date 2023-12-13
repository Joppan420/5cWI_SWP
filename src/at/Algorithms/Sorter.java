package at.Algorithms;

public class Sorter {

    Algorithm algo;

    public void setAlgorithm(Algorithm algorithm){
        this.algo = algorithm;
    }

    public  int[] doSort(int[] data){
        return algo.doSort(data);
    }
}
