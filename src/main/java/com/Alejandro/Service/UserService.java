package com.Alejandro.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Alejandro.models.User;
import com.Alejandro.repository.IUserRepository;




@Service
public class UserService {

    @Autowired
	private IUserRepository userRepository;
	 
    public List<User> users() {
        return userRepository.findAll();
    }
	 
	 public User save(User usuario) {
	        return userRepository.save(usuario);
	    }

	 public void delete(Long idUser) {
	        userRepository.deleteById(idUser);
	    }

	 
	 
	 public User findByIdUSer(Long idUser) {
	        return userRepository.findById(idUser).orElse(null);
	    }
	 

	  
	 
	
}
