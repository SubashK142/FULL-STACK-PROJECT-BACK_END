package com.example.demo.FoodLocator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class RestuarantDetails {
   @Id   
   private String RestuarantName;
   private String FoodName;
   private int Rating;
   private String Location;
   
     
   public String getRestuarantName() {
	   return RestuarantName;
   }
   public void setRestuarantName(String restuarantName) {
	   RestuarantName = restuarantName;
   }
   public String getFoodName() {
	return FoodName;
   }
   public void setFoodName(String foodName) {
	FoodName = foodName;
   }
   public int getRating() {
	return Rating;
    }
   public void setRating(int rating) {
	Rating = rating;
   }
   public String getLocation() {
	return Location;
   }
   public void setLocation(String location) {
	Location = location;
   }





   
}
