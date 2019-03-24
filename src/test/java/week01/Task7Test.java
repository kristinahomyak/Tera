package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {

    @Test
    public void testTask() {
        Assert.assertEquals("30  31  32  33", Task7.getNumbers());
    }
}