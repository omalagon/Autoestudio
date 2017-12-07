package com.oscarmalagon.methodreferences;

import com.oscarmalagon.model.Person;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oscarmalagon on 6/18/17.
 */
public class MethodReferencesExampleTest {

    @Test
    public void testGetAgeMethod () {
        int age = 24;
        Person person = Person.builder().age(age).build();
        int ageFound = MethodReferencesExample.extractAge.apply(person);
        assertEquals(age, ageFound);
    }

}