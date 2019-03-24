package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test {

    @Test
    public void testTask() {
        Assert.assertEquals("1 13 49", Task5.getNumbers());
    }
}