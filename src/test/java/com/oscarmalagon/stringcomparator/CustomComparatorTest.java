package com.oscarmalagon.stringcomparator;

import com.oscarmalagon.model.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by oscarmalagon on 6/18/17.
 */
public class CustomComparatorTest {
    @Test
    public void compare() throws Exception {
    }

    @Test
    public void comparing() throws Exception {
        Comparator<Person> cmpPersonAge = CustomComparator.comparing(Person::getAge);
        Person p1 = Person.builder().age(24).build();
        Person p2 = Person.builder().age(50).build();
        Person p3 = Person.builder().age(34).build();

        List<Person> people = Arrays.asList(p1, p2, p3);
        people.sort(cmpPersonAge);
        assertEquals(Arrays.asList(p1, p3, p2), people);
    }

    @Test
    public void chainedComparator() {
        Comparator<Person> chainedComparator = CustomComparator.comparing(Person::getAge)
                .thenComparing(Person::getName);
        Person p1 = Person.builder().age(24).name("Oscar").build();
        Person p2 = Person.builder().age(24).name("Yuri").build();
        Person p3 = Person.builder().age(24).name("Constanza").build();

        List<Person> people = Arrays.asList(p1, p2, p3);
        people.sort(chainedComparator);
        assertEquals(Arrays.asList(p3, p1, p2), people);
    }

}