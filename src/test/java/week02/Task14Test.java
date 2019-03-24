package week02;

import org.junit.Assert;
import org.junit.Test;

public class Task14Test {

    @Test
    public void testTask() {
        Assert.assertEquals("sum / numbers.length", new Task14().getArithmetic());
    }
}