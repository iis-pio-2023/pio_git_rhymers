package edu.kis.vh.nursery.list;

public class IntLinkedList {


    public static final int RETURN = -1;
    Node last;
    int i;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
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
            return RETURN;
        return last.value;
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RETURN;
        int ret = last.value;
        last = last.prev;
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }


    public int getI() {
        return i;
    }

}
