package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int STACK_SIZE = 12;
    private final int[] NUMBERS = new int[STACK_SIZE];
    public int total = -1;
    private final int EMPTY_STACK = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_STACK;
        }
        
            public boolean isFull() {
                return total == STACK_SIZE -1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return NUMBERS[total--];
                    }

}
