package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int initial = -1;
    public static final int defoult = -1;

    public static final int size = 12;
    public static final int max = size - 1;

    private final int[] numbers = new int[size];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == defoult;
    }

    public boolean isFull() {
        return total == max;
    }

    protected int peekaboo() {
        if (callCheck())
            return initial;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return initial;
        return numbers[total--];
    }

}
