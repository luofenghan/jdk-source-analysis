package cn.vibrancy.jdk.test.java.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;

/**
 * Created by cwc on 2017/07/11 0011.
 */
@RunWith(JUnit4.class)
public class BufferedInputStreamTest {

    @Test
    public void read() throws IOException {
        File file = new File("C:\\Users\\cwc\\Desktop\\HDFS架构.vsdx");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            System.out.println(len);
        }
        in.close();
    }

}
