
import java.util.Scanner;
class Check{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

    String n;   
    int m;
   
   System.out.println("�̸��� �Է��Ͻÿ�==>");
   n = sc.next();
   System.out.println("���̸� �Է��Ͻÿ�==>");
   m = sc.nextInt();
   if(m >= 40 )
     System.out.println(n+"���� ������Դϴ�.");
   else
     System.out.println(n+"���� ����ڰ� �ƴմϴ�.");

   }
}