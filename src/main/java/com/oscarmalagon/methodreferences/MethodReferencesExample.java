package com.oscarmalagon.methodreferences;

import com.oscarmalagon.model.Person;

import java.util.function.Function;

/**
 * @author oscarmalagon
 * @since 6/18/17.
 */
public class MethodReferencesExample {

    public static Function<Person, Integer> extractAge = person -> person.getAge();
}
