package edu.kis.vh.nursery;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static final int COUNT_VALUE = 15;
    public static final int RANDOM_BOUND = 20;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        defaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
        
        for (int i = 1; i < COUNT_VALUE; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < COUNT_VALUE; i++)
            rhymers[3].countIn(rn.nextInt(RANDOM_BOUND));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
        
    }
    
}