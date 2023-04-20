package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int SIZE = 12;
    public static final int INITIAL_VALUE = -1;
    private static final int TOTAL = -1;

    private int[] NUMBERS = new int[SIZE];

    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INITIAL_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL_VALUE;
        return NUMBERS[total--];
    }
}