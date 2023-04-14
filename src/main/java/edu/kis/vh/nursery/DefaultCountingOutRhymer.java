package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = -1;
    public static final int FINAL_VARIABLE = 11;
    private int[] counter = new int[INT];

    public int total = INT1;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }

    public boolean callCheck() {
        return total == INT1;
    }

    public boolean isFull() {
        return total == FINAL_VARIABLE;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return INT1;
        return counter[total--];
    }

}
