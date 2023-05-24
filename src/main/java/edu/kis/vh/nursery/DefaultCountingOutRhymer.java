package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;
    final private int[] numbers = new int[MAX_SIZE];
    private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal()
    {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_RHYMER_INDICATOR;
        }
        
            public boolean isFull() {
                return total == 11;
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
