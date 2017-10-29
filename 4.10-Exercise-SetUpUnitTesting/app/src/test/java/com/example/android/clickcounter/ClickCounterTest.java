package com.example.android.clickcounter;

import org.junit.Test;

/**
 * Created by Psych on 10/29/17.
 */
public class ClickCounterTest {
    @Test
    public void increment() throws Exception {
        ClickCounter counter = new ClickCounter();
        counter.increment();
        assert counter.getCount() == 1;
    }

    @Test
    public void getCount() throws Exception {
        assert new ClickCounter().getCount() == 0;
    }

}