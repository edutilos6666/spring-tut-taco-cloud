package com.edutilos.tacocloud.dao;

import com.edutilos.tacocloud.model.Ingredient;

/**
 * created by  Nijat Aghayev on 17.05.19
 */
public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}

