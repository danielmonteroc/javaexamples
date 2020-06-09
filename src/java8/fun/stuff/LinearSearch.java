package java8.fun.stuff;

public class LinearSearch {
    public static int find(int[] array, int value) {

        for (int i = 0; i <= array.length - 1; i++) {
            if (value == array[i]) {
                return i;
            }
        }

        return -1;
    }
}
