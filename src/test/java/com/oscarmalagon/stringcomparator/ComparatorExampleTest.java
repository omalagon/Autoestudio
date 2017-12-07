package com.oscarmalagon.stringcomparator;

import com.oscarmalagon.stringcomparator.ComparatorExample;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author oscarmalagon
 * @since 18/06/2017
 */
public class ComparatorExampleTest {
    @Test
    public void stringComparator() {
        List<String> list = Arrays.asList("a", "abcde", "abc", "abcd", "");
        list.sort(ComparatorExample.stringComparator());
        assertEquals(Arrays.asList("", "a", "abc", "abcd", "abcde"), list);
    }

    @Test
    public void java8StringComparator() {
        List<String> list = Arrays.asList("a", "abcde", "abc", "abcd", "");
        list.sort(ComparatorExample.java8StringComparator());
        assertEquals(Arrays.asList("", "a", "abc", "abcd", "abcde"), list);
    }

}