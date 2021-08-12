package com.LoadsAPI.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoadsAPI.entities.loadbean;


@Repository
public interface loadRepository extends JpaRepository <loadbean,Integer>
{
	public loadbean findById(int id);

}
