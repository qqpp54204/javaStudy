class IntAndDoubleTest
{

	public static void main(String[] args) 
	{
		//정수와 정수를 연사하면 결과가 정수가 됩니다.
		//만약 정수와 정수를 연사하여 실수값을 갖기를 원한다면
		//정수 중 하나를 실수로 형 변화하여 연산해야 합니다.

    int a=5;
	int b=2;

	double result ;
	//result = a/b;
    result = a/(double)b;
	System.out.println("나누기 결과:" + result);

	}

}
/*
C:\javaStudy\day0928>javac IntAndDoubleTest.java

C:\javaStudy\day0928>java IntAndDoubleTest
나누기 결과:2.5

C:\javaStudy\day0928>

*/