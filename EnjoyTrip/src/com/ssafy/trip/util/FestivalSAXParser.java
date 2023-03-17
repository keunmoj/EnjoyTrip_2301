package com.ssafy.trip.util;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.ssafy.trip.model.festival.Festival;


public class FestivalSAXParser {
	private List<Festival> festivals;
	
	public FestivalSAXParser() {
		loadData();
	}

	/**
	 * TouristDestinationSAXHandler를 이용 파싱한 관광지 정보를 추출한다.
	 */
	private void loadData() {

		SAXParserFactory factory = SAXParserFactory.newInstance();

		String tripInfoFilePath = "./res/축제.xml";
//		String tripInfoFilePath = "/Users/ssafy/enjoytrip_1_java_10Jo_LSM_JKM/EnjoyTrip/res/축제.xml";
		File file = new File(tripInfoFilePath);
		try {
			SAXParser parser = factory.newSAXParser();
			FestivalSAXHandler handler = new FestivalSAXHandler();
			parser.parse(file, handler);
			festivals = handler.getFestivals();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Festival> getFestivalInfo() {
		return festivals;
	}

	public void setFestivalsInfo(List<Festival> festivalsInfo) {
		this.festivals = festivalsInfo;
	}

}
