package com.phamhieu.exercise.oop.ex2;

import java.util.Date;

public class StudentBuilder {
    private final Student student;

    public StudentBuilder() {
        student = new Student();
    }

    public StudentBuilder firstName(final String firstName) {
        student.setFirstName(firstName);
        return this;
    }

    public StudentBuilder lastName(final String lastName) {
        student.setLastName(lastName);
        return this;
    }

    public StudentBuilder email(final String email) {
        student.setEmail(email);
        return this;
    }

    public StudentBuilder gender(final Gender gender) {
        student.setGender(gender);
        return this;
    }

    public StudentBuilder birthday(final Date birthday) {
        student.setBirthday(birthday);
        return this;
    }

    public StudentBuilder className(final String className) {
        student.setClassName(className);
        return this;
    }

    public StudentBuilder address(final String address) {
        student.setAddress(address);
        return this;
    }

    public StudentBuilder phone(final String phone) {
        student.setPhone(phone);
        return this;
    }

    public void build() {
    }
}
