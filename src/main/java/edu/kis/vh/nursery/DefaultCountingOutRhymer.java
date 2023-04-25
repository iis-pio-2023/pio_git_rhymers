package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INITIAL = -1;
    public static final int DEFOULT = -1;

    public static final int SIZE = 12;
    public static final int MAX = SIZE - 1;

    private final int[] numbers = new int[SIZE];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFOULT;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return INITIAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL;
        return numbers[total--];
    }

}
