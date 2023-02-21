package com.phamhieu.exercise.oop.ex3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testStudent() {
        final var student = Student.builder()
                .firstName("Hiếu")
                .lastName("Phạm")
                .email("102190311@sv1.dut.udn.vn")
                .gender(Gender.MALE)
                .address("An Thượng 20")
                .birthday(Date.from(LocalDate.of(2001, 5, 30).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .className("19TCLC")
                .phone("0123456789")
                .build();

        assertEquals("Hiếu", student.getFirstName());
        assertEquals("Phạm", student.getLastName());
        assertEquals(student.getBirthday(), Date.from(LocalDate.of(2001, 5, 30).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        assertEquals("19TCLC", student.getClassName());
        assertEquals("An Thượng 20", student.getAddress());
        assertEquals(Gender.MALE, student.getGender());
        assertEquals("102190311@sv1.dut.udn.vn", student.getEmail());
        assertEquals("0123456789", student.getPhone());
    }
}