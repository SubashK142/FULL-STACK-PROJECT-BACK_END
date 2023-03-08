package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodLocator.RestuarantDetails;



@Service
public class service  {

    @Autowired
    private RepoRestuarant studentRepository;

//    public Student saveStudent(Student student) {
//        return studentRepository.save(student);
//    }
    public String updateStudent(RestuarantDetails a)
	{
		studentRepository.save(a);
		return "updated";
	}
    
    public String updateModel(RestuarantDetails d) {
    	studentRepository.save(d);
    	return "updated";
    }
    public String deletedetails(String restaurantName) {
		studentRepository.deleteById(restaurantName);
		return "Deleted";
	}
}