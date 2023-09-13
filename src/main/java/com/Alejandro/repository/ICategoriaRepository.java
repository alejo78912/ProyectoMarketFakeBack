package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Categoria;



public interface ICategoriaRepository  extends JpaRepository<Categoria, Long>{

}
