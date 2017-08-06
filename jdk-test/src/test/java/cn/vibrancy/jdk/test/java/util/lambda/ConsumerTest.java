package cn.vibrancy.jdk.test.java.util.lambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created by cwc on 2017/07/20 0020.
 */
@RunWith(JUnit4.class)
public class ConsumerTest {

    @Test
    public void testConsumer() {
        BiFunction<String, String, String[]> split = String::split;
        Consumer<String[]> printArray = (array) -> Arrays.stream(array).forEach(System.out::println);

        printArray.accept(split.apply("my name is cwc", " "));
    }
}
