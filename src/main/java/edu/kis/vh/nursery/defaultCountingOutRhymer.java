package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int MAX_SIZE  = 12;
    public static final int IS_EMPTY = -1;

    private int[] NUMBERS = new int[MAX_SIZE ];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == IS_EMPTY;
        }

            static public int jedenascie = 11;

            public boolean isFull() {
                return total == jedenascie;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return IS_EMPTY;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return IS_EMPTY;
                        return NUMBERS[total--];
                    }

}
