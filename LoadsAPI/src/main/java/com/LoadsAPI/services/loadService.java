package com.LoadsAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoadsAPI.entities.loadbean;
import com.LoadsAPI.repositories.loadRepository;

@Service
public class loadService 
{
	

	@Autowired
  private loadRepository loadRepo;
	
	// get All
	public List<loadbean> getAllLoads()
	{
		 List<loadbean> list =this.loadRepo.findAll();
		
		return list;
	}
	
	//insert/ add new details
	public loadbean addload(loadbean loadbean)
	{   
		loadbean result= this.loadRepo.save(loadbean);
		return result;
	}
	// get single data
	public loadbean getById(int id)
	 {
		loadbean loadbean= null;
		try 
		{
			loadbean = this.loadRepo.findById(id);
		
	 	}
         catch(Exception e)
		   {
			e.printStackTrace();
		   }
		 return loadbean;
	}
	
	
	// delete data
	public void deleteLoads(int id)
	{    this.loadRepo.deleteById(id);
		
	}
	
	// update data
	public void updateLoads(loadbean loadbean,int id)
	{   
		loadbean.setShipperid(id);
		this.loadRepo.save(loadbean);
	
	}
	

}
