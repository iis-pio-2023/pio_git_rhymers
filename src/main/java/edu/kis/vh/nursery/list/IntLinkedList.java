package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int INT = -1;
    private static final int INT1 = -1;
    Node last;
    int i;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return INT;
        return last.getValue();
    }

    private int pop() {
        if (isEmpty())
            return INT1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
