package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void countInShouldInsertGivenValueOnStack() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void callCheckShouldReturnTrueWhenRhymerIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);
    }

    @Test
    public void callCheckShouldReturnFalseWhenRhymerIsNotEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(888);
        boolean result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void isFullShouldReturnFalseWhenRhymerIsNotFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }
    }

    @Test
    public void isFullShouldReturnTrueWhenRhymerIsNotFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }

    @Test
    public void peekabooShouldReturnEmptyStackValueWhenRhymerIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void peekabooShouldReturnLastInsertedValueWhenRhymerIsNotEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void peekabooShouldNotRemoveLastInsertedValue() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void countOutShouldReturnEmptyStackValueWhenRhymerIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void countOutShouldReturnLastInsertedValueWhenRhymerIsNotEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void countOutShouldReturnEmptyStackValueWhenRhymerIsEmptiedAgain() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int testValue = 4;
        rhymer.countIn(testValue);

        rhymer.countOut();
        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
