package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int END = 11;
    public static final int CAPACITY = END+1;
    public static final int INITIAL_VALUE = -1;
    public static final int EMPTY = -1;

    private final int[] NUMBERS = new int[CAPACITY];

    public int total = INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }


    public boolean isFull() {
        return total == END;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
