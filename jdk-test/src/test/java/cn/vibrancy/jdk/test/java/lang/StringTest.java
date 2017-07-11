package cn.vibrancy.jdk.test.java.lang;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by cwc on 2017/07/11 0011.
 */
@RunWith(JUnit4.class)
public class StringTest {
    @Test
    public void lastIndexOf() throws Exception {
        String parent = "i am people";
        String child = "am";

        Assert.assertEquals(2, parent.indexOf(child));
    }

    @Test
    public void toUpperCase() throws Exception{
        String parent = "aaa";
        Assert.assertEquals("AAA", parent.toUpperCase());
    }

}