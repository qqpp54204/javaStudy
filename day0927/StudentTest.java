import java.util.Scanner;
class StudentTest{
   public static void main(String []args){
    Scanner sc = new Scanner(System.in); 
   
    String name;
    int kor;
    int eng;
    int math;
    int tot;
    int avg;

    System.out.println("학생 이름은 무엇인가요?");
    name = sc.next();

    System.out.println("국어점수를 입력하세요?");
    kor = sc.nextInt();

    
    System.out.println("영어점수를 입력하세요?");
    eng = sc.nextInt();

  
    System.out.println("수학점수를 입력하세요?");
    math = sc.nextInt();

    tot = kor + eng + math;
    avg = tot / 3;
    

System.out.println(" ** 결과 출력 **");
System.out.println("이름:" + name);
System.out.println("국어:" + kor);
System.out.println("영어:" + eng);
System.out.println("수학:" + math);
System.out.println("총점:" + tot);
System.out.println("평균:" + avg);




   }

}