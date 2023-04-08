package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numberArray = new int[12];

    public int totalNumbers = -1;

    public void countIn(int in) {
        if (!isFull())
            numberArray[++totalNumbers] = in;
    }

    public boolean callCheck() {
        return totalNumbers == -1;
    }

    public boolean isFull() {
        return totalNumbers == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numberArray[totalNumbers];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numberArray[totalNumbers--];
    }

}
