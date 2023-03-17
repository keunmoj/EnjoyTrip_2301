package com.ssafy.trip.food.util;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.ssafy.trip.food.model.dto.FoodDto;

public class FoodParser {
	private List<FoodDto> foodInfo;
	private int size;
	
	public int num;
	
	public FoodParser() {
		loadData();
	}
	
	private void loadData() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		String tripInfoFilePath = "./res/busan.xml";
//		String tripInfoFilePath = "/Users/ssafy/enjoytrip_1_java_10Jo_LSM_JKM/EnjoyTrip/res/busan.xml";
		File file = new File(tripInfoFilePath);
		
		try {
			SAXParser parser = factory.newSAXParser();
			FoodSAXHandler handler = new FoodSAXHandler();
			parser.parse(file, handler);
			foodInfo = handler.getFoods();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<FoodDto> getFoodInfo() {
		return foodInfo;
	}

	public void setFoodInfo(List<FoodDto> foodInfo) {
		this.foodInfo = foodInfo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
