package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{

    public static int SIZE = 12;
    public static int ZMIENNA = -1;
    private int[] numbers = new int[SIZE];

    public int total = ZMIENNA;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == ZMIENNA;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ZMIENNA;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ZMIENNA;
                        return numbers[total--];
                    }

}
