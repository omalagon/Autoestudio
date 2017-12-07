package com.oscarmalagon.threads.racecondition;

/**
 * @author oscarmalagon
 * @since 11/27/17.
 */
public class LongWrapper {

    private long l;

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getL() {
        return l;
    }

    public synchronized void increment() {
        this.l += 1;
    }
}
