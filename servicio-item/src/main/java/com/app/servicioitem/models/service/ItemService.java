package com.app.servicioitem.models.service;

import java.util.List;

import com.app.servicioitem.models.Item;

/**
 * ItemService
 */
public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);
    
}