package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS = -1;
    public static final int CAPACITY = 11;
    final private int[] numbers = new int[CAPACITY+1];


    public int total = NUMBERS;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NUMBERS;
    }

    public boolean isFull() {
        return total == CAPACITY;
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
