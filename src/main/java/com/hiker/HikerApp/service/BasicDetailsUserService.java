package com.hiker.HikerApp.service;



import java.awt.print.PrinterGraphics;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiker.HikerApp.entity.BasicDetailsUser;
import com.hiker.HikerApp.repository.BasicDetailsUserRepo;

@Service
public class BasicDetailsUserService {
	
	@Autowired
	private BasicDetailsUserRepo basicDetailsUserRepo;

	public BasicDetailsUser save(BasicDetailsUser basicDetailsUser) {
		
		return basicDetailsUserRepo.save(basicDetailsUser);
	}

	public List<BasicDetailsUser> getAll() {
	     return basicDetailsUserRepo.findAll();
	}

	public BasicDetailsUser getById(Integer id) {
		
		return basicDetailsUserRepo.findById(id).get();
	}

	public BasicDetailsUser update(Integer id, BasicDetailsUser basicDetailsUser) {
		basicDetailsUserRepo.findById(id);
		return basicDetailsUserRepo.save(basicDetailsUser);
	}

	public BasicDetailsUser delete(Integer id) {
		
		basicDetailsUserRepo.deleteById(id);
		return null;
	}
	

}
