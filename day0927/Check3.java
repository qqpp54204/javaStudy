


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
   
   System.out.println("�̸��� �Է��Ͻÿ�==>");
   name = sc.next();
   System.out.println("����⵵�� �Է��Ͻÿ�==>");
   userYear = sc.nextInt();
   
   age = thisYear - userYear;
   
   System.out.println("���ش� " + thisYear +"�⵵ �Դϴ�.");

   if(age >= 40 )
     System.out.println(name+"���� " + age +"�� �Դϴ�. ������Դϴ�.");
   else
     System.out.println(name+"���� " + age +"�� �Դϴ�. ����ڰ� �ƴմϴ�.");

   }
}