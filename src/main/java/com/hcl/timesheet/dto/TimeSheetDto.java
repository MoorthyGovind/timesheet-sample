package com.hcl.timesheet.dto;

public class TimeSheetDto {

	private Integer userId;
	private String date;
	private Integer noOfHours;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(Integer noOfHours) {
		this.noOfHours = noOfHours;
	}

}
