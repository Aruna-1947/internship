package com.javatechie.h2.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;



import com.javatechie.h2.api.model.user;

public interface userRepository extends JpaRepository<user,Integer> {


	List<user> findByFname(String fname);
	

}
