package org.automation.resourses;

public enum apiResourse {

	
	AddUser("/api/users"),
	UpdateUser("/api/users/2");
	

	public String resourse;
	apiResourse(String resourse){	
		this.resourse = resourse;
	}
	
	public String getResource() {
		return resourse;
	}
	
	
	
}
