package com.ssafy.trip.food.model.dto;

import java.net.URL;

public class FoodDto {
	/* 음식 이름 */
	private String title;
	/* 음식 id */
	private int foodId;
	/* 전화번호 */
	private String tellNumber;
	/* 이미지 url */
	private String image;
	/* 상세내용 */
	private String content;
	/* 장소  */
	private String place; 
	/* 지역 */
	private String addrNm;
	/* 영업시간 */
	private String time;
	/* 주소 */
	private String address;
	/* 대표 메뉴 */
	private String menu;
	
	public FoodDto() {};
	
	public FoodDto(String title, int foodId, String tellNumber, String image, String content, String place, String addrNm, String time,
			String address, String menu) {
		super();
		this.title = title;
		this.foodId = foodId;
		this.tellNumber = tellNumber;
		this.image = image;
		this.content = content;
		this.place = place;
		this.addrNm = addrNm;
		this.time = time;
		this.address = address;
		this.menu = menu;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getTellNumber() {
		return tellNumber;
	}
	public void setTellNumber(String tellNumber) {
		this.tellNumber = tellNumber;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddrNm() {
		return addrNm;
	}
	public void setAddrNm(String addrNm) {
		this.addrNm = addrNm;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "FoodDto [title=" + title + ", foodId=" + foodId + ", tellNumber=" + tellNumber + ", image=" + image
				+ ", content=" + content + ", place=" + place + ", addrNm=" + addrNm + ", time=" + time + ", address="
				+ address + ", menu=" + menu + "]";
	}
	
	
}
