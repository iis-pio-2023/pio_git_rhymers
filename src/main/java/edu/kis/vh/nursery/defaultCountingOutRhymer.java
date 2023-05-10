package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int NUMBERS_QUANTITY = 12;
    public static final int RHYMER_EMPTY_INDICATOR = -1;
    public static final int RHYMER_FULL_INDICATOR = NUMBERS_QUANTITY - 1;
    public static final int RETURN_VALUE_RHYMER_EMPTY = -1;

    private final int[] NUMBERS = new int[NUMBERS_QUANTITY];

    public int total = RHYMER_EMPTY_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }


    public int getTotal() {
        return total;
    }
  
    public boolean callCheck() {
        return total == RHYMER_EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return total == RHYMER_FULL_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE_RHYMER_EMPTY;
        return NUMBERS[total];
    }

    int countOut() {
        if (callCheck())
            return RETURN_VALUE_RHYMER_EMPTY;
        return NUMBERS[total--];
    }
}