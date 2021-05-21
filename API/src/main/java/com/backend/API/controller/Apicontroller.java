package com.backend.API.controller;

import java.util.List;
import java.util.Optional;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.API.entity.Comments;
import com.backend.API.entity.blogEntry;
import com.backend.API.entity.blogPostMap;
import com.backend.API.service.ApiService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/blog")
public class Apicontroller {

	@Autowired
	private ApiService apiS;
	
	@GetMapping(value="/get/all")
	private List<blogEntry> getall()
	{
		return apiS.getall();
	}
	
	@GetMapping(value="get/{id}")
	private Optional<blogEntry> getById(@PathVariable("id") int id)
	{
		return apiS.getById(id);
	}
	
	@PostMapping(value = "/post")
	private String addBlog(@RequestBody blogEntry be)
	{
		long millis  = System.currentTimeMillis();
		Date d = new Date(millis);
		be.setDate(d);
		be.setLastEdit(d);
		return apiS.addBlog(be);
	}
	@DeleteMapping(value="/del/{id}")
	private String delBlog(@PathVariable int id)
	{
		return apiS.delBlog(id);
	}
	
	@PutMapping(value="/updt")
	private String updtBlog(@RequestBody blogEntry e)
	{
		return apiS.updtBlog(e);
	}
	
	@PostMapping(value="/pst/cmnt")
	private String postComnt(@RequestBody Comments c)
	{
		long millis  = System.currentTimeMillis();
		Date d = new Date(millis);
		c.setUpload_date(d);
		return apiS.postComnt(c);
	}
	
	@GetMapping(value = "/pst/{postid}/cmnt/get/all")
	private List<Comments> getAllCmnt(@PathVariable int postid)
	{
		return apiS.getAllCmnt(postid);
	}
	
}
