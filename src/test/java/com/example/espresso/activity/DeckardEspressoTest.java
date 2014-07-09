package com.example.espresso.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import com.example.robolectric.DeckardActivity;

@LargeTest
public class DeckardEspressoTest extends ActivityInstrumentationTestCase2<DeckardActivity> {

    @SuppressWarnings("deprecation")
     public DeckardEspressoTest() {
       super(DeckardActivity.class);
     }
    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testCheckText() {
            assertTrue(false);
      }
}