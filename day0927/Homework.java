
import java.util.Scanner;
class Homework{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

   int com,c,eng,math;
   int sum;

   System.out.println("컴퓨터개론 성적을 입력하시오==>");
   com = sc.nextInt();
   System.out.println("C언어 성적을 입력하시오");
   c = sc.nextInt();
   System.out.println("영어 성적을 입력하시오");
   eng = sc.nextInt();
   System.out.println("일반수학 성적을 입력하시오");
   math = sc.nextInt();
   sum = com + c + eng + math;

     System.out.println("성적평균은" + sum/4 + "입니다");
   

   }
}
