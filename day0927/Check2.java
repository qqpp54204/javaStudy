


import java.util.Scanner;
class Check2{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

    String name;
    int thisYear;
    int userYear;

    int age;  
    thisYear = 2021;
   
   System.out.println("이름을 입력하시오==>");
   name = sc.next();
   System.out.println("출생년도를 입력하시오==>");
   userYear = sc.nextInt();
   
   age = thisYear-userYear;
 

   if(age >= 40 && age/2 ==0 )
     System.out.println(name+"님은 " + age +"세 입니다. 홀수년도 대상자입니다.");
   else
     System.out.println(name+"님은 " + age +"세 입니다. 짝수년도 대상자입니다.");

   }
}