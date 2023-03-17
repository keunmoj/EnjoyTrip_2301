package com.ssafy.trip.food.model.service;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.trip.food.model.dao.FoodDao;
import com.ssafy.trip.food.model.dao.FoodDaoImpl;
import com.ssafy.trip.food.model.dto.FoodDto;
import com.ssafy.trip.food.model.dto.FoodSearchDto;

public class FoodServicemImpl implements FoodService{
	private FoodDao foodDao;
	
	public FoodServicemImpl() {
		foodDao = new FoodDaoImpl();
	}

	
	// 수정 해야함.
	@Override
	public List<FoodDto> search(String addr) {
		return foodDao.search(addr);
		
	}
	
}
