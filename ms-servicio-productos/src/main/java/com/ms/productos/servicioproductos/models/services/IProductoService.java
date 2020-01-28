package com.ms.productos.servicioproductos.models.services;

import java.util.List;

import com.ms.productos.servicioproductos.models.entity.Producto;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);
    
    
}