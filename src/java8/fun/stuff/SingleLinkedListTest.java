package java8.fun.stuff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleLinkedListTest {

    @Test
    public void testAddAtBeginning() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addAtBeginning(23);
        singleLinkedList.addAtBeginning(24);
        singleLinkedList.addAtBeginning(25);
        singleLinkedList.addAtBeginning(1);
        singleLinkedList.addAtBeginning(2);
        singleLinkedList.addAtBeginning(3);
        singleLinkedList.addAtBeginning(4);
        singleLinkedList.addAtBeginning(5);
        System.out.println("AT BEGINNING ::");
        singleLinkedList.printAll();

    }


    @Test
    public void testAddAtTheEnd() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Assertions.assertFalse(singleLinkedList.exist(23));

        singleLinkedList.printAll();
        singleLinkedList.addAtTheEnd(23);
        singleLinkedList.addAtTheEnd(24);
        singleLinkedList.addAtTheEnd(25);
        singleLinkedList.addAtTheEnd(1);
        singleLinkedList.addAtTheEnd(2);
        singleLinkedList.addAtTheEnd(3);
        singleLinkedList.addAtTheEnd(4);
        singleLinkedList.addAtTheEnd(5);

        Assertions.assertTrue(singleLinkedList.exist(5));
        Assertions.assertTrue(singleLinkedList.exist(23));
        Assertions.assertFalse(singleLinkedList.exist(50));

        Assertions.assertEquals(0, singleLinkedList.find(23));
        Assertions.assertEquals(2, singleLinkedList.find(25));
        Assertions.assertEquals(-1, singleLinkedList.find(50));

    }

}