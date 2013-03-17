package org.fdr.gradebook;

public class GradebookService {
	private Gradebook mGradebook;

	public void addStudentToGradebook(Student inStudent) {
		mGradebook.addStudent(inStudent);
	}

	public void setGradebook(Gradebook inGradebook) {
		mGradebook = inGradebook;
	}

	public void addClassToGradebook(Class inClass) {
		mGradebook.addClass(inClass);
	}

	public void removeClassFromGradebook(Class inClass) {
		mGradebook.removeClass(inClass);
	}

}
