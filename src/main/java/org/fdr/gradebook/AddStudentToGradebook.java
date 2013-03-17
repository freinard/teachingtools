package org.fdr.gradebook;

public class AddStudentToGradebook {

	private Gradebook mGradebook;

	public void setGradebook(Gradebook inGradebook) {
		mGradebook = inGradebook;
	}

	public void add(Student inStudent) {
		mGradebook.addStudent(inStudent);
	}

}
