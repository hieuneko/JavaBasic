package com.phamhieu.exercise.collection.ex1;

import lombok.Data;

import java.util.List;

@Data
public class District {
    private String idProvince;
    private String idDistrict;
    private String name;

    public String getString(List<Province> provinces) {
        return this.getName() + ", " + provinces.stream().filter(x -> x.getIdProvince().equals(this.idProvince)).findFirst().map(Province::getName).orElse(null);
    }
}
