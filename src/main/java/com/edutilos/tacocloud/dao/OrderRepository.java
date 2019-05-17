package com.edutilos.tacocloud.dao;

import com.edutilos.tacocloud.model.Order;

/**
 * created by  Nijat Aghayev on 17.05.19
 */
public interface OrderRepository {
    Order save(Order order);
}
