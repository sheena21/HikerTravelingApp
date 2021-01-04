package com.hiker.HikerApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiker.HikerApp.entity.Trek;
import com.hiker.HikerApp.repository.TrekRepo;
import com.hiker.HikerApp.service.TrekService;

@RestController
@RequestMapping("/trek")
public class TrekController {

	  @Autowired
	  private TrekService trekService;
	  
	  @PostMapping(path="/save",produces = "application/json")
	  public ResponseEntity<?> saveTrek(@Valid @RequestBody Trek trek)
	  {
		  Trek saved=trekService.saveTrek(trek);
		  return new ResponseEntity<>(saved,HttpStatus.CREATED);
	  }
	  
	  
	  
	  @GetMapping(path="/alltrek",produces = "application/json")
	  public ResponseEntity<?> getAll()
	  {
		  List<Trek> viewAll=trekService.getAll();
		  return new ResponseEntity<>(viewAll, HttpStatus.OK);
	  }
	  
	  @GetMapping(path = "/trekid/{id}",produces = "application/json")
	  public ResponseEntity<?> viewById(@Valid @PathVariable Integer id)
	  {
		   Trek view=trekService.viewById(id);
		  return new ResponseEntity<>(view,HttpStatus.OK);
	  }
	  
	  @PutMapping(path="/update/{id}",produces = "application/json")
	  public ResponseEntity<?> update(@Valid @PathVariable Integer id, @Valid @RequestBody Trek trek)
	  {
		  Trek updatedTrek=trekService.update(id,trek);
		  return new ResponseEntity<>(updatedTrek,HttpStatus.ACCEPTED);
	  }
	  
	  @DeleteMapping(path="/delete/{id}",produces = "application/json")
	  public ResponseEntity<?> delete(@Valid @PathVariable Integer id,@Valid @RequestBody Trek trek)
	  {
		  Trek deletedTrek=trekService.delete(id,trek);
		  return new ResponseEntity<>(deletedTrek,HttpStatus.OK);
	  }   
	  
	 
}
