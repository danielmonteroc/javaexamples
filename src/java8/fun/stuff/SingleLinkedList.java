package java8.fun.stuff;

public class SingleLinkedList {

    public static class Node {

        int value;
        Node next;
    }

    Node first;

    /*
    Insert (int value)
    * */

    public void addAtBeginning(int value) {
        //1.- Create new node with new value
        Node newNode = new Node();
        newNode.value = value;
        //2. NewNode.next = first
        newNode.next = first;
        //3 . first = newNode
        first = newNode;
    }

    public void addAtTheEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (first == null) {
            first = newNode;
        } else {
            Node iterator = first;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = newNode;
        }
    }

    void printAll() {
        Node iterator = first;
        while (iterator != null) {
            System.out.println(iterator.value);
            iterator = iterator.next;
        }
    }

    public boolean exist(int value) {
        Node iterator = first;
        while (iterator != null) {
            if (iterator.value == value) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public int find(int value) {
        Node iterator = first;
        int index = 0;
        while (iterator != null) {
            if (iterator.value == value) {
                return index;
            }
            iterator = iterator.next;
            index++;
        }
        return -1;
    }

}
