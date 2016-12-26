package com.udacity.android.gradleproject;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertFalse;


@RunWith(AndroidJUnit4.class)
@MediumTest
public class AsyncTaskTest{

    private Context instrumantationCtx;

    @Before
    public void setup() {
        instrumantationCtx = InstrumentationRegistry.getContext();
    }

    @Test
    public void AsyncTest() {

        String joke = null;
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(instrumantationCtx);
        try {
            joke = asyncTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("Timed out");
        }
        if (joke.equals("connect timed out"))
            fail("Timed out");
    }
}
