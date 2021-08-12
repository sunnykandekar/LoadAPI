package com.LoadsAPI.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class comment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private int cid;
     private String comment;
     
     @OneToOne(mappedBy="comment")
     @JsonBackReference
     private loadbean loadbean;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public loadbean getLoadbean() {
		return loadbean;
	}

	public void setLoadbean(loadbean loadbean) {
		this.loadbean = loadbean;
	}

	public comment(int cid, String comment, com.LoadsAPI.entities.loadbean loadbean) {
		super();
		this.cid = cid;
		this.comment = comment;
		this.loadbean = loadbean;
	}

	public comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "comment [cid=" + cid + ", comment=" + comment + ", loadbean=" + loadbean + "]";
	}

     

}
