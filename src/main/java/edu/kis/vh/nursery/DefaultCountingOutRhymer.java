package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int TABLE_SIZE = 12;
    private static final int CALL_CHECK_REQ = -1;
    private static final int FULL_REQ = 11;
    private int[] NUMBERS = new int[TABLE_SIZE];
    public static int getTableSize() {
        return TABLE_SIZE;
    }

    public static int getCallCheckReq() {
        return CALL_CHECK_REQ;
    }

    public static int getFullReq() {
        return FULL_REQ;
    }

    public int getTotal() {
        return total;
    }

    public int total = INT;

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

    protected int peekaboo() {
        if (callCheck())
            return INT;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return NUMBERS[total--];
    }

}
