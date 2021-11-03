package com.PracticeSets;

import java.util.Scanner;

public class sumOfFirstEvenNo {

  public static void main(String[] args) {
    // sum of first even numbers

    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number:");
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println(sum*2);
    
    
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(solveMeFirst(a,b));
       
    static int solveMeFirst(int a,int b){
      int c=a+b;
      return c;
      
    }
    
  }
}
