package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int TOTAL = 11;
    public static final int DEFAULT = -1;
    private final int[] numberArray = new int[SIZE];

    public int totalNumbers = DEFAULT;

    public void countIn(int in) {
        if (!isFull())
            numberArray[++totalNumbers] = in;
    }

    public boolean callCheck() {
        return totalNumbers == DEFAULT;
    }

    public boolean isFull() {
        return totalNumbers == TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numberArray[totalNumbers];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numberArray[totalNumbers--];
    }

}
