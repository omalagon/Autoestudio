package com.oscarmalagon.predicate;

import com.oscarmalagon.model.Person;
import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * @author oscarmalagon
 * @since 6/19/17.
 */
public class PredicateExampleTest {
    @Test
    public void getPredicateJava7() throws Exception {
        assertTrue(PredicateExample.getPredicateJava7().test("Hola"));
        assertFalse(PredicateExample.getPredicateJava7().test("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void getPredicateJava8() throws Exception {
        assertTrue(PredicateExample.getPredicateJava8().test("Hola"));
        assertFalse(PredicateExample.getPredicateJava8().test("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}