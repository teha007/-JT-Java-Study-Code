//190718(목) 자바 2일차 수업 

/*
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	
	public static void main(String[] args) {
	
		//키보드 입력받기 - 정수형숫자
		int num = 0; //정수형 변수 선언
		int a;
				
		try {
//			num = System.in.read(); //system 안에 in 안에 read 함수를 호출에서 나온 결과값을 num에 넣는다.
//			System.out.println(num);
			
//			num = System.in.read();
//			System.out.println(num);
//			
//			num = System.in.read();
//			System.out.println(num);
			
//			a = System.in.read();
//			a = a - '0';
//			num += (a * 100);
//			
//			a = System.in.read();
//			a = a - '0';
//			num += (a * 10);
//			
//			a = System.in.read();
//			a = a - '0';
//			num += (a * 1);
//			System.out.println(num);
			
			Student stu; //Student 객체 생성
			//Student: 클래스명, stu: 객체명
			stu.show(); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//class System{
//	
//	InputStream in = new Input Stream();
//	PrintStream out;
//}
*/

//#include <stdio.h>
//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) {
//	
//	int num = 0;
	//C++ Student 객체 생성: heap메모리 생성
//	Student* p = new Student();
//	p -> show(); //개발자 암묵적으로 변수명 소문자로 작성
	
//	Student st; //X 생성
	
	//JAVA에서 객체생성할 때의 절대규칙!!!
	//모든 객체는 오직 heap에서만 생성이 가능함 - 무조건 NEW 키워드로 생성해야만 함
		
	//키보드 입력을 자료형에 맞게 편하게 할 수 있는 기능을 가진 객체 [Scanner]
	//new 키워드로 객체를 만들면 만들어진 메모리의 주소를 리턴함!!
	//참조변수(포인터 변수) p에 주소를 저장하여 객체를 제어함
//	Scanner p = new Scanner(System.in); //Scanner 객체 생성
//	num = p.nextInt(); //nextInt의 리턴값을 num에 넣는다.
//	System.out.println("num : " + num);
	
//	Scanner scan = new Scanner(System.in);
	
//	int a, b;
	
//	a = scan.nextInt();
//	b = scan.nextInt();
	
//	System.out.println( a + b );

//	double a;
//	a = scan.nextDouble();	

//	boolean a;
//	a = scan.nextBoolean();
	
//	String s;
//	s = scan.next();
//	s = scan.nextLine(); //띄어쓰기를 해도 전체값 출력
//	s = scan.next();
	
	//if(s == "kim") { // s == "kim" 문자열 상수 kim 메모리 주소와 s의 메모리 주소가 같으면 "김씨군요."출력
		//문자열은 == 비교 사용하지 마세요. 참조형 변수는 == 비교 사용하지 마세요.
//	if(s.equals("kim")) { //문자열 비교를 사용하려면 s.equals을 사용해라.
//		System.out.println("김씨군요.");
//	}
//	else {
//		System.out.println("aaaaa");
//	}
//	System.out.println("a : " + s);
//	}

//랜덤값을 만들 수 있는 능력을 가진 클래스: Random
//Random 클래스로 객체를 생성해서 그 객체가 가진 기능을 실행
//참조 변수 만들기[리모콘]

//import java.util.Random;
//public class Main {
	
//	public static void main(String[] args) {

//Random rnd;
//Random 객체 생성
//rnd = new Random();

//int r = rnd.nextInt() % 10;
//r = r < 0? -r: r;

//int r = rnd.nextInt(10) + 5;
//boolean r = rnd.nextBoolean();
//int r = rnd.nextDouble();

//double r = rnd.nextDouble() * 100; == double r = (Math.random() * 100); //같은 효과

//System.out.println("output : " + r);
//	}
//}



//쌤공 문제 실습 시간

/*
2. 190718_콘솔 입력.txt

문제 1.
프로그램 사용자로부터 두 개의 정수를 입력받아서 두 수의 뺄셈과 곱셈의 결과를 
출력하는 프로그램을 작성해 보자.
*/
	
