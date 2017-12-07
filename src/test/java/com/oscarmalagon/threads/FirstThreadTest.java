package com.oscarmalagon.threads;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author oscarmalagon
 * @since 11/27/17.
 */
public class FirstThreadTest {

    @Test
    public void getThread() throws Exception {
        Thread thread = FirstThread.getThread();
        thread.setName("Oscar");
        thread.start();
    }

}