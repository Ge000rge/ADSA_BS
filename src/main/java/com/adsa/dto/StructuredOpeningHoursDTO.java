package com.adsa.dto;
/**
 * 
 * @author alberto.garcia
 *
 */
public class StructuredOpeningHoursDTO {
	//TODO
	private String additionalInfo;
	private DaysOpeningHoursDTO monday;
	private DaysOpeningHoursDTO tuesday;
	private DaysOpeningHoursDTO wednesday;
	private DaysOpeningHoursDTO thursday;
	private DaysOpeningHoursDTO friday;
	private DaysOpeningHoursDTO saturday;
	private DaysOpeningHoursDTO sunday;
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public DaysOpeningHoursDTO getMonday() {
		return monday;
	}
	public void setMonday(DaysOpeningHoursDTO monday) {
		this.monday = monday;
	}
	public DaysOpeningHoursDTO getTuesday() {
		return tuesday;
	}
	public void setTuesday(DaysOpeningHoursDTO tuesday) {
		this.tuesday = tuesday;
	}
	public DaysOpeningHoursDTO getWednesday() {
		return wednesday;
	}
	public void setWednesday(DaysOpeningHoursDTO wednesday) {
		this.wednesday = wednesday;
	}
	public DaysOpeningHoursDTO getThursday() {
		return thursday;
	}
	public void setThursday(DaysOpeningHoursDTO thursday) {
		this.thursday = thursday;
	}
	public DaysOpeningHoursDTO getFriday() {
		return friday;
	}
	public void setFriday(DaysOpeningHoursDTO friday) {
		this.friday = friday;
	}
	public DaysOpeningHoursDTO getSaturday() {
		return saturday;
	}
	public void setSaturday(DaysOpeningHoursDTO saturday) {
		this.saturday = saturday;
	}
	public DaysOpeningHoursDTO getSunday() {
		return sunday;
	}
	public void setSunday(DaysOpeningHoursDTO sunday) {
		this.sunday = sunday;
	}
	
	
}
