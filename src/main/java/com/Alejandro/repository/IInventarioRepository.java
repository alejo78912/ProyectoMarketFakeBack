package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Inventario;


public interface IInventarioRepository  extends JpaRepository<Inventario, Long>{

}
