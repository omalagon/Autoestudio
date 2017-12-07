package com.oscarmalagon.stringcomparator;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by oscarmalagon on 6/18/17.
 */
@FunctionalInterface
public interface CustomComparator<T>{

    public int compare (T t1, T t2);

    public default Comparator<T> thenComparing(Comparator<T> cmp) {
        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1,p2) : compare(p1, p2);
    }

    public default Comparator<T> thenComparing(Function<T, Comparable> function) {
        return thenComparing(comparing(function));
    }

    public static <U> Comparator<U> comparing (Function<U, Comparable> function) {
        return (p1, p2) -> function.apply(p1).compareTo(function.apply(p2));
    }
}
