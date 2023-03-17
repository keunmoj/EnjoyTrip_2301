package com.ssafy.trip.food.model.service;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.trip.food.model.dao.FoodDao;
import com.ssafy.trip.food.model.dto.FoodDto;
import com.ssafy.trip.food.model.dto.FoodSearchDto;

public interface FoodService {
	
	public List<FoodDto> search(String addr);

}

//public class FoodService {
//	public List<FoodDto> foodList = new ArrayList<FoodDto>();
//	
//	public ArrayList<FoodDto> getFoodList() {
//		
//	}
//	
//}