/*
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int a1; //입력받을 1번째 정수형 변수 a1
		int a2; //입력받을 2번째 정수형 변수 a2
		
		System.out.println("두 개의 정수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		
		int a3 = a1 - a2; //a1 - a2 연산 값을 받아줄 변수 a3
		System.out.println("입력한 두 정수의 뺄셈값은 : " + (a1 - a2));
		
		System.out.println("입력한 두 정수의 값의 차이는 : ");
		a3 = a3 < 0? -a3: a3;
		System.out.println(a3);
				
		System.out.println("입력한 두 정수의 곱셈값은 : " + (a1 * a2));
	}
}
*/
	
/*
문제 2.
프로그램 사용자로부터 세 개의 정수 num1, num2, num3를 순서대로 입력 받은 후에,
다음 연산의 결과를 출력하는 프로그램을 작성해보자.
(입력문은 세 번 사용)

num1 * num2 + num3
단, 입력받은 세 개의 정수가 2, 4, 6이라면 다음의 형태로 출력을 해야 한다.
2 * 4 + 6 = 14
*/

/*
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num1; //1번째 정수
		int num2; //2번쨰 정수
		int num3; //3번째 정수
		
		System.out.println("세 개의 정수를 숩서대로 입력하시오  : ");
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
				
		scan.close(); //scan 활용시 메모리 누수 현상 발생 제거 scan.close()
		
		System.out.println( "입력한 값의 결과값 : " + (num1 * num2 + num3);
	}
}
*/
  
/* 문제 3.
하나의 정수를 입력 받아서, 그 수의 제곱의 결과를 출력하는 프로그램을 작성해보자.
예들 들어서 5가 입력되면 25가 출력되어야 한다. */

/* 작성 코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num1; //입력값을 받을 정수형 변수 num1
		
		System.out.print("1개의 정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		scan.close();
		
		System.out.println("입력한 정수의 제곱값은 : " + num1 * num1);
	}
}

------------------------------------------------------------------
결과 화면

1개의 정수를 입력하시오 : 10
입력한 정수의 제곱값은 : 100
------------------------------------------------------------------
*/

/* 문제 4.
프로그램 사용자로부터 두 개의 실수를 입력 받아서 double형 변수를 저장하자.
그리고 두 수의 사칙연산 결과를 출력해보자. */

/* 작성 코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		double num1; //입력받을 1번째 실수형 변수 num1
		double num2; //입력받을 2번째 실수형 변수 num2
			
		System.out.print("사용자님 1번째 데이터를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextDouble();
				
		System.out.print("사용자님 2번째 데이터를 입력하세요 : ");
		num2 = scan.nextDouble();
		scan.close();
		
		System.out.println("사용자님이 입력하신 1번 데이터와 2번 데이터의 +값은 : " + (num1 + num2) + "입니다.");
		System.out.println("사용자님이 입력하신 1번 데이터와 2번 데이터의 -값은 : " + (num1 - num2) + "입니다.");
		System.out.println("사용자님이 입력하신 1번 데이터와 2번 데이터의 X값은 : " + (num1 * num2) + "입니다.");
		System.out.println("사용자님이 입력하신 1번 데이터와 2번 데이터의 /값은 : " + (num1 / num2) + "입니다.");
		System.out.println("사용자님이 원하신 모든 결과를 출력했습니다. 좋은 하루 되세요!!");
	}
}

------------------------------------------------------------------
결과 화면

사용자님 1번째 데이터를 입력하세요 : 7
사용자님 2번째 데이터를 입력하세요 : 5
사용자님이 입력하신 1번 데이터와 2번 데이터의 +값은 : 12.0입니다.
사용자님이 입력하신 1번 데이터와 2번 데이터의 -값은 : 2.0입니다.
사용자님이 입력하신 1번 데이터와 2번 데이터의 X값은 : 35.0입니다.
사용자님이 입력하신 1번 데이터와 2번 데이터의 /값은 : 1.4입니다.
사용자님이 원하신 모든 결과를 출력했습니다. 좋은 하루 되세요!!
------------------------------------------------------------------
*/

/* 문제 5.
입력받은 두 정수를 나누었을 때 얻게 되는 몫과 나머지를 출력하는 프로그램을 작성해보자. 
예를 들어 7과 2가 입력되면 몫으로 3, 나머지는 1이 출력되어야 한다. */

