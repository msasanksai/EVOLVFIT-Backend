package com.backend.API.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "postEntry")
public class postEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("postid")
	private int postid;
	@JsonProperty("blgid")
	private int blgid;
	@JsonProperty("uid")
	private int uid;
	@JsonProperty("title")
	private String title;
	@JsonProperty("content")
	@Lob
	@Column(name="content",length=1000)
	private String content;
	@JsonProperty("pdate")
	private Date post_date;
	@JsonProperty("ldate")
	private Date Last_edit;
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	public Date getLast_edit() {
		return Last_edit;
	}
	public void setLast_edit(Date last_edit) {
		Last_edit = last_edit;
	}
	
}
