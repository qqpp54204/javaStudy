


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
   
   System.out.println("�̸��� �Է��Ͻÿ�==>");
   name = sc.next();
   System.out.println("����⵵�� �Է��Ͻÿ�==>");
   userYear = sc.nextInt();

   System.out.println("Ű�� �Է��Ͻÿ�==>");
   height = sc.nextInt();
   
   age = thisYear - userYear;
   


   if(age <= 20 && height <= 160)
     System.out.println(name+"���� ���� �Ұ����մϴ�.");
   else
     System.out.println(name+"���� ���� �����մϴ�.");

   }
}