


import java.util.Scanner;
import java.util.Date;
class Check3{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   Date today = new Date();

    String name;   
    int userYear;
    int thisYear;
    int age;  
    thisYear = 2021;  
   
   System.out.println("이름을 입력하시오==>");
   name = sc.next();
   System.out.println("출생년도를 입력하시오==>");
   userYear = sc.nextInt();
   
   age = thisYear - userYear;
   
   System.out.println("올해는 " + thisYear +"년도 입니다.");

   if(age >= 40 )
     System.out.println(name+"님은 " + age +"세 입니다. 대상자입니다.");
   else
     System.out.println(name+"님은 " + age +"세 입니다. 대상자가 아닙니다.");

   }
}