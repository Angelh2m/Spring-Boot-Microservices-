package com.app.servicioitem.models.service;

import java.util.List;

import com.app.servicioitem.models.Item;
import com.app.servicioitem.models.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * ItemServiceImp
 */
@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<Item> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        // TODO Auto-generated method stub
        return null;
    }

    
}