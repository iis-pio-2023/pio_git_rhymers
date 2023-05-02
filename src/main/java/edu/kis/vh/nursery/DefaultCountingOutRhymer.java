package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int STACK_INITIAL_INDEX = -1;
    private static final int STACK_CAPACITY = 12;
    private static final int STACK_LAST_INDEX = STACK_CAPACITY-1;
    private final int[] numbers = new int[STACK_CAPACITY];
    private int total = STACK_INITIAL_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_INITIAL_INDEX;
    }

    public boolean isFull() {
        return total == STACK_LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}