package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int EMPTY_LIST_INDICATOR = -1;
    Node lastNode;
    int i;

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
            return EMPTY_LIST_INDICATOR;
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        int ret = lastNode.value;
        lastNode = lastNode.prevNode;
        return ret;
    }

}
