package edu.kis.vh.nursery;
/**
 * FifoRhymer class implementing DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Declaration of temp variable, instance of DefaultCountingOutRhymer
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    /**
     * Method counting out through the rhymer
     * calls countOut() method of a parent class If It's possible
     * @return current value in a rhymer
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
    /**
     * Getter for temp variable
     * @return temp attribute
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}
