import java.util.Scanner;
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int data;
		int x;
		int a;
		int b;
		int c;
		
		System.out.print("������ �Է��ϼ��� : ");
		data = sc.nextInt();
		
		x = data/1000;	 //õ
		a = data%1000;
		b = a/100;
		 = a%100;	 // ��
		 = b%10;	 //��


		System.out.println("õ�� �ڸ� : " +x);
		System.out.println("���� �ڸ� : " +a);
		System.out.println("���� �ڸ� : " +b);
		System.out.println("���� �ڸ� : " +c);

		}
}