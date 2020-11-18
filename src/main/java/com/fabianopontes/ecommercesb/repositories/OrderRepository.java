package com.fabianopontes.ecommercesb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabianopontes.ecommercesb.domain.Orderr;

@Repository
public interface OrderRepository extends JpaRepository<Orderr, Integer>{
	
}
