package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public final int STACK_SIZE = 12;
    public final int RETURN = -1;
    public final int IS_FULL = 11;

    private final int[] NUMBERS = new int[STACK_SIZE];
    public final int EMPTY_STACK = -1;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int total = EMPTY_STACK;


    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_STACK;
        }
        
            public boolean isFull() {
                return total == IS_FULL;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return RETURN;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return RETURN;
                        return NUMBERS[total--];
                    }

}
