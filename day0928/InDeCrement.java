class InDeCrement
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++; // i = i + 1
		++j; // j = j + 1

		System.out.println(i);
		System.out.println(j);

		System.out.println("---------------------------------");

			// a++ �� a+1 �� �ٸ��ϴ�.

		int a = 10;
		int b = 10;

		System.out.println(a+1);
		System.out.println(b++);
		System.out.println("---------------------------------");
		System.out.println(a);
		System.out.println(b);

		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);

		System.out.println("---------------------------------");
		i = 5;
		j = 5;
		a = ++i;
		b = j++;
		System.out.println("i" + i);
		System.out.println("j" + i);
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("---------------------------------");

		i = 5;
		j = 5;
		int k = 5;
		System.out.println(++i); //6
		System.out.println(j++); //5
		System.out.println(k+1); //6
		System.out.println(i);   //6
		System.out.println(j);   //6
		System.out.println(k);   //5

	}
}
