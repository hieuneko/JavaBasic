package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String09Test {

    @Test
    void formatCharInString() {
        final var test = new String09();
        assertEquals("Chao Ca.c Ban", test.formatCharInString("CHao cA.C Ban"));
        assertEquals("Viet Chuong Trinh De Format", test.formatCharInString("vIEt ChUOnG tRINH de foRmat"));
    }
}