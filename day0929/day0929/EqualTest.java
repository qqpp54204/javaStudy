import java.util.Scanner;
class EqualTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1, age2;
		System.out.print("ù��° ����� ���̸� �Է��Ͻÿ�==>");
		age1 = sc.nextInt();
		System.out.print("�ι�° ����� ���̸� �Է��Ͻÿ�==>");
		age2 = sc.nextInt();

		if( age1 == age2)
			System.out.println("�λ���� ���̴� ���� �����ϴ�.");
		else
			System.out.println("�λ���� ���̴� ���� �ٸ��ϴ�.");

	}
}
