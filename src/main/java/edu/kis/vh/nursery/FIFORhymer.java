package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer countOut = new defaultCountingOutRhymer();
    
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
