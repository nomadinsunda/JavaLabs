package com.intheeast.interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class SimpleHandleInvalidTimeZoneClient implements HandleInvalidTimeZoneClient {

	private LocalDateTime dateAndTime;
    
    public SimpleHandleInvalidTimeZoneClient() {
        dateAndTime = LocalDateTime.now();
    }
    
    public void setTime(int hour, int minute, int second) {
    	// TemporalAccessor temporal
    	// LocalDateTime 클래스가 TemporalAccessor 인터페이스를 구현함
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }
    
    // date 정보 : 2025-04-22
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }
    
    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }
    
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }
    
    public String toString() {
        return dateAndTime.toString();
    }
    
    public static void main(String ...args) {
    	SimpleHandleInvalidTimeZoneClient shitzc = 
    			new SimpleHandleInvalidTimeZoneClient();
    	
    	ZoneId zid;
    	
//    	shitzc.getZonedDateTime("JST");
    	
    	// 상속받은 인터페이스에서는 부모 인터페이스의 static 메서드를 호출할 수 없음
    	// HandleInvalidTimeZoneClient.getZoneId("Asia/Tokyo");
    	zid = TimeClient.getZoneId("Asia/Daegu");
    	
    	return ;
    }

}
