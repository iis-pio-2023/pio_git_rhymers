package edu.kis.vh.nursery;

public class DefaultRhymer {

    private int[] counter = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return counter[total--];
    }

}
