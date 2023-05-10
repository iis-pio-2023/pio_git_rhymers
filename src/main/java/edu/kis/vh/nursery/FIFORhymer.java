package edu.kis.vh.nursery;

public final class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer countOut = new DefaultCountingOutRhymer();

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
