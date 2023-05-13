package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;

    private static final int NEGATIVE_VALUE = -1;
    private int i;

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }


    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return NEGATIVE_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return NEGATIVE_VALUE;
        int ret = last.getValue();
        last = last.prev;
        return ret;
    }

}