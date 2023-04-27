package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final Node NULL = null;
    public static final int LIST_EMPTY = -1;
    public static final boolean LIST_NOT_FULL = false;
    Node last;
    int i;

    public void push(int i) {
        if (last == NULL)

            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == NULL;
    }

    public boolean isFull() {
        return LIST_NOT_FULL;
    }

    public int top() {
        if (isEmpty())
            return LIST_EMPTY;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
