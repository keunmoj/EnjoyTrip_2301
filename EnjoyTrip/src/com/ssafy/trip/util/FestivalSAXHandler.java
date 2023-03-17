package com.ssafy.trip.util;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.trip.model.festival.Festival;

public class FestivalSAXHandler extends DefaultHandler {
	private List<Festival> fetivals;
	private String temp;
	private Festival f;
	public FestivalSAXHandler() {
		fetivals = new ArrayList<Festival>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes att) {
		temp = "";
		if (qName.equals("item")) {
			// complete code #04
			// tripDto 객체를 생성(이미지 정보 세팅)하고 trips List에 추가하세요.
			f = new Festival();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		if (qName.equals("MAIN_TITLE")) {
			f.setMain_title(temp);
		} else if(qName.equals("SUBTITLE")){
			f.setSub_title(temp);
		} else if(qName.equals("USAGE_DAY_WEEK_AND_TIME")){
			f.setSd_ed(temp);
		} else if(qName.equals("item")) {
			fetivals.add(f);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		temp = new String(ch, start, length);
	}

	public List<Festival> getFestivals() {
		return fetivals;
	}
}