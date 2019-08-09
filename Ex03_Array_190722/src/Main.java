//190722(월) 자바 수업 4일차

/*
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		//자바 언어에서의 배열은 객체임!!!
		
		//int형 3칸짜리 배열 객체 생성
		//객체는 heap 메모리에만 만들어짐. new 키워드로 생성해야 함.
		int[] arr = new int[3];  //가장 많이 사용, 가급적 권장
//		int [] arr2 = new int[3]; //ok
//		int arr3[] = new int[3]; //ok
		//위에 3개 다 같은 기능이지만 가능한 제일 위쪽에 방법을 사용 권장
		
//		int[] arr4; //int[] 참조 변수만 먼저 선언
//		arr4 = new int[3]; //int[] 객체를 생성하여 대입하기 -ok
//		arr4 = arr; //배열 참조 변수끼리의 대입도 가능, 값을 복사한 것이 아니라 주소를 복사한 것
				
//		new String("aaa");
//		new Scanner();
//		new Random();
	
//		int arr[3];

//		String p = new String("Hello");
//		Random rnd = new Random();
//		Scanner scan = new Scanner()
		System.out.println(arr); //배열 이름,참조 변수명 출력 .toString()메소드가 자동 실행됨
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]); //error - 인덱스 범위를 벗어나면 에러 발생
		
		//배열 요소에 값 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//배열의 초기화
		int[] arr2 = new int[] {10,20,30};
		//int[] arr2 = new int[3] {10,20,30}; //error : 초기화하면 개수 명시 불가!!
		//int[] arr2 = new int[]; //error : 초기화없이 개수명시 없으면 에러!
	
		//초기화의 약식 표기법
//		String s = new String("aaa");
//		String s1 = "aaa";
		
		int[] arr3 = {10, 20, 30}; //자동 new int[]
	
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		//배열의 길이(요소 개수) 변수로 지정 가능함.
//		int[] arr4 = new int[3];
		
		//키보드 입력으로 배열의 개수 입력이 가능함.
//		Scanner scan = new Scanner(System.in);
		
//		int k = scan.nextInt();
//		int[] arr4 = new int[k];
//		k++;
		
//		arr4[0] = 1;
//		arr4[1] = 2;
		
//		for(int i = 0; i < arr4.length; i++) {
//			System.out.print(arr4[i] + ", ");
			
		//배열 요소 개수가 0개짜리인 배열도 만들 수 있음
		int[] arr5 = new int[0];
		System.out.println(arr5.length);
		
		//초기화할 때 변수값으로 값 설정 가능함.
//		int a = 10;
//		int arr[] = {10, 20, 30};
		
		int n = 10;
//		int[] arr6 = new int[] {n, 20, 30};
		int[] arr6 = new int[] {n, n + 1, n + 2};
		for(int i = 0; i < arr6.length; i++) {
			System.out.print(arr6[i] + ", ");
		}
		System.out.println();
		
		//배열 참조 변수에 개수명시 불가
		//int[3] arr7; //error
		
		//배열 참조 변수끼리의 대입
		double[] arr7 = new double[] {1.1, 2.2, 3.3};
		double[] arr8; //배열 참조변수[4byte]
		arr8 = arr7; //같은 배열 객체를 공유하게 됨.
		
		for(int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < arr8.length; i++) {
			System.out.print(arr8[i] + ", ");
		}
		System.out.println();
		
		//다른 참조 변수에 의한 값변경 영향
		arr8[1] = 3.14;
		
		for(int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i] + ", ");
		}
		System.out.println();
		
		//배열 객체의 copy하기[배열 요소값들의 대입]
		int[] arr9 = new int[] {5,6,7};
		int[] arr10 = new int[ arr9.length ];
		
		for(int i = 0; i < arr9.length; i++)
			arr10[i] = arr9[i];

		//arr10의 객체와 arr9의 객체는 서로 다른 객체임.
		
		//기본형 변수의 배열!
		int a, b, c;
		int[] arr11 = new int[3];
		
		//참조형 변수의 배열!
		String s1, s2, s3;
		s1 = new String("aaa");
		s2 = new String("bbb");
		s3 = "ccc"; //자동 new String?()
		
//		System.out.println(s1);
		
//		new String[3];
		
		String[] arr12 = new String[3];
//		System.out.println(arr12);
				
		arr12[0] = new String("Hello");
		arr12[1] = new String("Nice");
		arr12[2] = "android"; //자동 new String()
		
		System.out.println(arr12[0]);
		System.out.println(arr12[1]);
		System.out.println(arr12[2]);
		
		System.out.println(arr12[0].length());
		System.out.println(arr12[1].length());
		System.out.println(arr12[2].length());
//		Scanner scan2 = null;
//		System.out.println(scan2);
		
		char ch = arr12[0].charAt(2);
		System.out.println(ch);
		
		ch = arr12[2].charAt(3);
		System.out.println(ch);
		
		int[] arr13 = new int[] {10, 20, 30};
		
		String[] arr14 = new String[] {new String("Hello"), new String("Nice"), new String("android")};
		//학습 시에 쓰는 방법
		String[] arr15 = new String[] {"Hello", "Nice", "android"};
		String[] arr16 = {"Hello", "nice", "android"}; 
		//현업에서 많이 쓰는 방법
		
		//또 다른 참조형들도 배열 사용 가능함.
//		Random rnd;
		Random[] arr17 = new Random[3];
		System.out.println( arr17[0] );
		
		//각 배열의 요소(Random 참조 변수)에 객체 대입
		arr17[0] = new Random();
		int m = arr17[0].nextInt(15); // 0~14
//		m = arr17[1].nextInt(10); //error
		
		//배열 초기화
		Random[] arr18 = new Random[] {new Random(), new Random(), new Random()};
		Random[] arr19 = {new Random(), new Random()};
		System.out.println(arr19.length);
		System.out.println(arr18.length);
		
		//Scanner 참조 변수를 3개 가진 배열 객체 생성
		Scanner[] aaa = new Scanner[3];
		aaa[0] = new Scanner(System.in);
		aaa[1] = new Scanner(System.in);
		aaa[2] = new Scanner(System.in);

		//사용자 정의 class를 배열로...
		Student stu = new Student(); //객체 생성
		stu.kor = 80;
		
		Student[] stus = new Student[5]; //student 참조변수를 5개 배열로 생성 [ Student 객체를 만들 것이 아님!!!]
		//stus[0].kor = 80; //error;
		stus[0] = new Student(); //이때 Student 객체가 생성
		stus[1] = new Student();
		
//		new int[3];
		
		//확장형 for문.. for each문법
		int[] nums = new int[3];
		nums[0] =10;
		nums[1] =20;
		nums[2] =30;
	
		//배열 요소값 출력
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println("=======");
		
		//반복문으로 요소값 출력
		for(int i = 0 ; i < nums.length; i++) {
//			System.out.println(nums[i]);
			int t = nums[i];
			
			System.out.println(t);
		}
		System.out.println("=======");
		
		//위 반복문을 간략하게 쓰는 문법(for each문)
		for(int t : nums) {
			System.out.println(t);
		}
		
		//for each문을 참조형 변수 배열 객체에 적용
		String[] strs = new String[3];
		strs[0] = new String("Hello");
		strs[1] = new String("Nice");
		strs[2] = "android"; //자동 new String();
		
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		System.out.println("=====");
		
		for(int i = 0 ; i < strs.length; i++) {
			String t = strs[i];
			System.out.println(t);

			System.out.println(strs[i]);
			
			System.out.println(t.length());
			System.out.println(t.charAt(2));
		}
		
		//위 반복문을 간략하게 쓰는 문법(for each문) 
		for(String t : strs) {
			System.out.println(t);
			System.out.print(t + "   ");
			System.out.println(t.charAt(2));
			System.out.println(t.length());
		}
		
	}//main 메소드
}// Main class

//사용자 정의 class
class Student{
	
	int kor;
	int eng;
	int avg;
}
*/

