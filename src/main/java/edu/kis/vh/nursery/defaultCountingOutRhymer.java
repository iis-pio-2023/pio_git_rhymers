package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int NUMBERS_QUANTITY = 12;
    public static final int TOTAL_EMPTY = -1;
    public static final int TOTAL_FULL = 11;
    private int[] NUMBERS = new int[NUMBERS_QUANTITY];

    public int total = TOTAL_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_EMPTY;
    }

    public boolean isFull() {
        return total == TOTAL_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_EMPTY;
        return NUMBERS[total--];
    }

}