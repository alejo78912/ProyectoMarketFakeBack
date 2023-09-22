package com.Alejandro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.models.Supplier;

import com.Alejandro.repository.ISupplierRepository;


@Service
public class SupplierService {


    @Autowired
	private ISupplierRepository supplierRepository;
	 
    public List<Supplier> suppliers() {
        return supplierRepository.findAll();
    }
	 
	 public Supplier save(Supplier supplier) {
	        return supplierRepository.save(supplier);
	    }

	 public void delete(Long idSupplier) {
		 supplierRepository.deleteById(idSupplier);
	    }

	 
	 
	 public Supplier findByIdSupplier(Long idSupplier) {
	        return supplierRepository.findById(idSupplier).orElse(null);
	    }
	 
	
}
