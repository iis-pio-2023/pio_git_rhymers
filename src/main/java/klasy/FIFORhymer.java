package klasy;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

/**
 * This class represents a special type of stack called FIFORhymer,
 * which extends the DefaultCountingOutRhymer class.
 * It follows the FIFO (First-In-First-Out) order for adding and removing elements.
 */
public final class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * The secondary stack used for maintaining the FIFO order of elements.
     */
    public final DefaultCountingOutRhymer countOut = new DefaultCountingOutRhymer();

    /**
     * Removes and returns the top element from the stack in the FIFO order.
     * If the main stack is not empty, elements are transferred to the secondary stack
     * to reverse their order and maintain the FIFO order.
     *
     * @return The top element from the stack.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            countOut.countIn(super.countOut());

        int ret = countOut.countOut();

        while (!countOut.callCheck())
            countIn(countOut.countOut());

        return ret;
    }
}