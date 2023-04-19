package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TABLE_SIZE = 12;
    private static final int CALL_CHECK_REQ = -1;
    private static final int FULL_REQ = 11;

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

    public void setTotal(int total) {
        this.total = total;
    }

    private final int[] NUMBERS = new int[getTableSize()];

    public int total = getCallCheckReq();

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == getCallCheckReq();
    }

    public boolean isFull() {
        return total == getFullReq();
    }

    protected int peekaBoo() {
        if (callCheck())
            return getCallCheckReq();
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return getCallCheckReq();
        return NUMBERS[total--];
    }

}
