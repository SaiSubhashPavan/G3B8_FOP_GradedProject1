package com.gl.extensionDepartmentClasses;

import com.gl.superDepartmentClass.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		String m1="Tech Department";
		return m1;
	}

	public String getTodaysWork() {
		String m2="Complete coding of Module 1";
		return m2;
	}
	public String getWorkDeadline() {
		String m3="Complete by EOD";
		return m3;
	}
	public String  getTechStackInformation() {
		String m6="Core Java";
		return m6;
	}

}
