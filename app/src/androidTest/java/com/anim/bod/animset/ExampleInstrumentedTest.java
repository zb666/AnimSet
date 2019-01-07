package com.anim.bod.animset;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.anim.bod.animset", appContext.getPackageName());

        straightInsert();
    }

    private void straightInsert() {
        int []array = {1,3,6,2,9,7,8};

        for (int i = 1; i < array.length; i++) {
            int j = i;
            //save the original data
            int temp = array[i-1];
            while (j>=0&&array[i]<array[i-1]){
                array[i] = array[i-1];
                j--;
            }
            array[j-1] = temp;
        }
        System.out.print(Arrays.toString(array));
    }

}