/* 작성코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num1; //입력받을 1번째 정수형 변수 num1
		int num2; //입력받을 2번째 정수형 변수 num2
		
		System.out.print("사용자님 1번째 데이터를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		
		System.out.print("사용자님 2번째 데이터를 입력하세요 : ");
		num2 = scan.nextInt();
		
		System.out.printf("입력하신 2개의 데이터를 나눈 뒤의 몫은 : %d \n", num1 / num2);
		System.out.printf("입력하신 2개의 데이터를 나눈 나머지는 : %d", num1 % num2);
	}
}

------------------------------------------------------------------
결과 화면

사용자님 1번째 데이터를 입력하세요 : 7
사용자님 2번째 데이터를 입력하세요 : 2
입력하신 2개의 데이터를 나눈 뒤의 몫은 : 3 
입력하신 2개의 데이터를 나눈 나머지는 : 1
------------------------------------------------------------------
*/

/* 문제 6.
입력 받은 세 개의 정수 num1,num2,num3를 대상으로 다음 연산의 결과를 
출력하는 프로그램을 작성해 보자.
(num1 - num2) * (num2 + num3) * (num3 - num1) */

/*
문제 7.
마일을 킬로미터로 변환하는 프로그램을 작성하자. 
1마일은 1.609킬로미터와 같다.

마일을 입력하시오: 10
10마일은 16.09킬로미터입니다.
*/

/* 작성 코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int mile; //입력받을 정수형 변수 num1
		double kilo = 1.609; // 1.609킬로미터를 담을 실수형 변수 mile
		
		System.out.printf("안녕하세요!! \n");
		System.out.printf("마일을 킬로미터로 변환하는 프로그램입니다.\n");
		System.out.print("사용자님, 마일을 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		mile = scan.nextInt();
		
		System.out.printf("%d마일은 %.2f킬로미터입니다. \n", mile, mile * kilo);
	}
}

------------------------------------------------------------------
결과 화면

안녕하세요!! 
마일을 킬로미터로 변환하는 프로그램입니다.
사용자님, 마일을 입력하세요 : 10
10마일은 16.09킬로미터입니다. 
------------------------------------------------------------------
*/

/* 문제 8.
사용자로부터 원의 반지름을 입력받아서 면적을 계산하여 출력하는 프로그램을 작성하자.
단, 원의 반지름(r)은 실수(double형)로 입력되며 출력도 모두 실수형으로 하여야 한다.
면적을 계산하는 식은 다음과 같다.

3.14 * r * r
*/

/* 작성 코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		double r; //반지름을 입력받을 실수형 변수 r
		double pi = 3.14; //파이값을 받아줄 변수 ban
		System.out.print("안녕하세요. 사용자님 \n");
		System.out.print("지금 사용하시는 프로그램은 반지름으로 면적을 알아보는 프로그램입니다. \n");
		System.out.print("원의 면적이 궁금하다면 반지름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		r = scan.nextDouble();
		scan.close();
		
		System.out.printf("원의 면적은 %.2f", (pi * r * r));
	}
}

------------------------------------------------------------------
결과 화면

안녕하세요. 사용자님 
지금 사용하시는 프로그램은 반지름으로 면적을 알아보는 프로그램입니다. 
원의 면적이 궁금하다면 반지름을 입력하세요 : 10
원의 면적은 314.00
------------------------------------------------------------------
*/

//수고하셨습니다. 상호님!! 오늘의 1번째 문서 콘솔 입력.txt 파일을 모두 완료했습니다.


//3. 190718_Operator.txt

/*
문제 1.
상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에서는 10% 부가세와
잔돈 등이 인쇄되어 있다. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와
잔돈을 출력하는 프로그램을 작성하여 보자.

받은 돈   :10000
상품 가격:7500
  
부가세:750
잔돈   :1750
*/

