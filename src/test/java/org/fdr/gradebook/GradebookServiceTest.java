package org.fdr.gradebook;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class GradebookServiceTest {
	private static final Long CLASS_ID = null;
	private GradebookService mService;
	private Gradebook mGradebook;

	@Before
	public void setUp() {
		mGradebook = mock(Gradebook.class);
		mService = new GradebookService();
		mService.setGradebook(mGradebook);
	}

	@Test
	public void testAddStudentToGradebook() {
		Student student = new Student();
		mService.addStudentToGradebook(student);

		verify(mGradebook).addStudent(student);
	}

	@Test
	public void testAddClassToGradebook() {
		Class clazz = new Class();
		mService.addClassToGradebook(clazz);

		verify(mGradebook).addClass(clazz);
	}

	@Test
	public void testRemoveClassFromGradebook() {
		Class clazz = new Class();
		mService.removeClassFromGradebook(clazz);

		verify(mGradebook).removeClass(clazz);
	}

}
