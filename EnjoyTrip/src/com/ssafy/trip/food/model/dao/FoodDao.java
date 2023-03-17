package com.ssafy.trip.food.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.trip.food.model.dto.FoodDto;


public interface FoodDao {
	public void loadData();
	
	public ArrayList<FoodDto> search(String addr);
}
