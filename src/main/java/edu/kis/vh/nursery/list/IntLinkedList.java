package edu.kis.vh.nursery.list;

public class IntLinkedList {

    final int ERR_CODE = -1;
    Node last;
    int i;

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
            return ERR_CODE;
        return last.VALUE;
    }

    public int pop() {
        if (isEmpty())
            return ERR_CODE;
        int ret = last.VALUE;
        last = last.prev;
        return ret;
    }

}
