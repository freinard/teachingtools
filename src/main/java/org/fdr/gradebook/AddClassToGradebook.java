package org.fdr.gradebook;

public class AddClassToGradebook {

	private Gradebook mGradebook;

	public void setGradebook(Gradebook inGradebook) {
		mGradebook = inGradebook;
	}

	public void add(Class inClass) {
		mGradebook.addClass(inClass);
	}

}
