package org.fdr.gradebook;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class ClassServiceTest {
	private Class mClass;
	private ClassService mService;

	@Before
	public void setUp() {
		mClass = mock(Class.class);
		mService = new ClassService();
		mService.setClass(mClass);
	}

	@Test
	public void testAddStudentToClass() {
		Student student = new Student();
		mService.addStudent(student);

		verify(mClass).addStudent(student);
	}

}
