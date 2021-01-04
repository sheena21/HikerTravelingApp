package com.hiker.HikerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiker.HikerApp.entity.BasicDetailsUser;
@Repository
public interface BasicDetailsUserRepo extends JpaRepository<BasicDetailsUser,Integer>{

}
