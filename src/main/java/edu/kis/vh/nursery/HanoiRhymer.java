package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalNumbersRejected = 0;

    public int reportRejected() {
        return totalNumbersRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalNumbersRejected++;
        else
            super.countIn(in);
    }
}
