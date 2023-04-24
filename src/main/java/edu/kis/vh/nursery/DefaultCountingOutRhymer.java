package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int empty = -1;
    public static final int ifEmpty = -1;
    public static final int capacity = 12;
    private final int[] numbers = new int[capacity];

    public int total = empty;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == empty;
    }

    public boolean isFull() {
        return total == capacity - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ifEmpty;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ifEmpty;
        return numbers[total--];
    }

}
