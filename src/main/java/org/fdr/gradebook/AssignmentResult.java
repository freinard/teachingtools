package org.fdr.gradebook;

public class AssignmentResult {

	private Integer mGrade;
	private AssignmentResultType mResultType;

	public AssignmentResult(Integer inGrade) {
		mResultType = AssignmentResultType.GRADE;
		mGrade = inGrade;
	}

	public AssignmentResult(AssignmentResultType inExemption) {
		mResultType = inExemption;
	}

	public Integer getGrade() {
		return mGrade;
	}

	public boolean isGrade() {
		return AssignmentResultType.GRADE.equals(mResultType);
	}

}
