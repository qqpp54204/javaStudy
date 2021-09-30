import java.util.Scanner;
class TrueFalseTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자를 입력하세요==>");
		data = sc.next();
		boolean result;
		result = data.length() >= 4;
		System.out.print(result);

  
		}
}