// <책 예제>

//1. 154p ArrayTest1.java

/* 작성 코드
public class Main {
	
	public static void main(String[] args) {

		int[] s = new int[10]; //크기가 10인 배열 생성
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i; //i번째 원소에 i를 저장
		}
		
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}

------------------------------------------------------------------
결과 화면

0 1 2 3 4 5 6 7 8 9 
------------------------------------------------------------------
*/

//2. 155p ArrayTest2.java

/*
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println("성적을 입력하시오 : ");
			scores[i] = scan.nextInt();
		}
		
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
			
			System.out.println("평균 성적은" + total / STUDENTS + "입니다");
		}
	}
}
*/

/*
//3. 156p ArrayTest3.java

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//4. 158p PizzaTopping.java

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//5. 159p 최대값 최소값 구하기

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//6. 161p 특정한 값 찾기

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//7. 163p 주사위 던지기

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//8. 167p ArrayTest4.java

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//<쌤공 문제>

/* 문제 1.
길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
  - 입력된 정수 중에서 최대값
  - 입력된 정수 중에서 최소값
  - 입력된 정수의 총 합

단, 반드시 입력을 완료한 상태에서 '최대값'과 '최소값' 그리고 '총합'을 계산해야 한다. */


/* 문제 2.
아래와 같이 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성해보자.

실행결과 예시)

 학생의 수를 입력하시오 : 2

 학생 1의 성적을 입력하세요 : 20
 학생 2의 성적을 입력하세요 : 110
 잘못된 성적입니다. 다시 입력하시오.
 학생 2의 성적을 입력하세요 : 30
 
 성적 평균은 25.0 입니다. */


