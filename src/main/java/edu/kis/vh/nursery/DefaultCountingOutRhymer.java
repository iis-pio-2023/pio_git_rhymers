package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NEW_TOTAL = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int NUMBERS_AMOUNT = 12;
    private static final int IS_FULL = NUMBERS_AMOUNT - 1;
    private final int[] numbers = new int[NUMBERS_AMOUNT];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == NEW_TOTAL;
        }
        
            public boolean isFull() {
                return total == IS_FULL;
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
