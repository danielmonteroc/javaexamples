package java8.fun.stuff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    public void testBubbleWorks() {
        int[] array = {12, -14, 4, 8, 29, 32, 40, 7, 3, 1};
        int[] sortedArray = BubbleSort.sort(array);
        Assertions.assertArrayEquals(sortedArray, new int[] {-14, 1, 3, 4, 7, 8, 12, 29, 32, 40});
    }

}