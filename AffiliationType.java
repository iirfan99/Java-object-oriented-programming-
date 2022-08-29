

public enum AffiliationType {
	STUDENT, TEACHER, STAFF_MEMBER, NOT_KNOWN;
	public static AffiliationType fromString(String s) {
		if(AffiliationConstants.STUDENT.equals(s)){
			return STUDENT;
		} else if(AffiliationConstants.TEACHER.equals(s)) {
			return TEACHER;
		} else if(AffiliationConstants.STAFF.equals(s)) {
			return STAFF_MEMBER;
		}

		return NOT_KNOWN;
	}
}
