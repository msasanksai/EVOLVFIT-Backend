package com.backend.API.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.API.entity.Comments;
import com.backend.API.entity.blogEntry;
import com.backend.API.entity.blogPostMap;
import com.backend.API.repository.blogRepo;
import com.backend.API.repository.commentRepo;
import com.backend.API.repository.postRepo;

@Service
public class ApiService {

	@Autowired
	private blogRepo bgrepo;
	@Autowired
	private commentRepo comRepo;
//	@Autowired
//	private postReo=o
	public List<blogEntry> getall() {
		return (List<blogEntry>) bgrepo.findAll();
	}
	
	public String addBlog(blogEntry be) {
		if(bgrepo.save(be)!=null)
			return "successfully inserted";
		else
			return "Something's wrong, Try again";
	}
	
	public Optional<blogEntry> getById(int id) {
		return bgrepo.findById(id);
	}
	
	public String delBlog(int id) {
		if(bgrepo.findById(id).isEmpty())
			return "No blog found with given id";
		try
		{
		bgrepo.deleteById(id);
		}
		catch(IllegalArgumentException ae){return "Something's wrong, Try again";}
//		pRepo.DeleteByBlgId(id);
		return "Successfully deleted";
	}

	public String updtBlog(blogEntry e) {
		Optional<blogEntry> be = bgrepo.findById(e.getId());
		if(bgrepo.findById(e.getId()).isEmpty())
			return "No blog found with given id";
		e.setDate(be.get().getDate());
		long millis  = System.currentTimeMillis();
		Date d = new Date(millis);
		e.setLastEdit(d);
		if(bgrepo.save(e)!=null)
		{
			return "Updated Successfully";
		}
		else
		{
			return "Something's wrong, try again";
		}
	}

	public String postComnt(Comments c) {
		try
		{
			comRepo.save(c);
		}
		catch(IllegalArgumentException ie)
		{
			return "Comment insertion unsuccessful try again";
		}
		return "Comment added successfully";
	}

	public List<Comments> getAllCmnt(int postid) {
		return comRepo.findByPostId(postid);
	}


	
}
