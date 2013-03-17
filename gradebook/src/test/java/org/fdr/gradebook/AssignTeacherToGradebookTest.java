package org.fdr.gradebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignTeacherToGradebookTest {

	@Test
	public void testAssignWillAssignTeacherToGradebook() {
		Teacher teacher = new Teacher();
		Gradebook gradebook = new Gradebook();

		AssignTeacherToGradebook assignTeacher = new AssignTeacherToGradebook();
		assignTeacher.setGradebook(gradebook);

		assignTeacher.assign(teacher);

		assertEquals(teacher, gradebook.getTeacher());
	}

}
