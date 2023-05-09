package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int FULL = 11;
    private int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY;
        }
        
            public boolean isFull() {
                return total == FULL;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return EMPTY;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return EMPTY;
                        return NUMBERS[total--];
                    }

}
