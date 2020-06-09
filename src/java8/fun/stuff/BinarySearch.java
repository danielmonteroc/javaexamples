package java8.fun.stuff;

public class BinarySearch {
    public static int find(int[] array, int value) {

        int limInf = 0;
        int limSup = array.length - 1;
        while (limInf <= limSup) {
            int pivote = (limInf + limSup) / 2;
            if (value == array[pivote]) {
                return pivote;
            } else if (value > array[pivote]) {
                limInf = pivote + 1;
            } else // value < array[pivote]
            {
                limSup = pivote - 1;
            }
        }
        return -1;
    }
}
