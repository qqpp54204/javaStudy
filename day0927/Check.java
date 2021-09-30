
import java.util.Scanner;
class Check{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

    String n;   
    int m;
   
   System.out.println("이름을 입력하시오==>");
   n = sc.next();
   System.out.println("나이를 입력하시오==>");
   m = sc.nextInt();
   if(m >= 40 )
     System.out.println(n+"님은 대상자입니다.");
   else
     System.out.println(n+"님은 대상자가 아닙니다.");

   }
}