class IntAndDoubleTest
{

	public static void main(String[] args) 
	{
		//������ ������ �����ϸ� ����� ������ �˴ϴ�.
		//���� ������ ������ �����Ͽ� �Ǽ����� ���⸦ ���Ѵٸ�
		//���� �� �ϳ��� �Ǽ��� �� ��ȭ�Ͽ� �����ؾ� �մϴ�.

    int a=5;
	int b=2;

	double result ;
	//result = a/b;
    result = a/(double)b;
	System.out.println("������ ���:" + result);

	}

}
/*
C:\javaStudy\day0928>javac IntAndDoubleTest.java

C:\javaStudy\day0928>java IntAndDoubleTest
������ ���:2.5

C:\javaStudy\day0928>

*/