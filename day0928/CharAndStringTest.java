class CharAndStringTest
  
{
	public static void main(String[] args) 
	{
		//�ڹٿ��� ���Ϲ����� ó���� ���ڿ��� ó���� �޶��
		//�ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� Ȫ����ǥ�� ������ϰ�
		//���ڿ��� ó���ϱ����ؼ��� �ֵ���ǥ�� ������մϴ�.
		//���� �ϳ��� ���������� �ִٿ�ǥ�� �����ٸ�  char�� ������ �� ����
		//String ���� �����ؾ��մϴ�.
		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�̰ǿ�";
		System.out.println(name);

		//string lastName; �ִٿ�ǥ �Ҷ� String
        //char lastName; Ȫ�ٿ�ǥ �Ҷ� char
		String lastName;
		lastName = "��";

		String data;
		data = "hello";
		char last = data.CharAt(4);
		//charAt�� String�� ��ġ(index)
		System.out.println("�Ǹ������� �ִ� ���ڴ�" + last + "�Դϴ�");


	}
}

/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:20: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error
*/