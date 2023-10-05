package org.homework.person;

import org.homework.employee.Gender;
import org.homework.document.Passport;

import java.time.LocalDate;

public class Person {
    Long id;
    String firstName;
    String lastName;
    Gender gender;
    LocalDate birthDate;
    Passport passport;

}