/* 문제 3.
입력값들의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램을 작성하시오.
이 프로그램은 1부터 100이하의 정수 10개를 읽어야 하고, 1-10,11-20 등의 범위에 드는
값들의 횟수를 아래와 같이 출력하여야 한다.

  1 - 10 : ****
 11 - 20 : **
 21 - 30 : *
 31 - 40 : **
 ..........
 .......... */


/* 문제 4.
배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자. 아주 작은 극장이라서 좌석이
10개밖에 안 된다. 사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 즉, 예약이
끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.

 좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )?  1

 현재의 예약 상태는 다음과 같습니다.
 -----------------------
 좌석 번호 :  1  2  3  4  5  6  7  8  9  10
 -----------------------
 예약 상태 :  0  0  0  0  0  1  1  1  0   1

 
 몇번째 좌석을 예약하시겠습니까? 6
 죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.
 
 몇번째 좌석을 예약하시겠습니까? 1
 1번 좌석 예약되었습니다.

 좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )?  0
 예약을 종료합니다. */ 


/* 문제 5.
첫번째 배열 arr1은 {10, 20, 30, 40, 50}의 정수형 요소값을 가지고 있다.
두번째 배열 arr2은 { 1,  2 ,  3  ,  4 ,  5 }의 정수형 요소값을 가지고 있다.
세번째 배열 arr3의 요소값은 arr1의 요소와 arr2의 요소값을 차례로 덧셈한
결과를 저장하도록 프로그래밍 해보자. 단 arr2의 요소는 역순으로 더해지도록 하자.
즉, arr1의 0번 요소와 arr2의 4번 요소를 더해서 arr3의 0번 요소에 대입하도록 해야한다.
arr3의 1번 요소에는 arr1의 1번 요소와 arr2의 3번 요소가 더해져야 한다는 것이다.

이렇게 arr3의 요소값을 모두 대입하고 그 값을 차례대로 출력해보자. */


/* 문제 6.
길이가 25인 정수형 배열을 만들어라. 그리고 이 배열의 각 요소에 1부터 25까지 25개의 정수값이
Random하게 저장되도록 프로그래밍 하시오. 단, 배열안에 저장된 Random값은 중복된 숫자가
있으면 안된다. 값들이 제대로 대입되어 있는지 알아보기 위해 1줄에 5개씩 5줄로 각 배열의 요소를
인덱스 순서대로 출력해보자. */