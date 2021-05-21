package com.backend.API.entity;

import java.io.Serializable;

public class myKey implements Serializable{
	private int id;
	private int post_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	
}
