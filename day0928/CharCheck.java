import java.util.Scanner;
class CharCheck{
   public static void main(String []args){
		Scanner sc = new Scanner(System.in); 
		String data;
		System.out.println("���ڸ� �Է��ϼ���");
	    data = sc.next();
        int cnt = 0;
		char ch;
		for(int i=0 ; i < data.length() ; i=i+1){
			ch = data.charAt(i);
			if(ch =='o')
				cnt = cnt+1;
		}
		
		System.out.println("�ҹ��� a�� ������" + cnt + "�� �Դϴ�.");
   }

}