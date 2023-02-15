package com.phamhieu.exercise.oop.ex3;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
