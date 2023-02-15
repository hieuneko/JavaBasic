package com.phamhieu.exercise.oop.ex3;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
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
