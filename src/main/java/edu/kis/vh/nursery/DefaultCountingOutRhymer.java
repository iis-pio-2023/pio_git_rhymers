package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int negative = -1;
    public static final int size = 12;
    private final int[] numbers = new int[size];

    public int total = negative;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == negative;
    }

    public boolean isFull() {
        return total == size - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return negative;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return negative;
        return numbers[total--];
    }

}
