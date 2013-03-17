package org.fdr.gradebook;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddClassToGradebookTest {

	private AddClassToGradebook mOperation;
	private Gradebook mGradebook;
	private Class mSubject;

	@Before
	public void setUp() {
		mGradebook = new Gradebook();
		mSubject = new Class();

		mOperation = new AddClassToGradebook();
		mOperation.setGradebook(mGradebook);
	}

	@Test
	public void testAddWillAddSubjectToGradebook() {
		mOperation.add(mSubject);

		assertEquals(Integer.valueOf(1), mGradebook.getNumberOfClasses());
		assertEquals(mSubject, mGradebook.getClasses().get(0));
	}

}
