package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    final int SIZE_TABLE_NUMBERS = 12;
    final int TOTAL_START = -1;
    final int TOTAL_FULL = 11;
    private int[] numbers = new int[SIZE_TABLE_NUMBERS];

    public int total = TOTAL_START;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_START;
    }

    public boolean isFull() {
        return total == TOTAL_FULL;
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
