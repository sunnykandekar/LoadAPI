package com.LoadsAPI.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class loadbean 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private int shipperid;
     private String productType;
     private String truckType;
     private String loadingPoint;
     private int noOFTruck;
     private String unloadingPoint;
     private String weight;
     
     @Temporal(value =TemporalType.DATE)
     private  Date date =new Date();
     
     @OneToOne(cascade=CascadeType.ALL)
     @JsonManagedReference
     private comment comment;

     
     //
	public int getShipperid() {
		return shipperid;
	}

	public void setShipperid(int shipperid) {
		this.shipperid = shipperid;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public int getNoOFTruck() {
		return noOFTruck;
	}

	public void setNoOFTruck(int noOFTruck) {
		this.noOFTruck = noOFTruck;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public comment getComment() {
		return comment;
	}

	public void setComment(comment comment) {
		this.comment = comment;
	}

	public loadbean(int shipperid, String productType, String truckType, String loadingPoint, int noOFTruck,
			String unloadingPoint, String weight, Date date, com.LoadsAPI.entities.comment comment) {
		super();
		this.shipperid = shipperid;
		this.productType = productType;
		this.truckType = truckType;
		this.loadingPoint = loadingPoint;
		this.noOFTruck = noOFTruck;
		this.unloadingPoint = unloadingPoint;
		this.weight = weight;
		this.date = date;
		this.comment = comment;
	}

	public loadbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "loadbean [shipperid=" + shipperid + ", productType=" + productType + ", truckType=" + truckType
				+ ", loadingPoint=" + loadingPoint + ", noOFTruck=" + noOFTruck + ", unloadingPoint=" + unloadingPoint
				+ ", weight=" + weight + ", date=" + date + ", comment=" + comment + "]";
	}
     

	
	

}
