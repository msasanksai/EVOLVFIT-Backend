package com.backend.API.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="comments")
public class Comments {

	@Id
	@JsonProperty("cmntid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cmntid;
	@JsonProperty("postid")
	private int postId;
	@JsonProperty("uid")
	private int uid;
	@Column(name="comment",length=512)
	@JsonProperty("comment")
	private String comment;
	@JsonProperty("date")
	private Date upload_date;
	public int getPostid() {
		return postId;
	}
	public void setPostid(int postId) {
		this.postId = postId;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getUpload_date() {
		return upload_date;
	}
	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}
	
}
