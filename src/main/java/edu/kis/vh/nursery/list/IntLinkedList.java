package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_INDICATOR = -1;

    Node lastNode;

    int i;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNextNode(new Node(i));
            lastNode.getNextNode().setPrevNode(lastNode);
            lastNode = lastNode.getNextNode();
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
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrevNode();
        return ret;
    }
}