package cn.vibrancy.jdk.test.java.lang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by cwc on 2017/07/11 0011.
 */
@RunWith(JUnit4.class)
public class IntegerTest {
    @Test
    public void testToString() {
        int ten = 10;
        System.out.println(Integer.toString(10,16));
    }
}
