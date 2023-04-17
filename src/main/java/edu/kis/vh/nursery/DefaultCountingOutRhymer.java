package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int begin = -1;
    public static final int end = 11;
    private int[] NUMBERS = new int[12];

    public int total = begin;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == begin;
    }


    public boolean isFull() {
        return total == end;
    }

    protected int peekaboo() {
        if (callCheck())
            return begin;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return begin;
        return NUMBERS[total--];
    }

}
