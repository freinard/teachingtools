package org.fdr.gradebook;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddStudentToGradebookTest {

	@Test
	public void testAddWillAddStudentToGradebook() {
		Student student = new Student();
		Gradebook gradebook = new Gradebook();
		AddStudentToGradebook operation = new AddStudentToGradebook();
		operation.setGradebook(gradebook);

		operation.add(student);

		assertEquals(Integer.valueOf(1), gradebook.getNumberOfStudents());
		assertEquals(student, gradebook.getStudents().get(0));
	}

}
