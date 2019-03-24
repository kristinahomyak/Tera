package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task10Test {



    @Test
    public void testTask() {
        Assert.assertEquals("5\n10\n21", Task10.getNumbers());
    }
}