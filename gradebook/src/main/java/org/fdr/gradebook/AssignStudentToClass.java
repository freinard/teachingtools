package org.fdr.gradebook;

public class AssignStudentToClass {

	private Class mClass;

	public void setClass(Class inClass) {
		mClass = inClass;
	}

	public void assign(Student inStudent) {
		mClass.addStudent(inStudent);
	}

}
