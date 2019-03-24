package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {

    @Test
    public void testTask() {
        Assert.assertEquals("0 35 -59 2", Task3.getNumbers());
    }
}