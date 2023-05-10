package edu.kis.vh.nursery;

/**
 * Represents a default counting out rhymer.
 */
public class defaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];
    private int total = -1;

    /**
     * Adds a number to the counting out rhymer.
     *
     * @param in The number to be counted in.
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Checks if the counting out rhymer is empty.
     *
     * @return {@code true} if the counting out rhymer is empty, {@code false} otherwise.
     */
    boolean callCheck() {
        return total == -1;
    }

    /**
     * Checks if the counting out rhymer is full.
     *
     * @return {@code true} if the counting out rhymer is full, {@code false} otherwise.
     */
    boolean isFull() {
        return total == 11;
    }

    /**
     * Retrieves the top element of the counting out rhymer without removing it.
     *
     * @return The top element of the counting out rhymer, or {@code -1} if the rhymer is empty.
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    /**
     * Retrieves and removes the top element from the counting out rhymer.
     *
     * @return The top element of the counting out rhymer, or {@code -1} if the rhymer is empty.
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

    /**
     * Retrieves the total number of elements in the counting out rhymer.
     *
     * @return The total number of elements in the counting out rhymer.
     */
    public int getTotal() {
        return total;
    }

}