package com.phamhieu.exercise.oop.ex2;

import java.util.Date;

public class StudentBuilder {
    private Student student;

    public StudentBuilder() {
        student = new Student();
    }

    public StudentBuilder firstName(String firstName) {
        student.setFirstName(firstName);
        return this;
    }

    public StudentBuilder lastName(String lastName) {
        student.setLastName(lastName);
        return this;
    }

    public StudentBuilder email(String email) {
        student.setEmail(email);
        return this;
    }

    public StudentBuilder gender(Gender gender) {
        student.setGender(gender);
        return this;
    }

    public StudentBuilder birthday(Date birthday) {
        student.setBirthday(birthday);
        return this;
    }

    public StudentBuilder className(String className) {
        student.setClassName(className);
        return this;
    }

    public StudentBuilder address(String address) {
        student.setAddress(address);
        return this;
    }

    public StudentBuilder phone(String phone) {
        student.setPhone(phone);
        return this;
    }

    public Student build() {
        return student;
    }
}
