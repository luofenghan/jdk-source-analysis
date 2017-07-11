package cn.vibrancy.jdk.test.java.io;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.IOException;

/**
 * Created by cwc on 2017/07/11 0011.
 */
@RunWith(JUnit4.class)
public class FileTest {
    private File test;
    private File parent;

    @Before
    public void setup() throws IOException {
        parent = new File(new File("").getAbsolutePath());
        test = File.createTempFile(FileTest.class.getSimpleName(), ".tmp", parent);
        test.deleteOnExit();
    }

    @Test
    public void getParent() {
        System.out.println(test.getAbsolutePath());
        System.out.println(parent.getAbsolutePath());
    }

    @Test
    public void getAbsolutePath() {
        System.out.println(test.getAbsolutePath());
        System.out.println(parent.getAbsolutePath());
    }
}
