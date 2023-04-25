package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    public static final int TEST_VALUE = 4;
    public static final int COUNT_VALUE = 888;
    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_STACK_VALUE = -1;

    @Test
    public void testCountIn() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        rhymer.countIn(TEST_VALUE);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCallCheck() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(COUNT_VALUE);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(COUNT_VALUE);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCountOut() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
