package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int EMPTY = -1;

    private static final int ERRORCODE = -1;
    private static final int MAX = SIZE - 1;
    private final int[] numbers = new int[SIZE];

    public static int getSIZE() {
        return SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getERRORCODE() {
        return ERRORCODE;
    }

    public static int getMAX() {
        return MAX;
    }

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void addInValuesToNumbers(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isNumbersClear() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (isNumbersClear())
            return ERRORCODE;
        return numbers[total];
    }

    public int countOut() {
        if (isNumbersClear())
            return ERRORCODE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
