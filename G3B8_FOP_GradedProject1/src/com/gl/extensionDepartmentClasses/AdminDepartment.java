package com.gl.extensionDepartmentClasses;

import com.gl.superDepartmentClass.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String m1=" Admin Department ";
		return m1;
	}

	public String getTodaysWork() {
		String m2="Complete your documents Submission";
		return m2;
	}
	public String getWorkDeadline() {
		String m3="Complete by EOD";
		return m3;
	}

}
