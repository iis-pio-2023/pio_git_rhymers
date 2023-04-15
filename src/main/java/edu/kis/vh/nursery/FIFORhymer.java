package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer tempDeafult = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            tempDeafult.countIn(super.countOut());

        int ret = tempDeafult.countOut();

        while (!tempDeafult.callCheck())
            countIn(tempDeafult.countOut());

        return ret;
    }
}
