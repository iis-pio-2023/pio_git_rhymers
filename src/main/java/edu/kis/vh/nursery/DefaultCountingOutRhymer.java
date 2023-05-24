package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int INITIAL_VALUE = -1;
    private static final int TOTAL = -1;

    private final int[] NUMBERS = new int[SIZE];

    private int total = TOTAL;

    public static int getSIZE() {
        return SIZE;
    }

    public static int getInitialValue() {
        return INITIAL_VALUE;
    }

    public static int getTOTAL() {
        return TOTAL;
    }

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

    public int getTotal() {
        return total;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

}