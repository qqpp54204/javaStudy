


import java.util.Scanner;
import java.util.Date;
class Club{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   Date today = new Date();

    String name;   
    int userYear;
    int thisYear;
    int age;
    int height;  
    thisYear = 2021;  
   
   System.out.println("이름을 입력하시오==>");
   name = sc.next();
   System.out.println("출생년도를 입력하시오==>");
   userYear = sc.nextInt();

   System.out.println("키를 입력하시오==>");
   height = sc.nextInt();
   
   age = thisYear - userYear;
   


   if(age <= 20 && height <= 160)
     System.out.println(name+"님은 입장 불가능합니다.");
   else
     System.out.println(name+"님은 입장 가능합니다.");

   }
}