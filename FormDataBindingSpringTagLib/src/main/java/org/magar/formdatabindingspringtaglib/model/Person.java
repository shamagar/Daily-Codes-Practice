package org.magar.formdatabindingspringtaglib.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person
{
    private Integer id;
    private String firstName;
    private String lastName;
    private String city;
    private Double salary;
}
