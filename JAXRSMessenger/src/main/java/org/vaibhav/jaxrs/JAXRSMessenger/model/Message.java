package org.vaibhav.jaxrs.JAXRSMessenger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {
	private long id;
	private String message;
	private Date created;
	private String author;

	// map to store comments
	public Map<Long, Comment> comments = new HashMap<Long, Comment>();

	// List to store links for Hateos
	public List<Link> listofLinks = new ArrayList<>();

	public List<Link> getListofLinks() {
		return listofLinks;
	}

	public void setListofLinks(List<Link> listofLinks) {
		this.listofLinks = listofLinks;
	}

	public Message() {
	}

	public Message(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// getters and setters for comments map

	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
	
	//for HATEOS support
	public void addLink(String url, String rel){
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		listofLinks.add(link);
	}
}
