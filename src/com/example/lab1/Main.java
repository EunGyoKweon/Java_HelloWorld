package com.example.lab1;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Scanner ss = new Scanner(System.in);
      System.out.println("Hello World!!!\n");
      System.out.print("이름 입력 : ");
      String name = s.next();
      System.out.print("나이 입력 : ");
      int age = ss.nextInt();
      System.out.println(age + "살 " + "[" + name + "]님 환영합니다~");
      
      
      
   }
}
