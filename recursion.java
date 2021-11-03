package com.PracticeSets;

public class recursion {

 // factorial using recursion 
  static int factorial(int a) {
    if (a == 0 || a == 1) {
      return 1;
    } else {
      return a * factorial(a - 1);
    }
  }
  
  // factorial using iterative approach
  
  static int factorial_iterative(int b){
    if(b==0 || b==1){
      return 1;
    }
    else{
      int product =1;
      for(int i=1;i<=b;i++){
        product *=i;
        
      }
      return product;
    }
    
  }

  public static void main(String[] args) {
    int x = 5;
    System.out.println("factorial :" + factorial(x));
    
    System.out.println("factorial_iterative :" + factorial_iterative(x));
    
    
  }
}
