package org.fdr.gradebook;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GradeCalculatorTest {

	@Test
	public void testCalculateWillReturnGrade() {
		GradeCalculator calculator = new GradeCalculator();
		List<AssignmentResult> assignmentResults = new ArrayList<AssignmentResult>();
		assignmentResults.add(new AssignmentResult(80));
		assignmentResults.add(new AssignmentResult(90));
		assignmentResults.add(new AssignmentResult(100));

		assertEquals(Integer.valueOf(90),
				calculator.calculate(assignmentResults));
	}

	@Test
	public void testCalculateWithSomeExemptResultsWillReturnGradeForNonExemptResults() {
		GradeCalculator calculator = new GradeCalculator();
		List<AssignmentResult> assignmentResults = new ArrayList<AssignmentResult>();
		assignmentResults.add(new AssignmentResult(
				AssignmentResultType.EXEMPTION));
		assignmentResults.add(new AssignmentResult(90));
		assignmentResults.add(new AssignmentResult(100));

		assertEquals(Integer.valueOf(95),
				calculator.calculate(assignmentResults));
	}

	@Test
	public void testCalculateWithNoGradesDoesNotThrowDivideByZeroException() {
		GradeCalculator calculator = new GradeCalculator();
		List<AssignmentResult> assignmentResults = new ArrayList<AssignmentResult>();

		calculator.calculate(assignmentResults);
	}
}
