package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int STACK_SIZE = 12;
    public final int RETURN = -1;
    private final int EMPTY_STACK = -1;

    private final int[] numbers = new int[STACK_SIZE];

    public int getTotal() {
        return total;
    }


    private int total = EMPTY_STACK;

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

    int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}
