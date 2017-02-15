class StudentTest {
  void eligibleToVoteTest() {
    Date currentDate = Date.today();
    Student student = new Student();
    // student.setSomeBirthdate()
    assertTrue(student.isEligibleToVote(currentDate));
  }

  void ineligibleToVoteTest() {
    Date currentDate = Date.today();
    Student student = new Student();
    // student.setSomeBirthdate()
    assertFalse(student.isEligibleToVote(currentDate));
  }
}
