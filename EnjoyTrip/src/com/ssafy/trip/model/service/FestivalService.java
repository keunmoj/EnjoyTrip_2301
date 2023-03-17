package com.ssafy.trip.model.service;

import java.util.List;


import com.ssafy.trip.model.festival.Festival;
import com.ssafy.trip.util.FestivalSAXParser;

public class FestivalService {
	private List<Festival> festivals;
	
	public FestivalService(){
		FestivalSAXParser parser = new FestivalSAXParser();
		this.festivals = parser.getFestivalInfo();
	}
	
	
	public List<Festival> getFestivals() {
		return festivals;
	}
}
