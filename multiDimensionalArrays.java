package com.PracticeSets;

public class multiDimensionalArrays {

  public static void main(String[] args) {
    // multidimensional array is array of arrays.
    // a 2d arrays

    // intializing array
    int[][] flats = new int[3][3];

    // declaring array values
    flats[0][0] = 000;
    flats[0][1] = 001;
    flats[0][2] = 002;

    flats[1][0] = 100;
    flats[1][1] = 101;
    flats[1][2] = 102;

    flats[2][0] = 200;
    flats[2][1] = 201;
    flats[2][2] = 202;

    // printing array values
    for (int i = 0; i < flats.length; i++) {
      for (int j = 0; j < flats[i].length; j++) {
        System.out.print(flats[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}
