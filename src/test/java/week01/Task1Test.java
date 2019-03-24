package week01;

import org.junit.Assert;
import org.junit.Test;


public class Task1Test {

    @Test
    public void testTask() {
        Assert.assertEquals("3.14", Task1.getPI());
    }
}