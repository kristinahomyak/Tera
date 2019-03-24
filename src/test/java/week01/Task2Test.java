package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {

    @Test
    public void testGetFive() {
        Assert.assertEquals("-52 -15 6 20", Task2.getNumbers());
    }
}