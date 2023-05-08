package edu.kis.vh.nursery.list;


public class IntLinkedList {

    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().getPrev(last);
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
            return -1;
        return last.getValue();
    }

    public int getI() {
        return i;
    }

    public void setI(int i){
        this.i=i;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getLast() {
        return last;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev(last);
        return ret;
    }



}
