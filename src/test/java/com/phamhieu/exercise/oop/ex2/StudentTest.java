package com.phamhieu.exercise.oop.ex2;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    final Student student = new Student();

    @Test
    void testFirstName() {
        student.setFirstName("Hiếu");
        assertEquals("Hiếu", student.getFirstName());
    }

    @Test
    void testLastName() {
        student.setLastName("Phạm");
        assertEquals("Phạm", student.getLastName());
    }

    @Test
    void testBirthday() {
        final Date date = new GregorianCalendar(2001, Calendar.MAY, 20).getTime();
        student.setBirthday(date);
        assertEquals(student.getBirthday(), date);
    }

    @Test
    void getClassName() {
        student.setClassName("19TCLC");
        assertEquals("19TCLC", student.getClassName());
    }

    @Test
    void getAddress() {
        student.setAddress("An Thượng 20");
        assertEquals("An Thượng 20", student.getAddress());
    }

    @Test
    void getGender() {
        student.setGender(Gender.MALE);
        assertEquals(Gender.MALE, student.getGender());
    }

    @Test
    void getEmail() {
        student.setEmail("102190311@sv1.dut.udn.vn");
        assertEquals("102190311@sv1.dut.udn.vn", student.getEmail());
    }

    @Test
    void getPhone() {
        student.setPhone("0123456789");
        assertEquals("0123456789", student.getPhone());
    }
}