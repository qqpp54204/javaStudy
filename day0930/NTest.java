import java.util.Scanner;
class NTest{
   public static void main(String []args){
		Scanner sc = new Scanner(System.in); 
		int n;
		System.out.println("숫자를 N을 입력하세요");
	    n = sc.nextInt();

			if(n >= 0)
				n = n +100;
				
			else
				n = n*n;
				System.out.println( n + ": 작업 종료");

		}
		
		
   }


