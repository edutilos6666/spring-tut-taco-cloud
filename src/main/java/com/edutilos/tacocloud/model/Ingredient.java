package com.edutilos.tacocloud.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * created by  Nijat Aghayev on 16.05.19
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
