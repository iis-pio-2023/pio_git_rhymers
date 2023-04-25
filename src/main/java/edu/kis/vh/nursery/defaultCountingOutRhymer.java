package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int INDEX = MAX_SIZE - 1;
    public static final int DEFAULT = -1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int totalNumbers = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++totalNumbers] = in;
    }

        public boolean callCheck() {
            return totalNumbers == DEFAULT;
        }
        
            public boolean isFull() {
                return totalNumbers == INDEX;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT;
                    return NUMBERS[totalNumbers];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT;
                        return NUMBERS[totalNumbers--];
                    }

}
