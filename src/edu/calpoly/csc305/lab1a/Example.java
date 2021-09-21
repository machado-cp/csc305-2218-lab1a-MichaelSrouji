package edu.calpoly.csc305.lab1a;

class Example {
  private static final String NAME = "305";
  private int[] nums = {1, 2, 3, 4, 5};

  boolean sameName(String other) {
    return other.equals(NAME);
  }

  public int[] getNums() {
    return nums;
  }
}
