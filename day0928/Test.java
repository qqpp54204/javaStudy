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
		
		System.out.print("정수를 입력하세요 : ");
		data = sc.nextInt();
		
		x = data/1000;	 //천
		a = data%1000;
		b = a/100;
		 = a%100;	 // 십
		 = b%10;	 //일


		System.out.println("천의 자리 : " +x);
		System.out.println("백의 자리 : " +a);
		System.out.println("십의 자리 : " +b);
		System.out.println("일의 자리 : " +c);

		}
}
