package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.SplittableRandom;

public class StringHelperTest extends TestCase {
public static void  testReverse_NullInput(){
    StringHelper helper = new StringHelper();
    String result = helper.reverse(null);
    Assert.assertNull(result);
}
@Test
public void testReverse_PhaseReverted(){
    StringHelper helper = new StringHelper();
    String result = helper.reverse(" this a phrase to check the reverse");
    Assert.assertEquals("esrever rht kcehc ot esarhp a siht", result);
}
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testMain() {
    }
}