package org.fdr.gradebook;

public class AssignTeacherToGradebook {

	private Gradebook mGradebook;

	public void setGradebook(Gradebook inGradebook) {
		mGradebook = inGradebook;
	}

	public void assign(Teacher inTeacher) {
		mGradebook.setTeacher(inTeacher);

	}

}
