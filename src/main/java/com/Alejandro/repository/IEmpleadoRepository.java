package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Empleado;


public interface IEmpleadoRepository  extends JpaRepository<Empleado, Long>{

}
