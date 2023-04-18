package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int NUMBERS_SIZE_FULL = 11;
    private static final int ERROR_TOTAL = -1;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public int total = ERROR_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_TOTAL;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_TOTAL;
        return numbers[total--];
    }

}
