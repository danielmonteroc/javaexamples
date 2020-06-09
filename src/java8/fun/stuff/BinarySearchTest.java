package java8.fun.stuff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    private int[] array = {22, 23, 24, 32, 53, 70, 82, 93, 97, 100};

    @Test
    public void testCase14Exist() {

        Assertions.assertEquals(1, BinarySearch.find(array, 23));

    }

    @Test
    public void testCase42Exist() {

        Assertions.assertEquals(0, BinarySearch.find(array, 22));

    }

    @Test
    public void testCase8Exist() {

        Assertions.assertEquals(9, BinarySearch.find(array, 100));

    }

    @Test
    public void testCase21Exist() {

        Assertions.assertEquals(4, BinarySearch.find(array, 53));

    }

    @Test
    public void testCase64MustNotExist() {


        Assertions.assertEquals(-1, BinarySearch.find(array, 64));

    }

}