package com.oscarmalagon.mapfilterreduce;

import com.oscarmalagon.model.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author oscarmalagon
 * @since 6/20/17.
 */
public class MapFilterReduceTest {


    @Test
    public void testMapFilterReduce () {
        Person person1 = Person.builder().age(10).build();
        Person person2 = Person.builder().age(20).build();
        Person person3 = Person.builder().age(30).build();
        Person person4 = Person.builder().age(40).build();
        Person person5 = Person.builder().age(1).build();
        Person person6 = Person.builder().age(50).build();
        Person person7 = Person.builder().age(14).build();
        Person person8 = Person.builder().age(16).build();
        Person person9 = Person.builder().age(34).build();
        Person person10 = Person.builder().age(65).build();
        Person person11 = Person.builder().age(12).build();

        List<Person> people = Arrays.asList(person1,
                person2, person3, person4, person5,
                person6, person7, person8, person9,
                person10, person11);

        List<Person> peopleYoungerThan20 = people.stream()
                .filter( person ->  person.getAge() < 20)
                .collect(Collectors.toList());
        int total = peopleYoungerThan20.size() > 0 ?  peopleYoungerThan20.size() : 1;

        int avgAge = peopleYoungerThan20
                .stream()
                .map(Person::getAge)
                .reduce(0, (a,b) -> a + b) / total ;
        assertEquals(10, avgAge);
    }
}
