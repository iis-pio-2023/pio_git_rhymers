package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int MAXSIZE = -1;
    private final int[] counter = new int[SIZE];

    public int total = MAXSIZE;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }

    public boolean callCheck() {
        return total == MAXSIZE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return MAXSIZE;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return MAXSIZE;
        return counter[total--];
    }

}
