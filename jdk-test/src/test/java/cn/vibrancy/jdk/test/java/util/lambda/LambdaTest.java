package cn.vibrancy.jdk.test.java.util.lambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.stream.Stream;

/**
 * Created by cwc on 2017/07/20 0020.
 */
@RunWith(JUnit4.class)
public class LambdaTest {
    private Stream<String> stream(String... others) {
        String[] defaultArray = {};
        return Stream.of(defaultArray);
    }

    @Test
    public void foreach() {
        stream().forEach(System.out::println);
    }

    @Test
    public void filter() {
        Stream.of(1, 2, 3, 4, 5, 6)
                .unordered()
                .filter(i -> i % 2 == 0)
                .map(i -> i *= 2)
                .forEach(System.out::println);
    }


}
