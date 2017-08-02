package com.example.baixu3.hello;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import com.robotium.solo.Solo;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.baixu3.hello", appContext.getPackageName());
    }
    @Rule

    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private Solo solo;
    @Before
    public  void setUp() throws Exception{
        solo = new Solo(InstrumentationRegistry.getInstrumentation(),activityActivityTestRule.getActivity());
    }

    @After
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }

    @Test
    public void testPage() throws Exception{
        solo.unlockScreen();
//        boolean expected = true;
//        boolean result = solo.searchEditText("Hello World!");
//        assertEquals(expected,result);
    }
}
