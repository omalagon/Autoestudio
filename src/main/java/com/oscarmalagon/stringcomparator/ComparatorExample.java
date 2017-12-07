package com.oscarmalagon.stringcomparator;

import java.util.Comparator;

/**
 * @author oscarmalagon
 * @since 18/06/2017
 */
public class ComparatorExample {

    public static Comparator<String> stringComparator (){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        return comparator;
    }

    public static Comparator<String> java8StringComparator () {
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        return comparator;
    }
}
