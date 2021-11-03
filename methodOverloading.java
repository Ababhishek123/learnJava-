package com.PracticeSets;

public class methodOverloading {
  static void greet(){
    System.out.println("happy birthday ");
    
  }
  
  static void greet(int a){
    System.out.println("happy birthday :" + a);
    
  }
  static void greet(int a,int b) {
    System.out.println("happy birthday:"+ a+" "+ b);
    
  }
  static int greet(int a ,int b,int c){
    return a+b+c;
    
  }
  
  public static void main(String[] args) {
      greet();
      greet(1);
      greet(3,2);
      System.out.println(greet(1,4,6));
       
      
      
      
      
  }

}
