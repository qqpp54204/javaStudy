
import java.util.Scanner;
class Homework{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

   int com,c,eng,math;
   int sum;

   System.out.println("��ǻ�Ͱ��� ������ �Է��Ͻÿ�==>");
   com = sc.nextInt();
   System.out.println("C��� ������ �Է��Ͻÿ�");
   c = sc.nextInt();
   System.out.println("���� ������ �Է��Ͻÿ�");
   eng = sc.nextInt();
   System.out.println("�Ϲݼ��� ������ �Է��Ͻÿ�");
   math = sc.nextInt();
   sum = com + c + eng + math;

     System.out.println("���������" + sum/4 + "�Դϴ�");
   

   }
}
