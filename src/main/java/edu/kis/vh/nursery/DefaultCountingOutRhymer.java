package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public final int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];
    final int ERR_CODE = -1;
    final int FULL = 11;
    final int EMPTY = -1;

    public int total = -1;
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FINAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }

}
