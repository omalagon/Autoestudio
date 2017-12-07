package com.oscarmalagon.threads;

/**
 * @author oscarmalagon
 * @since 11/27/17.
 */
public class FirstThread {
    public static Thread getThread() {
        Runnable runnable = () -> {
            System.out.println("Current thread :" + Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        return thread;
    }
}
