package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev(Node last) {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
