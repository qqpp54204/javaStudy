class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
        int age;
		//long age;
		age = 27;
		System.out.println("�̰ǿ��� ���� :" + age + " ���Դϴ�.");

		//double height;
		float height;
		//height = 173.8;
		//height = 173.8f; //�Ǽ����� float������ �����ϱ� ���ؼ��� ���̻� f�� ���̰ų�
		height = (float)173.8; //  �ڷ�����ȯ�� �Ͽ� �����Ҽ� �־��
		System.out.println("�̰ǿ��� Ű :" + height + " �Դϴ�.");

        char gender;
		gender = 'M';
		//gender ="M";
		// �ֵ���ǥ�� ������ ���ڿ�(String)���� ����ϱ� ������ char �� ������ �� �����!
		System.out.println("�̰ǿ��� ������ :" + gender + " �Դϴ�.");

		boolean isVaccine;
		isVaccine = true;
		System.out.println("�̰ǿ��� 1�� ��� ��������" + isVaccine + " �Դϴ�.");


	}
}