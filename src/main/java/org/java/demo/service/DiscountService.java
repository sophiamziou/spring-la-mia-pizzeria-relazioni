package org.java.demo.service;

import java.util.List;
import java.util.Optional;

import org.java.demo.pojo.Discount;
import org.java.demo.repo.DiscountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

	@Autowired
	private DiscountRepo discRepo;
	
	public List<Discount> findAll() {
		
		return discRepo.findAll();
	}
	public Discount save(Discount disc) {
		
		return discRepo.save(disc);
	}
	public Optional<Discount> findById(int id) {
		
		return discRepo.findById(id);
	}
	
}
