package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_INDEX = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int NUMBERS_CAPACITY = 12;
    private final int[] NUMBERS = new int[NUMBERS_CAPACITY];

    public int total = EMPTY_INDEX;


    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_INDEX;
        }
        
            public boolean isFull() {
                return total == NUMBERS_CAPACITY - 1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT_VALUE;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_VALUE;
                        return NUMBERS[total--];
                    }

}
