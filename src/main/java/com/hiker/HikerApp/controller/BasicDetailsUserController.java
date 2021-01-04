package com.hiker.HikerApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hiker.HikerApp.entity.BasicDetailsUser;
import com.hiker.HikerApp.service.BasicDetailsUserService;



@RestController
@RequestMapping("/profile")
public class BasicDetailsUserController {
	
	@Autowired
	private BasicDetailsUserService basicDetailsUserService;
    
	@PostMapping(path = "/save",produces ="application/json")
	public ResponseEntity<?> save(@Valid @RequestBody BasicDetailsUser basicDetailsUser){
		BasicDetailsUser saved=basicDetailsUserService.save(basicDetailsUser);
		return new ResponseEntity<>(saved,HttpStatus.CREATED);
	}
	
    @GetMapping(path="/get",produces = "application/json")
    public ResponseEntity<?> getAll(){
    	List<BasicDetailsUser> getlist=basicDetailsUserService.getAll();
    	return new ResponseEntity<>(getlist,HttpStatus.OK);
    }
    
    @GetMapping(path="/getbyid/{id}",produces="application/json")
    public ResponseEntity<?> getById(@Valid @PathVariable Integer id){
    	BasicDetailsUser getOne=basicDetailsUserService.getById(id);
		return new ResponseEntity<>(getOne,HttpStatus.OK);
     }
     
    @PutMapping(path="/update/{id}",produces = "application/json")
     public ResponseEntity<?> update(@Valid @PathVariable Integer id,@Valid @RequestBody BasicDetailsUser basicDetailsUser)
     {
    	BasicDetailsUser updated=basicDetailsUserService.update(id,basicDetailsUser);
    	return new ResponseEntity<>(updated,HttpStatus.ACCEPTED);
     }
    
    @DeleteMapping(path = "/delete/{id}",produces="application/json")
    public ResponseEntity<?> delete(@Valid @PathVariable Integer id)
    {
    	BasicDetailsUser deleted = basicDetailsUserService.delete(id);
    	return new ResponseEntity<>(deleted,HttpStatus.OK);
    }
    
	
}


