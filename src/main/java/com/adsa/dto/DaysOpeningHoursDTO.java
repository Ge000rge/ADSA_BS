package com.adsa.dto;
/**
 * 
 * @author alberto.garcia
 *
 */
//TODO ¿considerar tambien los atributos split_start, split_end, isSplit?
public class DaysOpeningHoursDTO {
	private Long type;
	private String start;
	private String end;
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
}
