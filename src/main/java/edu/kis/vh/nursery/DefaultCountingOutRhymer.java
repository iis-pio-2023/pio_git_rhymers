package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBEROFELEMENTS = 12;
    public static final int TOTALVALUE = -1;
    public static final int FULLARRAY = 11;
    private int[] numbers = new int[NUMBEROFELEMENTS];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTALVALUE;
    }

    public boolean isFull() {
        return total == FULLARRAY;
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
