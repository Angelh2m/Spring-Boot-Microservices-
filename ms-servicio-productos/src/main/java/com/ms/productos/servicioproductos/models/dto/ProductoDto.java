package com.ms.productos.servicioproductos.models.dto;

import com.ms.productos.servicioproductos.models.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductoDto extends CrudRepository<Producto, Long> {

    

    
}