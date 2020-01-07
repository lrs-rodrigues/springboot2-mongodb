package com.lucas.coursemongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String text;
	private Date date;
	
	private AuthorDTO user;
	
	public CommentDTO() {}

	public CommentDTO(String text, Date date, AuthorDTO user) {
		this.text = text;
		this.date = date;
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getUser() {
		return user;
	}

	public void setUser(AuthorDTO user) {
		this.user = user;
	}
}
