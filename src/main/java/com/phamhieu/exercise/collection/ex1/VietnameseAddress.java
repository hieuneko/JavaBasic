package com.phamhieu.exercise.collection.ex1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VietnameseAddress {
    private List<Commune> communes;
    private List<District> districts;
    private List<Province> provinces;
}
