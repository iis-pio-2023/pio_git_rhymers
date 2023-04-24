package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int QUANTITY_OF_NUMBERS = 12;
    public static final int ERROR_CODE = -1;
    private int[] numbers = new int[QUANTITY_OF_NUMBERS];

    public int total = -1;
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == -1;
        }
            public boolean isFull() {
                return total == 11;
            }

                protected int peekaboo() {
                    if (callCheck())
                        return ERROR_CODE;
                    return numbers[total];
                }
                    public int countOut() {
                        if (callCheck())
                            return ERROR_CODE;
                        return numbers[total--];
                    }

}
