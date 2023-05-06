package edu.kis.vh.nursery;

/**
 *A class that implements a counting-out rhymer, which is used to
 * keep track of a sequence of integers that can be added or removed
 * in a LIFO (Last In, First Out) manner.
 */
public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int STACK_INITIAL_INDEX = -1;
    private static final int STACK_CAPACITY = 12;
    private static final int STACK_LAST_INDEX = STACK_CAPACITY-1;
    private final int[] numbers = new int[STACK_CAPACITY];
    private int total = STACK_INITIAL_INDEX;

    /**
     * Add an integer to the top of the rhymer.
     * @param in the integer to add to the rhymer
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Check if the rhymer is empty.
     * @return true if the rhymer is empty, false otherwise
     */
    public boolean callCheck() {
        return total == STACK_INITIAL_INDEX;
    }

    /**
     * Check if the rhymer is full.
     * @return true if the rhymer is full, false otherwise
     */
    public boolean isFull() {
        return total == STACK_LAST_INDEX;
    }

    /**
     * Return the integer at the top of the rhymer without removing it.
     * @return the integer at the top of the rhymer, or an empty rhymer indicator if the rhymer is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    /**
     * Remove and return the integer at the top of the rhymer.
     * @return the integer at the top of the rhymer, or an empty rhymer indicator if the rhymer is empty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

    /**
     * Get the total number of integers in the rhymer.
     * @return the total number of integers in the rhymer
     */
    public int getTotal() {
        return total;
    }
}