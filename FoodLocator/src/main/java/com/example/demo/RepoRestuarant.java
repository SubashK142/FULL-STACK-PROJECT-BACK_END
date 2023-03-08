package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.FoodLocator.RestuarantDetails;

public interface RepoRestuarant extends JpaRepository<RestuarantDetails,String>{ 
  
}
