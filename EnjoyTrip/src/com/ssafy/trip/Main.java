package com.ssafy.trip;

import java.util.ArrayList;

import com.ssafy.trip.food.model.dao.FoodDao;
import com.ssafy.trip.food.model.dao.FoodDaoImpl;
import com.ssafy.trip.food.model.dto.FoodDto;
import com.ssafy.trip.food.model.service.FoodService;
import com.ssafy.trip.food.model.service.FoodServicemImpl;
import com.ssafy.trip.view.TripInfoView;

public class Main {

	public static void main(String[] args) {
		new TripInfoView();

		FoodService foodService = new FoodServicemImpl();
		System.out.println(foodService.search("강서구"));
		
	}
	
}
