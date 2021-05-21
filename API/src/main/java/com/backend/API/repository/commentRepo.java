package com.backend.API.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.API.entity.Comments;

@Repository
public interface commentRepo extends JpaRepository<Comments, Integer> {
		public List<Comments> findByPostId(int postid);
}
