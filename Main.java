package com.meetTrivia;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        float i = 5.2f;
        System.out.println(i++);
        System.out.println(i);
        
        
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);
        
        char x= 'A';
        System.out.println(++x);
        System.out.println(++x);    
        
        
        //typecasting
        
        char grade ='B';
        grade = (char)(grade + 5);
        System.out.println(grade);
        
        //area of circle
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of circle : ");
        int num =sc.nextInt();
        float area =(float)(Math.PI*num * num);
        System.out.println("area of circle is : " + area);  
        
        System.out.println("perimeter of circle is : "+ 2*Math.PI*num);
        
        
        
    }
    
}
