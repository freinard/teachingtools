package org.fdr.gradebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradebookTest {

	@Test
	public void testCtorInitializesCollections() {
		Gradebook gradebook = new Gradebook();
		assertNotNull(gradebook.getStudents());
		assertNotNull(gradebook.getClasses());
	}

}
