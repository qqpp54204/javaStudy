


import java.util.Scanner;
class Check2{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

    String name;
    int thisYear;
    int userYear;

    int age;  
    thisYear = 2021;
   
   System.out.println("�̸��� �Է��Ͻÿ�==>");
   name = sc.next();
   System.out.println("����⵵�� �Է��Ͻÿ�==>");
   userYear = sc.nextInt();
   
   age = thisYear-userYear;
 

   if(age >= 40 && age/2 ==0 )
     System.out.println(name+"���� " + age +"�� �Դϴ�. Ȧ���⵵ ������Դϴ�.");
   else
     System.out.println(name+"���� " + age +"�� �Դϴ�. ¦���⵵ ������Դϴ�.");

   }
}