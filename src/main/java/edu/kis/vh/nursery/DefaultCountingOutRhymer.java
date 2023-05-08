package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int DEFAULT_VALUE = -1;
    private static final int INDEX = -1;
    private static final int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];

    private int total = INDEX;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == INDEX;
        }
            public boolean isFull() {
                return total == MAX_SIZE-1;
            }

                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT_VALUE;
                    return numbers[total];
                }
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_VALUE;
                        return numbers[total--];
                    }

}
