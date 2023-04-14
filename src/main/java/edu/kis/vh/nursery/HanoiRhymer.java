package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    public static final int INT3 = 0;
    int totalRejected = INT3;

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
