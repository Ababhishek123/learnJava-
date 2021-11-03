package com.PracticeSets;

public class variableArguments {
 /*
  static int sum(int a,int b){
    return a+b;
    
  }
  static int sum(int a,int b,int c){
    return a+b+c;
    
  }
  static int sum(int a, int b,int c,int d){
    return a+b+c+d;
    
  }
   */
   
 //variable arguments 
  
  static int sum(int...arr){
    int result =0;
    for(int a:arr){
      result +=a;
    }
    return result;   
  }
  
  
  public static void main(String[] args) {
      System.out.println(sum(2,3));
      System.out.println(sum(6,3,1));
      System.out.println(sum(1,2,3,5));

  }

}
