class CharAndStringTest
  
{
	public static void main(String[] args) 
	{
		//자바에서 단일문자의 처리와 문자열의 처리가 달라요
		//하나의 문자를 표현하기 위해서는 홋따옴표로 묶어야하고
		//문자열을 처리하기위해서는 쌍따옴표로 묶어야합니다.
		//만약 하나의 문자이지만 쌍다옴표로 묶었다면  char에 저장할 수 없고
		//String 으로 저장해야합니다.
		char firstName;
		firstName = '이';
		System.out.println(firstName);

		String name;
		name = "이건우";
		System.out.println(name);

		//string lastName; 쌍다옴표 할때 String
        //char lastName; 홋다옴표 할때 char
		String lastName;
		lastName = "우";

		String data;
		data = "hello";
		char last = data.CharAt(4);
		//charAt은 String의 위치(index)
		System.out.println("맨마지막에 있는 문자는" + last + "입니다");


	}
}

/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:20: error: incompatible types: String cannot be converted to char
                lastName = "우";
                           ^
1 error
*/