package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    /**
     *
     */
    private static final int NUMBER_SIZE = 12;
    private static final int RETURN_VAL = -1;
    private static final int TOTAL = -1;

    private final int[] numbers = new int[NUMBER_SIZE];

    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;

    public boolean isFull() {
        return total == NUMBER_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
