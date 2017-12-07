package com.oscarmalagon.model;

import lombok.*;

/**
 * @author  oscarmalagon
 * @since 6/18/17.
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;
}
