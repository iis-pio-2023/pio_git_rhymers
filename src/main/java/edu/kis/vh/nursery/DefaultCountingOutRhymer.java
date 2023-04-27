package edu.kis.vh.nursery;

/**
 * @brief basic rhymer, last inserted value is returned first
 */
public class DefaultCountingOutRhymer {

    private static final int INITIAL_TOTAL = -1;
    private static final int ERROR = -1;
    private static final int NUMBERS_AMOUNT = 12;

    private final int[] numbers = new int[NUMBERS_AMOUNT];
    private int total = INITIAL_TOTAL;

    /**
     * @brief adds value to rhymer numbers
     * @param in - value to add
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @brief checks if rhymers is empty
     * @return true if rhymer is empty, else returns false
     */
    public boolean callCheck() {
        return total == INITIAL_TOTAL;
    }

    /**
     * @brief checks if rhymers is full
     * @return true if rhymer is full, else returns false
     */
    public boolean isFull() {
        return total == NUMBERS_AMOUNT + INITIAL_TOTAL;
    }

    /**
     * @brief gets latest inserted value
     * @return ERROR when rhymer is empty, or latest inserted value
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    /**
     * @brief gets latest inserted value and removes it from rhymer
     * @return ERROR when rhymer is empty, or latest inserted value
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}