/* 작성 코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int rm = 0; //받은 돈을 넣어줄 정수형 변수 rm(receive money) -입력받을 변수
		int pm = 0; //상품 가격을 넣어줄 정수형 pm(price money) -입력받을 변수
		
		System.out.print("안녕하세요. 주인님 \n");
		System.out.print("이 프로그램은 주인님께서 고객에게 받은 돈과 상품 가격을 입력하시면 부가세와 잔돈을 알아서 계산해주는 똑똑한 프로그램입니다.\n");
		System.out.print("그럼 지금부터 프로그램을 시작하겠습니다!! \n");
		System.out.print("고객에게 받은 돈을 입력해주세요 : ");
		
		Scanner scan = new Scanner(System.in);
		rm = scan.nextInt();
		
		System.out.print("고객이 구입한 상품 가격을 입력해주세요 : ");
		pm = scan.nextInt();
		
		scan.close();
		
		int vat = pm / 10 ; //부가세로 넣어줄 정수형 변수 vat(Value Added Tax) -출력받값을 을 변수
		int ch = rm - pm - vat; //잔돈을 넣어줄 정수형 변수 ch(change) -출력값을 받을 변수
		
		System.out.printf("주인님이 국세청에 내야할 부가세는 : %d원입니다. \n", vat);
		System.out.printf("고객에게 드릴 잔돈은 : %d원입니다. \n", ch);
	}

}

------------------------------------------------------------------
결과 화면

안녕하세요. 주인님 
이 프로그램은 주인님께서 고객에게 받은 돈과 상품 가격을 입력하시면 부가세와 잔돈을 알아서 계산해주는 똑똑한 프로그램입니다.
그럼 지금부터 프로그램을 시작하겠습니다!! 
고객에게 받은 돈을 입력해주세요 : 10000
고객이 구입한 상품 가격을 입력해주세요 : 7500
주인님이 국세청에 내야할 부가세는 : 750원입니다. 
고객에게 드릴 잔돈은 : 1750원입니다. 
------------------------------------------------------------------
*/

/* 문제 2.
프로그램 사용자로부터 두 점의 x, y좌표를 입력 받아서, 두 점이 이루는 직사각형의 
넓이를 계산하여 출력하는 프로그램을 작성해보자. 

단, 좌 상단의  x, y 좌표 값이 우 하단의 x,y 좌표 값보다 작다고 가정하고, 
좌 상단의 좌표정보를 먼저 입력받는 형태로 예제를 작성해보자. 
참고할 수 있는 실행예는 다음과 같다.

좌 상단의 x 좌표 : 2
좌 상단의 y 좌표 : 4
우 하단의 x 좌표 : 4
우 하단의 y 좌표 : 8
두 점이 이루는 직사각형의 넓이는 8입니다.
*/

/* 코드 작성
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int lhx; //좌상단 x좌표 변수 lhx
		int lhy; //좌상단 y좌표 변수 lhy
		
		int rlx; //우하단 x좌표 변수 rlx
		int rly; //우하단 y좌표 변수 rly
		
		//결과값은 = result1 * result2를 곱한 값이다.
		System.out.println("안녕하세요. 주인님");
		System.out.println("이 프로그램은 주인님께서 두 점의 X,Y 좌표를 입력하시면 직사각형의 넓이를 출력해주는 프로그램입니다.");
		System.out.println("그럼 지금부터 프로그램을 시작하겠습니다!!");
		
		System.out.print("좌 상단의 x 좌표 값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		lhx = scan.nextInt();
		
		System.out.print("좌 상단의 y 좌표 값을 입력하세요 : ");
		lhy = scan.nextInt();

		System.out.print("우 하단의 x 좌표 값을 입력하세요 : ");
		rlx = scan.nextInt();
		
		System.out.print("우 하단의 y 좌표 값을 입력하세요 : ");
		rly = scan.nextInt();
		
		scan.close();
		
		int result1 = rlx - lhx;
		int result2 = rly - lhy;
		
		System.out.printf("두 점이 이루는 직사각형의 넓이는 %d입니다.", result1 * result2);
	}
}

------------------------------------------------------------------
결과 화면

안녕하세요. 주인님
이 프로그램은 주인님께서 두 점의 X,Y 좌표를 입력하시면 직사각형의 넓이를 출력해주는 프로그램입니다.
그럼 지금부터 프로그램을 시작하겠습니다!!
좌 상단의 x 좌표 값을 입력하세요 : 2
좌 상단의 y 좌표 값을 입력하세요 : 4
우 하단의 x 좌표 값을 입력하세요 : 4
우 하단의 y 좌표 값을 입력하세요 : 8
두 점이 이루는 직사각형의 넓이는 8입니다.
------------------------------------------------------------------
*/

/* 문제 3.
사용자로 부터 정수 하나를 입력받아라. 
입력받은 정수의 절대값을 출력하는 프로그램을 작성하시오.
*/


