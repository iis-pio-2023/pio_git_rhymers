package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class HanoiRhymerTest {

   HanoiRhymer rhymer;

   public void run(){
       rhymer = new HanoiRhymer();
       for (int i = 1; i < 15; i++)
           for (int j = 0; j < 3; j++)
               rhymer.countIn(i);

       Random rn = new Random();
       for (int i = 1; i < 15; i++)
           rhymer.countIn(rn.nextInt(20));
   }
    @Test
    public void reportRejected() {
        run();
        assertTrue(rhymer.reportRejected() > 0);
    }

    @Test
    public void getTotalRejected() {
       run();
       assertTrue(rhymer.getTotalRejected() > 0);
    }
}