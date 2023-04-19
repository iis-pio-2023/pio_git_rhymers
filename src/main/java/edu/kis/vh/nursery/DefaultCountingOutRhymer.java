package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int STACK_SIZE = 12;

    private final int EMPTY_STACK = -1;

    private int[] numbers = new int[STACK_SIZE];

    public int total = EMPTY_STACK;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK;
    }

    public boolean isFull() {
        return total == STACK_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
