package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int DEFAULT_VALUE = -1;
    private node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new node(i);
        else {
            last.next = new node(i);
            last.next.setPrev(last);
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
            return DEFAULT_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
