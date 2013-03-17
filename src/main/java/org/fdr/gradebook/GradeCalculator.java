package org.fdr.gradebook;

import java.util.List;

public class GradeCalculator {

	public Integer calculate(List<AssignmentResult> inResults) {
		int sum = 0;
		int numberOfGrades = 0;
		for (AssignmentResult result : inResults) {
			if (result.isGrade()) {
				numberOfGrades++;
				sum += result.getGrade();
			}
		}
		if (numberOfGrades == 0) {
			return 0;
		}
		return sum / numberOfGrades;
	}

}
