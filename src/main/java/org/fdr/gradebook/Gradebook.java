package org.fdr.gradebook;

import java.util.ArrayList;
import java.util.List;

public class Gradebook {
	private Teacher mTeacher;
	private List<Class> mClasses;
	private List<Student> mStudents;

	public Gradebook() {
		mClasses = new ArrayList<Class>();
		mStudents = new ArrayList<Student>();
	}

	public Integer getNumberOfClasses() {
		return mClasses.size();
	}

	public List<Class> getClasses() {
		return mClasses;
	}

	public void setClasses(List<Class> inClasses) {
		mClasses = inClasses;
	}

	public Teacher getTeacher() {
		return mTeacher;
	}

	public void setTeacher(Teacher inTeacher) {
		mTeacher = inTeacher;
	}

	public Integer getNumberOfStudents() {
		return mStudents.size();
	}

	public List<Student> getStudents() {
		return mStudents;
	}

	public void setStudents(List<Student> inStudents) {
		mStudents = inStudents;
	}

	public void addClass(Class inClass) {
		mClasses.add(inClass);
	}

	public void addStudent(Student inStudent) {
		mStudents.add(inStudent);
	}

	public void removeClass(Class inClass) {
		mClasses.remove(inClass);
	}
}
