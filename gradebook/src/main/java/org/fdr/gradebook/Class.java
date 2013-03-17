package org.fdr.gradebook;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private Long mId;
	private List<Student> mStudents;

	public Class() {
		mStudents = new ArrayList<Student>();
	}

	public void setId(Long inSubjectId) {
		mId = inSubjectId;
	}

	public Long getId() {
		return mId;
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

	public void addStudent(Student inStudent) {
		mStudents.add(inStudent);
	}

}
