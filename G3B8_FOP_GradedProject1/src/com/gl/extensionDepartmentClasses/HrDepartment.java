package com.gl.extensionDepartmentClasses;

import com.gl.superDepartmentClass.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String m1="Hr Department";
		return m1;
	}

	public String getTodaysWork() {
		String m2="Fill today's timesheet and mark your attendance";
		return m2;
	}
	public String getWorkDeadline() {
		String m3="Complete by EOD ";
		return m3;
	}
	public String doActivity() {
		String m5="Team Lunch";
		return m5;
	}

}
