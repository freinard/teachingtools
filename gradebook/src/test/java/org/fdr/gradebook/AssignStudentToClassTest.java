package org.fdr.gradebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignStudentToClassTest {

	@Test
	public void testAssignWillAssignStudentToClass() {
		Student student = new Student();
		Class clazz = new Class();
		AssignStudentToClass operation = new AssignStudentToClass();
		operation.setClass(clazz);

		operation.assign(student);

		assertEquals(Integer.valueOf(1), clazz.getNumberOfStudents());
		assertEquals(student, clazz.getStudents().get(0));
	}

}
