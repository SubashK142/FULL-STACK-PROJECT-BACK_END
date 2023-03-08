package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RepoRestuarant;
import com.example.demo.service;
import com.example.demo.FoodLocator.RestuarantDetails;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class ApiController {
	@Autowired
	
	private RepoRestuarant Rest; 
	
	@Autowired 
	private service ser;

	@PostMapping("/restuarantdetails")
	public RestuarantDetails create(@RequestBody RestuarantDetails a)
	{
		return Rest.save(a);
	}
    
    @GetMapping("restuarant")
    public List<RestuarantDetails> getDetails(){
  	  return Rest.findAll();   
    }
    
    @PutMapping("/update")
    public String update(@RequestBody RestuarantDetails a) {
    	return ser.updateModel(a);
    }
    
    @DeleteMapping("/delete/{restaurantName}")
	public String delete(@PathVariable String restaurantName) {
		return ser.deletedetails(restaurantName);
	}

}
