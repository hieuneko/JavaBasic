package com.phamhieu.exercise.oop.ex3;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Student {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String className;
    private String address;
    private Gender gender;
    private String email;
    private String phone;
}