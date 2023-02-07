package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc03Test {

    @Test
    void findTheProductOfPrimeFactors() {
        final var test = new Sohoc03();

        assertEquals("0", test.findTheProductOfPrimeFactors(0));
        assertEquals("0", test.findTheProductOfPrimeFactors(1));
        assertEquals("2 * 2 * 2", test.findTheProductOfPrimeFactors(8));
        assertEquals("- 2 * 5", test.findTheProductOfPrimeFactors(-10));
    }
}