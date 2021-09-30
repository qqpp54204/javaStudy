import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt();
		System.out.println(n);

		// 0에서 9사이의 난수가 발생하도록 프로그램을 수정 해 봅니다.
		
		n = n >>> 1;
		n = n % 10;
		System.out.println(n);
	}
}
