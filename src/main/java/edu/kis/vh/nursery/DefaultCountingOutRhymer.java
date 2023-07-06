package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int TWELVE = 12;
    private static final int NEGATIVE_ONE = -1;
    public static final int ELEVEN = 11;

    public static int getTWELVE() {
        return TWELVE;
    }

    public static int getNegativeOne() {
        return NEGATIVE_ONE;
    }

    public static int getELEVEN() {
        return ELEVEN;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    private final int[] NUMBERS = new int[TWELVE];

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == NEGATIVE_ONE;
    }

    protected boolean isFull() {
        return total == ELEVEN;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_ONE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return NEGATIVE_ONE;
        return NUMBERS[total--];
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

}
