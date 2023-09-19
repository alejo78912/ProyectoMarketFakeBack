package com.Alejandro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Alejandro.models.Category;
import com.Alejandro.models.Product;

@Repository
public interface IProductRepository  extends JpaRepository<Product, Long>{

	List<Product> findByCategory (Category category);
	
}
