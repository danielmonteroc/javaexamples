package java8.fun.stuff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchTest {
    private int[] array = {8, 14, 2, 6, 19, 21, 11, 9, 24, 42};

    @Test
    public void testCase14Exist() {

        Assertions.assertEquals(1, LinearSearch.find(array, 14));

    }

    @Test
    public void testCase42Exist() {

        Assertions.assertEquals(9, LinearSearch.find(array, 42));

    }

    @Test
    public void testCase8Exist() {

        Assertions.assertEquals(0, LinearSearch.find(array, 8));

    }

    @Test
    public void testCase21Exist() {

        Assertions.assertEquals(5, LinearSearch.find(array, 21));

    }

    @Test
    public void testCase64MustNotExist() {


        Assertions.assertEquals(-1, LinearSearch.find(array, 64));

    }

}