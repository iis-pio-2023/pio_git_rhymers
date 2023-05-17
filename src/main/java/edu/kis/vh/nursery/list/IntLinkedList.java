package edu.kis.vh.nursery.list;

/**
 * Linked List implementation for integer values.
 */

public class IntLinkedList {

    /**
     * The value informing if the Linked List is empty.
     */

    public static final int EMPTY = -1;

    /**
     * The Node that exist at the end of the Linked List.
     */

    private Node last;

    /**
     * @deprecated
     * Temp value, which is currently not used.
     */

    private int i;

    /**
     * Method is currently not used.
     * @return i.
     */

    public int getI() {
        return i;
    }

    /**
     * Adds the given number at the end of the Linked List.
     * @param i the number which is added at the end of the Linked List.
     */

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Return the information if the list is empty.
     * @return the information if the list is empty.
     */

    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Return the information if the list is full. Method is currently not used.
     * @return the information if the list is full.
     */

    public boolean isFull() {
        return false;
    }

    /**
     * Returns the number at the end of the list without removing it from the Linked List. Method is currently not used.
     * @return the number at the end of the list.
     */

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Returns the number at the end of the list removing it from the Linked List.
     * @return the number at the end of the list. Method is currently not used.
     */

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
