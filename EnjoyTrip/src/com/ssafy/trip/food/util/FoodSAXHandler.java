package com.ssafy.trip.food.util;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.trip.food.model.dto.FoodDto;

public class FoodSAXHandler extends DefaultHandler{
	List<FoodDto> foodDtos;
	
	private FoodDto foodDto;
	private String data;
	private String temp;
	private Image Image = null;
	
	public FoodSAXHandler() {
		foodDtos = new ArrayList<FoodDto>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		temp = "";
		if (qName.equals("item")) {
			foodDto = new FoodDto();
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("MAIN_TITLE")) {
			foodDto.setTitle(temp);
		}
		else if (qName == "UC_SEQ") {
			foodDto.setTitle(temp);
		}
		else if (qName == "CNTCT_TEL") {
			foodDto.setTellNumber(temp);
		}
		else if (qName.equals("MAIN_IMG_NORMAL")) {
			foodDto.setImage(temp);
		}
		else if (qName.equals("ITEMCNTNTS")) {
			foodDto.setContent(temp);
		}
		else if (qName.equals("PLACE")) {
			foodDto.setPlace(temp);
		}
		else if (qName.equals("USAGE_DAY_WEEK_AND_TIME")) {
			foodDto.setTime(temp);
		}
		else if (qName.equals("GUGUN_NM")) {
			foodDto.setAddrNm(temp);
		}
		else if (qName.equals("ADDR1")) {
			foodDto.setAddress(temp);
		}
		else if (qName.equals("RPRSNTV_MENU")) {
			foodDto.setMenu(temp);
		}
		else if (qName.equals("item")) {
			foodDtos.add(foodDto);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		temp = new String(ch, start, length);
	}
	
	public List<FoodDto> getFoods() {
		return foodDtos;
	}

}
