package org.fdr.gradebook;

public class ClassService {
	private Class mClass;

	public void setClass(Class inClass) {
		mClass = inClass;
	}

	public void addStudent(Student inStudent) {
		mClass.addStudent(inStudent);
	}

}
