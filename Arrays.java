package com.PracticeSets;

public class main {

  public static void main(String[] args) {
    System.out.println("arrays");

    int[] marks = new int[3];

    marks[0] = 88;
    marks[1] = 77;
    marks[2] = 99;

    // System.out.println(marks[2]);
    int j = marks.length;

    for (int i = 0; i < j; i++) {

      System.out.println(marks[i]);
    }

    System.out.println("traversing value using for each loop");
    for (int element : marks) {
      System.out.println(element);
    }

    // declaring and initializing array

    // int[] score = {33, 64, 86, 84, 24, 98, 83, 63, 73, 44};
    // System.out.println(score[5]);
  }
}
