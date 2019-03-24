package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test {

    @Test
    public void testTask() {
        Assert.assertEquals("1   2   3   4", Task4.getNumbers());
    }
}