# EnjoyTrip_1_Java_10조_이승민_정근모

<div align=center>
** 개발 IDE가 달라 xml 경로 문제가 생길 수 있습니다. **
</div>
<br>

<div align=center>
![간단한 시연 영상](/uploads/7a86216ea5c2e5d6cf3315c7bef1628a/화면_기록_2023-01-31_오후_11.19.17.mov)
</div>

## 기본 - 화면 UI + Service + Dao 완성 ( 100% )
- 이벤트 처리
```
    // complete code #01
    // 아래의 코드를 참조하여 아래 라인을 uncomment 하고 searchBt.addActionList() 를 Lambda 표현식으로 바꾸세요.

    searchBt.addActionListener( (e) -> {
        searchTrips();
    });

    showTrips();
```


- Service 완성
```
@Override
public TripDto search(int num) {
    // complete code #02
    // null 을 return 하면 안됩니다. Dao Layer 의 적절한 method를 호출하여 Business Logic 을 완성하세요.
	return tripDao.search(num);
}
```


- Dao 완성
</br>

```
[complete code #03]
// List<TripDto> tripInfo 로부터 num 에 해당하는 TripDto 정보를 검색하여 return 하도록 코드를 작성하세요.
// 해당하는 num이 없을 경우 null을 리턴하세요.

for(int i=0; i<tripInfo.size(); i++) {
	if(tripInfo.get(i).getNum() == num) {
		return tripInfo.get(i);
	}
}
return null
```
## 기본 - XML Parsing ( 100% )
- SAXParser, SAXHandler 완성

```
@Override
	public void startElement(String uri, String localName, String qName, Attributes att) {
		temp = "";
		if (qName.equals("record")) {
			// complete code #04
			// tripDto 객체를 생성(이미지 정보 세팅)하고 trips List에 추가하세요.
			tripDto = new TripDto(num++);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		if (qName.equals("관광지명")) {
			// complete code #05
			// 관광지명 항목을 처리하세요.
			tripDto.setTouristDestination(temp);
		} else if (qName.equals("소재지도로명주소")) {
			tripDto.setStreetAddress(temp);
		} else if (qName.equals("소재지지번주소")) {
			tripDto.setLotAddress(temp);
		} else if (qName.equals("위도")) {
			if (temp.length() != 0)
				tripDto.setLat(Double.parseDouble(temp));
		} else if (qName.equals("경도")) {
			// complete code #06
			// 경도 항목을 처리하세요.
			if (temp.length() != 0)
				tripDto.setLng(Double.parseDouble(temp));
		} else if (qName.equals("관광지소개")) {
			tripDto.setInfo(temp);
		} else if (qName.equals("관리기관전화번호")) {
			// complete code #07
			// 관리기관전화번호 항목을 처리하세요.	
			tripDto.setTel(temp);
		}else if(qName.equals("record")) {
			trips.add(tripDto);
		}
	}
```


##기본 - 전체 프로그램 동작 ( 100% )
- 오류 없이 전체 동작
## => 실행 화면 캡쳐
![Image_Pasted_at_2023-1-31_15-59](/uploads/f417634d01c63215445b6040bcedbb78/Image_Pasted_at_2023-1-31_15-59.png)

![Image_Pasted_at_2023-1-31_15-59__1_](/uploads/8127c248fc1cc3ac3654801567b85d83/Image_Pasted_at_2023-1-31_15-59__1_.png)

![Image_Pasted_at_2023-1-31_16-00](/uploads/682b64f78d4ab2da8e883a830cdd2cdc/Image_Pasted_at_2023-1-31_16-00.png)

## 추가 - 지역 축제 정보 구현 ( 50% )
## => 실행 화면 캡쳐

### 새로운 창 화면 구현.
![image](/uploads/8a50f4c9952d4458a0cf6b29560cffc0/image.png)

## 심화 -관광지 주변 상권 정보 구현 ( 50% )
## => 실행 화면 캡쳐

### 새로운 화면 창 전환은 하였지만, 값을 전달받고 테이블을 생성하짐 못함
### [해결방안] 콘솔에 부산 음식 상가 정보를 출력하도록 구현. (지역 구 마다 다르게 적용)
![image](/uploads/7867e9d60f1eb7ff25ff96a55e59616a/image.png)

