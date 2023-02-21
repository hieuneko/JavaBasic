package com.phamhieu.exercise.collection.ex1;

import lombok.Data;

import java.util.List;

@Data
public class VietnameseAddress {
    private List<Commune> communes;
    private List<District> districts;
    private List<Province> provinces;
}
