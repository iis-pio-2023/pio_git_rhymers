package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TABLE_SIZE = 12;
    public static final int MINIMAL_TOTAL_SIZE = -1;
    public static final int EMPTY_TABLE = -1;
    private final int[] counter = new int[TABLE_SIZE];

    public int total = MINIMAL_TOTAL_SIZE;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }
    public boolean callCheck() {
        return total == MINIMAL_TOTAL_SIZE;
    }

    public boolean isFull() {
        return total == TABLE_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_TABLE;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_TABLE;
        return counter[total--];
    }

}
