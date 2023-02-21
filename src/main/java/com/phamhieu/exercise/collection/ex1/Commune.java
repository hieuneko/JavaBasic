package com.phamhieu.exercise.collection.ex1;

import lombok.Data;

import java.util.List;

@Data
public class Commune {
    private String idDistrict;
    private String idCommune;
    private String name;

    public String getString(List<District> districts, List<Province> provinces) {
        return this.getName() + ", " + districts.stream().filter(x -> x.getIdDistrict().equals(this.idDistrict)).findFirst().map(x -> x.getString(provinces)).orElse(null);
    }
}
