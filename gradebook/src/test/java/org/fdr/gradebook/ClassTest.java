package org.fdr.gradebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassTest {

	@Test
	public void testCtorInitializesCollections() {
		Class clazz = new Class();
		assertNotNull(clazz.getStudents());
	}

}
