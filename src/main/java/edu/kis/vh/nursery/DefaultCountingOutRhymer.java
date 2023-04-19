package edu.kis.vh.nursery;

import com.sun.org.apache.bcel.internal.generic.RET;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int Empty = -1;
    public static final int Full = 11;
    public static final int RETURN_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    private int total = Empty;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == Empty;
    }

    public boolean isFull() {
        return total == Full;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
