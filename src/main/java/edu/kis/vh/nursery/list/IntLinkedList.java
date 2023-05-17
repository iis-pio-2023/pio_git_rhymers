package edu.kis.vh.nursery.list;

/**
 * Linked List implementation for integer values.
 */

public class IntLinkedList {
    /**
     * The Node that exist at the end of the Linked List.
     */
    private Node last;
    /**
     * @deprecated
     * Temp value (currently not used).
     */
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    /**
     * Adds the given number at the end of the Linked List.
     *
     * @param i The number which is added at the end of the Linked List.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getPrev().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Returns the information if the list is empty.
     *
     * @return The information if the list is empty.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Returns the information if the list is empty.
     *
     * @return The information if the list is full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the number at the end of the list without removing it from the Linked List.
     *
     * @return The number at the end of the list.
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }
    /**
     * Returns the number at the end of the list removing it form the Linked List.
     *
     * @return The number at the end of the list.
     */

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
