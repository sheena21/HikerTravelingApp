package com.hiker.HikerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiker.HikerApp.entity.Trek;

@Repository
public interface TrekRepo extends JpaRepository<Trek, Integer> {

}
