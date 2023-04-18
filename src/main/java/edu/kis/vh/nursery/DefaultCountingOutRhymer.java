package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TABLE_SIZE = 12;
    public static final int CALL_CHECK_REQ = -1;
    public static final int FULL_REQ = 11;
    private final int[] NUMBERS = new int[TABLE_SIZE];

    public int total = CALL_CHECK_REQ;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CALL_CHECK_REQ;
    }

    public boolean isFull() {
        return total == FULL_REQ;
    }

    protected int peekaBoo() {
        if (callCheck())
            return CALL_CHECK_REQ;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return CALL_CHECK_REQ;
        return NUMBERS[total--];
    }

}
