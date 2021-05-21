package com.backend.API.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.API.entity.blogEntry;

@Repository
public interface blogRepo extends CrudRepository<blogEntry, Integer> {

}