/* 문제 4.
사용자로부터 정수 3개를 입력받아서 정수 3개의 합, 평균, 최대값, 최소값을 구해서 출력하는 프로그램을
작성하여 보자. 단, 평균은 소수점 이하의 숫자도 출력되도록 한다.
*/
         

//4. 190718_제어문.txt

//반복문은 while문과 do-while, 
//for문 중 아무거나 사용하되 가급적 모두 사용해 보자. 

/*
문제 1.
프로그램 사용자로부터 양의 정수를 하나 입력받아서, 
그 수만큼 "Hello World!"를 출력하는 프로그램을 작성해보자.
*/

/*
문제 2.
프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 
그 수만큼 3의 배수를 출력하는 프로그램을 작성해 보자. 

예를 들어 5를 입력받았다면 3, 6, 9, 12, 15를 출력해야 하고 
3을 입력받았다면 3, 6, 9를 출력해야 한다.

/*
문제 3.
프로그램 사용자로부터 계속해서 정수를 입력받는다. 
그리고 그 값을 계속해서 더해나간다. 

이러한 작업은 프로그램 사용자가 0을 입력할 때까지 계속되어야 하며, 
0이 입력되면 입력된 모든 정수의 합을 출력하고 프로그램을 종료한다.
*/

/*
문제 4.
프로그램 사용자로부터 입력 받은 숫자에 해당하는 구구단을 출력하되, 
역순으로 출력하는 프로그램을 작성해 보자.
*/

/*
문제 5.
프로그램 사용자로부터 입력 받은 정수의 평균을 출력하는 프로그램을 작성하되
다음 두 가지 조건을 만족시켜야 한다.

- 먼저 몇 개의 정수를 입력할 것인지 프로그램 사용자에게 묻는다. 
    그리고 그 수만큼 정수를 입력 받는다.
- 평균값은 소수점 이하까지 출력되도록 한다.
*/

/*
문제 6.
프로그램 사용자로부터 총 5개의 정수를 입력받아서, 
그 수의 합을 출력하는 프로그램을 작성해보자. 

단, 한가지 조건이 있다. 
정수는 반드시 1이상이어야 한다.
 
만약에 1미만의 수가 입력되는 경우에는, 
이를 입력으로 인정하지 않고 재 입력을 요구해야 한다. 
그래서 결국 1이상의 정수 5개를 모두 입력받을 수 있는 
프로그램을 완성해야  한다.
*/

/*
문제 7.
아래의 출력을 보이는 프로그램을 작성해보자.

*
o *
o o *
o o o *
o o o o *

참고로, 총 5행에 걸쳐서 출력이 이루어지고, 행이 더해질 때마다 
'o'문자가 증가한다는 특징을 기반으로 반복문의 중첩을 구성하면 된다.
*/

/*
문제 8.
1이상 100미만의 정수 중에서 7의 배수와 9의 배수를 출력하는 프로그램을 작성해 보자.
단! 7의 배수이면서 동시에 9의 배수인 정수는 한번만 출력해야 한다.
*/

/*
문제 9.
두 개의 정수를 입력 받아서 두 수의 차를 출력하는 프로그램을 구현해 보자. 
단, 무조건 큰 수에서 작은 수를 뺀 결과를 출력해야 한다. 

예를 들어서 입력된 두 수가 순서에 상관없이 12와 5라면 7이 출력되어야 하고, 
입력된 두 수가 순서에 상관없이 4와 16이라면 12가 출력되어야 한다. 
즉, 출력 결과는 무조건 0 이상이 되어야 한다.
*/

/*
문제10.
문제 9번의 내용을 if~else를 사용하여 해결하였는가? 
이를 if~else가 아닌 삼항연산자를 이용하여 구현해 보자. 

/*
문제11.
구구단을 출력하되 짝수 단(2단, 4단, 6단, 8단)만 출력되도록 한다. 
또한 2단은 2 * 2까지, 4단은 4 * 4까지, 6단은 6 * 6까지, 8단은 8 * 8까지만 출력되도록 해보자. 
이를 해결하기 위해 break와 continue문을 사용해보자.
(안써도 프로그래밍은 가능하지만 연습하는 의미에서 적용해 볼 것)
*/


//자바의 정석 
//2. 190718_연산자(C3)
 

//3. 190718_제어문(C4)






























