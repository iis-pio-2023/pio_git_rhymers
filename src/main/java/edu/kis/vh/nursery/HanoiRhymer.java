package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     *
     * @return zwraca ilosc odrzuconych
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     *
     * @param in sprawdza, czy in jest wieksze od peekaboo i zwieksza ilosc odrzuconych
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     *
     * @return getter
     */
    public int getTotalRejected() {
        return totalRejected;
    }

}
