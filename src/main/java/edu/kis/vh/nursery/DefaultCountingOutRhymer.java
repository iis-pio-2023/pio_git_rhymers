package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int NUMBERS_SIZE_FULL = NUMBERS_SIZE - 1;
    private static final int EMPTY_INDEX = -1;
    private static final int RETURN_VALUE = -1;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
