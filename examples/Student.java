class Student {
  public boolean isEligibleToVote(Date date) {
    return birthday.yearsBetween(date.toGMT())>=18;
  }
}

// Assume the following class was defined in a library
class Date {
  public Date toGMT() {
    // clobbers its own field to reset to GMT
    return this;
  }
}
