package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE_OF_ARRAY = 12;
    public static final int RETURN_ERROR = -1;
    private int[] numbers = new int[SIZE_OF_ARRAY];

    public int total = RETURN_ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN_ERROR;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_ERROR;
        return numbers[total--];
    }

}
