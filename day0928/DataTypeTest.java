class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
        int age;
		//long age;
		age = 27;
		System.out.println("이건우의 나이 :" + age + " 살입니다.");

		//double height;
		float height;
		//height = 173.8;
		//height = 173.8f; //실수값을 float변수에 저장하기 위해서는 접미사 f를 붙이거나
		height = (float)173.8; //  자료형변환을 하여 저장할수 있어요
		System.out.println("이건우의 키 :" + height + " 입니다.");

        char gender;
		gender = 'M';
		//gender ="M";
		// 쌍따옴표로 묶으면 문자열(String)으로 취급하기 때문에 char 에 저장할 수 없어요!
		System.out.println("이건우의 성병은 :" + gender + " 입니다.");

		boolean isVaccine;
		isVaccine = true;
		System.out.println("이건우의 1차 백신 접종여부" + isVaccine + " 입니다.");


	}
}
