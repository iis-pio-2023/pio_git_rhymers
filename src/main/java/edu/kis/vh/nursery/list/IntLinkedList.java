package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int ERR_EMPTY = -1;
    Node lastNode;
    int counter;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.nextNode = new Node(i);
            lastNode.nextNode.prevNode = lastNode;
            lastNode = lastNode.nextNode;
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERR_EMPTY;
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty())
            return ERR_EMPTY;
        int ret = lastNode.value;
        lastNode = lastNode.prevNode;
        return ret;
    }
}