package com.oscarmalagon.threads.racecondition;

/**
 * @author oscarmalagon
 * @since 11/27/17.
 */
public class RaceCondition {

    public static void raceCondition() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000; i++) {
                longWrapper.increment();
            }
        };

        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println(longWrapper.getL());
    }

}
