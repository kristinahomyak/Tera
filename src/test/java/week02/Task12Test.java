package week02;

import org.junit.Assert;
import org.junit.Test;

public class Task12Test {

    @Test
    public void testTask() {
        int number = -20;
        Assert.assertEquals(20, Task12.getModule(number));
    }
}