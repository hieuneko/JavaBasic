package com.phamhieu.exercise.oop.ex2;

import org.junit.jupiter.api.Test;

import java.util.Date;

class StudentBuilderTest {
    @Test
    void testStudent() {
        StudentBuilder student = new StudentBuilder()
                .firstName("Hiếu")
                .lastName("Phạm")
                .email("102190311@sv1.dut.udn.vn")
                .gender(Gender.MALE)
                .birthday(new Date())
                .address("20 an thượng")
                .className("19TCLC")
                .phone("0123456789");
        student.build();
    }
}