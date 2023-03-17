package com.ssafy.trip.food.model.dao;

import java.util.ArrayList;
import java.util.List;


import com.ssafy.trip.food.model.dto.FoodDto;
import com.ssafy.trip.food.util.FoodParser;
import com.ssafy.trip.food.util.FoodSAXHandler;

public class FoodDaoImpl implements FoodDao{
	private List<FoodDto> foodInfo;
	public int size = 1000;
	
	public FoodDaoImpl() {
		loadData();
	}

	@Override
	public void loadData() {
		FoodParser parser = new FoodParser();
		foodInfo = parser.getFoodInfo();
		
	}

	@Override
	public ArrayList<FoodDto> search(String addr) {
		FoodSAXHandler handler = new FoodSAXHandler();
		System.out.println(handler.getFoods());
		List<FoodDto> foodList = handler.getFoods();
		for (int i = 0; i < size; i++) {
			if (foodInfo.get(i).getAddrNm().equals(addr)) {
				foodInfo.add(foodInfo.get(i));
			}
		}

		return (ArrayList<FoodDto>) foodInfo;
	}

}
