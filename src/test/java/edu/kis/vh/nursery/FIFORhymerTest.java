package edu.kis.vh.nursery;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class FIFORhymerTest {

    @Test
    public void testCountOut() {
        FIFORhymer rhymer = new FIFORhymer();
        int[] input = {1, 2, 3, 4, 5};

        for (int i : input) {
            rhymer.countIn(i);
        }

        for (int i : input) {
            assertEquals(i, rhymer.countOut());
        }
    }

    @Test
    public void testCallCheck() {
        FIFORhymer rhymer = new FIFORhymer();

        assertTrue(rhymer.callCheck());

        rhymer.countIn(1);

        assertFalse(rhymer.callCheck());

        rhymer.countOut();

        assertTrue(rhymer.callCheck());
    }

    @Test
    public void testCountInOut() {
        FIFORhymer rhymer = new FIFORhymer();
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};

        for (int i : input1) {
            rhymer.countIn(i);
        }

        assertEquals(1, rhymer.countOut());

        for (int i : input2) {
            rhymer.countIn(i);
        }

        assertEquals(2, rhymer.countOut());
        assertEquals(3, rhymer.countOut());

        for (int i : input2) {
            assertEquals(i, rhymer.countOut());
        }
    }

}