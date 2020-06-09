package java8.fun.stuff;

public class BubbleSort {


    public static int[] sort(int[] array) {

        for (int j = array.length - 1; j >= 0; j--) {
            boolean changes = false;
            for(int i = 0; i < j; i++)
            {
                if(array[i] > array[i+1])
                {
                    swap(array, i, i+1);
                    changes = true;
                }
            }
            if(changes == false)
                return array;
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array [j];
        array[j] = temp;
    }
}
