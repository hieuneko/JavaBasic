package com.phamhieu.exercise.oop.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenderTest {
    @Test
    void getName() {
        final var male = Gender.MALE;
        assertEquals("Male", male.getName());
        final var female = Gender.FEMALE;
        assertEquals("Male", female.getName());
        final var other = Gender.OTHER;
        assertEquals("Male", other.getName());
    }
}