package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] numbers = new int[12];

    public int totalic = 12;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalic] = in;
    }

    public boolean callCheck() {
        return totalic == -1;
    }

    public boolean isFull() {
        return totalic == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[totalic];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[totalic--];
    }

}
