package com.backend.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.backend.API.entity.postEntry;

public interface postRepo extends JpaRepository<postEntry, Integer> {
	
}
