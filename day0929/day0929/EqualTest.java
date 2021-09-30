import java.util.Scanner;
class EqualTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1, age2;
		System.out.print("첫번째 사람의 나이를 입력하시오==>");
		age1 = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하시오==>");
		age2 = sc.nextInt();

		if( age1 == age2)
			System.out.println("두사람의 나이는 서로 같습니다.");
		else
			System.out.println("두사람의 나이는 서로 다릅니다.");

	}
}
