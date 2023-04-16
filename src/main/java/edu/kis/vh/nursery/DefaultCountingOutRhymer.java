package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int arraySize = 12;
    public static final int returnValue = -1;
    public static final int capacity = 11;
    private int[] counter = new int[arraySize];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }

    public boolean callCheck() {
        return total == returnValue;
    }

    public boolean isFull() {
        return total == capacity;
    }

    protected int peekaboo() {
        if (callCheck())
            return returnValue;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return returnValue;
        return counter[total--];
    }

}
