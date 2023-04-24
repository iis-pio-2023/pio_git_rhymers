package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int RETURN_VALUE = -1;
    private static final int MAX_SIZE = 11;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private final int[] counter = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return counter[total--];
    }

}
