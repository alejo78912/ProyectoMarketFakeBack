package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Cart;


public interface ICartRepository  extends JpaRepository<Cart, Long>{

}
