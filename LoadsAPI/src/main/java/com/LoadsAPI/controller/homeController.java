package com.LoadsAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LoadsAPI.entities.loadbean;
import com.LoadsAPI.services.loadService;

@RestController
public class homeController 
{

	@Autowired
	private loadService loadServices;
	
	
	// get all data
	@GetMapping("/load")
	public List<loadbean> getallLoads()
	{
		   List<loadbean> list =this.loadServices.getAllLoads();
		 
		return list;
	}
	
	// get single data
	@GetMapping("/load/{id}")
		public loadbean getById(@PathVariable("id") int id)
		 {
			
		  loadbean loadbean =this.loadServices.getById(id);
			
			 return loadbean;
		}
		
	// insert /add
	@PostMapping("/load")
	public ResponseEntity<loadbean> AddLoads(@RequestBody loadbean loadbean )
	{
		loadbean load=null;
		try {
		  load =this.loadServices.addload(loadbean);
		 
		 return ResponseEntity.status(HttpStatus.CREATED).body(load);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
	}
	
	

	// delete data
	@DeleteMapping("/load/{id}")
	public void deleteLoads(@PathVariable("id") int id)
	{    try 
	      {
		     this.loadServices.deleteLoads(id);
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  
	      }
		
	}
	
	// update data
	@PutMapping("/load/{id}")
	public loadbean updateLoads(@RequestBody loadbean loadbean, @PathVariable("id") int id)
	{   
		try {
			this.loadServices.updateLoads(loadbean, id);
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return loadbean;
	
	}
	
}
