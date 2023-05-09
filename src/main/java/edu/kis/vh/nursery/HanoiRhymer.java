package edu.kis.vh.nursery;

/**
 * HanoiRhymer is a class that extends DefaultCountingOutRhymer and overrides countIn method.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * totalRejected is a counter of rejected numbers.
     */
    private int totalRejected = 0;

    /**
     * reportRejected returns totalRejected.
     * @return totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
