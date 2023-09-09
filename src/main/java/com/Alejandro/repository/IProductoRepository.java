package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Producto;


public interface IProductoRepository  extends JpaRepository<Producto, Long>{

}
