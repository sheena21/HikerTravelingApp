package com.hiker.HikerApp.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hiker.HikerApp.entity.Trek;
import com.hiker.HikerApp.repository.TrekRepo;

@Service

public class TrekService {
   
	 @Autowired
	 private TrekRepo trekRepo;
	 
	 public Trek saveTrek(Trek trek) {
		 return trekRepo.save(trek) ;
	}

	public List<Trek> getAll() {
		return trekRepo.findAll();
	}

	public Trek viewById(Integer id) {
		
		return trekRepo.findById(id).get();
	}

	public Trek update( Integer id, Trek trek) {
		trekRepo.findById(id);
		return trekRepo.save(trek);
	}

	public Trek delete(Integer id,Trek trek) {
		Optional<Trek> op=trekRepo.findById(id);
		
		if(op.isPresent())
		{
			trek=op.get();
			trek.setStatus(false);
			return trekRepo.save(trek);
		}
		else 
			return null;
		}

}
