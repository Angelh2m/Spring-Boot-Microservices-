package com.ms.productos.servicioproductos.models.services;

import java.util.List;

import com.ms.productos.servicioproductos.models.dto.ProductoDto;
import com.ms.productos.servicioproductos.models.entity.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoDto productoDto;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {

        return (List<Producto>) productoDto.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {

        return productoDto.findById(id).orElse(null);
    }

    
}