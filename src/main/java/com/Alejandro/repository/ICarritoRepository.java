package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Carrito;


public interface ICarritoRepository  extends JpaRepository<Carrito, Long>{

}
