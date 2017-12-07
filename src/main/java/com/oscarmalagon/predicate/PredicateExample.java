package com.oscarmalagon.predicate;

import java.util.function.Predicate;

/**
 * @author oscarmalagon
 * @since 6/19/17.
 */
public class PredicateExample {

    public static Predicate<String> getPredicateJava7() {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };

        return predicate;
    }

    public static Predicate<String> getPredicateJava8() {
        Predicate<String> predicate = (s) -> s.length() < 20;
        return predicate;
    }

}
