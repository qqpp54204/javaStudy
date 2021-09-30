import java.util.Scanner;
class Area{
   public static void main(String []args){
    Scanner sc = new Scanner(System.in); 
   
    int a;
    int b;

    int area;
    

    System.out.println("가로길이를 입력하세요");
    a = sc.nextInt();

    System.out.println("세로길이를 입력하세요");
    b = sc.nextInt();

    
    area = a * b;
    
    

System.out.println(" ** 결과 출력 **");
System.out.println("사각형의 면적은:" + area + "cm^2");


   }

}