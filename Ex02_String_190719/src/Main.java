//190719(금) 자바 수업 3일차 - 문자열 공부

/*
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
	//java에서는 문자열(string)을 객체로 관리함.
	//즉, java에서는 문자열은 객체임!!!
	
	//10;
	//3.14;
	//객체의 주소를 저장하는 변수 : 참조변수 
	//String str= "Hello";
	//String str; //String 객체를 참조하는 변수 선언
		
	//str = "Hello"; //literal 문자열 상수 객체 생성
	
	//int n = "He".length(); 
	//고객이 회원 가입시에 입력한 글자수를 체크
	
	//String str = new String("Hello"); //String 참조 변수
//	(1) String str = "Hello";
//	(2) String str = new String("Hello");
		
//	String str2 = "Hello";
			
	//System.out.println(str);
	//System.out.println(str2);
	//System.out.println(str == str2);
	//참조 변수끼리의 비교 연산은 주소끼리의 연산을 의미함.
		
	String str = null;
//	System.out.println(str);
	//null을 넣으면 null이 나옴
	
	str = new String("Hello");
//	System.out.println(str);
//	System.out.println(str.toString());
//	(str) == (str.toString())
	
//	Random rnd = new Random(); //참조 변수
//	System.out.println(rnd);
//	System.out.println(rnd.toString());
	
//	String str = new String("Hello");
//	
//	//객체는 기능(Method)들을 보유하고 있음.
//	//String 객체의 유용한 메소드들
//	
//	//1.문자열 데이터의 길이(글자수)를 리턴해주는 기능(Method)
//	int len = str.length();
//	System.out.println(len);
//	
//	//2. 문자열값의 비교
//	System.out.println(str == "Hello"); //false: 주소 비교
//	System.out.println(str.equals("Hello"));
//	System.out.println(str.equals(new String("Hello")));
//	String s1 = "Hello";
//	System.out.println(str.equals(s1));
//	System.out.println("Hello".equals(str));
//	
//	//2-1. 대소문자 비교
//	System.out.println(str.equals("hello"));
//	System.out.println(str.equalsIgnoreCase("hello"));
	//대소문자 구분 없이 비교하는 함수 equalsIgnoreCase
	
	//3. 문자열에서 특정 char 얻어오기!!
//	char ch = str.charAt(0);
//	System.out.println(ch);
//	System.out.println(str.charAt(1));
//	System.out.println(str.charAt(2));
//	System.out.println(str.charAt(3));
//	System.out.println(str.charAt(4));
//	System.out.println(str.charAt(5)); //에러 hello는 0~4번 배열까지만
	
//	for(int i = 0; i < str.length(); i++) {
//		System.out.println(str.charAt(i));
//		}
	//Scanner를 이용해서 한문자(char) 입력받기
//	Scanner scan = new Scanner(System.in);
//	String s2 = scan.next(); //문자열 입력받기
//	char c = s2.charAt(0);
//	System.out.println(c);
	
	//4. 문자열안에 특정 문자가 몇번째에 있는지..
	int index = str.indexOf('l');
	System.out.println(index);
	System.out.println(str.lastIndexOf('l'));
	
	//문자열 검색도 가능
	System.out.println(str.indexOf("eo"));
	//indexOf를 썼을 때 -1이 결과값으로 나오면 방번호를 못찾았다는 의미
	System.out.println(str.indexOf('e',2));//2번방부터 검사해
	
	//5. 파라미터로 전달된 문자열이 내 문자열 안에 포함되어 있는가?
	String s = "Hello world! Hello android! nice world!";
	boolean b = s.contains("world");
	System.out.println(b);
	
	//6. 문자열 결합
	String s3 = s.concat(" nice android!"); //원본 변경 X, 새로운 문자열을 리턴
	s3 = s + "aaa";
	
	System.out.println(s); //원본은 그대로...
	System.out.println(s3);
	
	//7. 특정 문자열로 시작되는가?
	System.out.println(s.startsWith("Hello"));
	System.out.println(s.startsWith("https"));

	//7-1. 특정 문자열로 종료되는가?
	System.out.println(s.endsWith("Hello"));
	System.out.println(s.endsWith("world"));
	
	//8. 대소문자 자동 변환
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s); //원본은 바뀌지 않음
	
//	s = s.toUpperCase();
	
	//9. 문자열의 양끝쪽 공백문자를 제거하기!!(중간 공백 문자는 제거 안 함)
	s = " Hello     ";
	System.out.println(  "[" + s + "]"  );
	System.out.println(s.equals("Hello"));
	
	s.trim();
	System.out.println(  "[" + s + "]"  );
	System.out.println(s.equals("Hello"));
		
	//10. 특정 문자 바꿔치기!!
	s = "Hello world! Hello android! nice world!";
	System.out.println(s.replace('H', 'K'));
	System.out.println(s.replace("android", "ios"));
	//중간 공백도 제거할 수 있음
	System.out.println(s.replace(" ",""));
	
	//11. 문자열 잘라내기!!
	String s4 = s.substring(6);
	System.out.println(s4);
	
	String s5 = s.substring(6, 12);
	System.out.println(s5);
	
	//12. 문자열 값의 대소비교!! <- 정렬
	char ch1 = 'a';
	char ch2 = 'b';
	System.out.println( ch1 > ch2);
	
	String s6 = "aac";
	String s7 = "aab";
	
//	System.out.println(s6 > s7); //error: 주소 비교는 안 됨
	System.out.println(s6.compareTo(s7)); //음수면 s6이 작고 양수면 s6이 크다.
	
	//13. 문자열로 분리!!(문자열을 분리해서 배열로 만들어 줌)
	s = "android:ios:nice:windows";
	String[] arr = s.split(":"); //String 배열로 리턴
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]); 
		}
	
	// String class의 static Method들...
	// static 메소드 : 객체 생성 없이 바로 사용할 수 있는 메소드[ 클래스명.메소드명()];
	
	//1) 포멧 만들어주는... like... printf()같은...
	int h   = 10; //시
	int m   =  5; //분
	int sec = 12; //초
	System.out.println(h+":"+m+":"+sec);
	System.out.printf("%02d:%02d:%02d \n", h, m, sec);
	
	//System.out.printf()는 콘솔창만 가능함..
	
	//특정 포맷(문자열 모양)으로 만들어주는 기능
	String s10 = String.format("%02d:%02d:%02d", h, m, sec);
	System.out.println(s10);
//	
	//기본(primitive) 자료형을 String 객체로 변환 가능
	int num = 10;
	String s11 = String.valueOf(num);
	System.out.println(s11.length());
	
	
	s11 = String.valueOf(3.14);
	System.out.println(s11.length());
	
	
	s11 = String.valueOf(true);
	System.out.println(s11.length());
	//String.format(format, args)
	
	//실제로 String.valueOf()는 잘 사용하지 않음. wh?
	s11 = 10+"";
	s11 = 3.14+"";
	s11 = true+"";
	
	//반대로, String을 기본으로..(Integer, Double, Float, Byte, Boolean)
	//Wrapper클래스(기본형을 참조형으로..감싸주는 클래스)
	int n = Integer.parseInt("100"); //String ->int
	double d = Double.parseDouble("3.14");//String->double
	}
}
229p ~ 235p 읽고 예제 따라하기
*/

/* 문제 4.
사용자로부터 정수 3개를 입력받아서 정수 3개의 합, 평균, 최대값, 최소값을 구해서 출력하는 프로그램을
작성하여 보자. 단, 평균은 소수점 이하의 숫자도 출력되도록 한다.
*/

/* 코드 작성 
import java.util.Scanner;

class MaxMin{
	
	public int Max_1(int num, int max)
	{
		if(num >= max)
		{
			max = num;
		}
		return max;
	}
	
	public int Min_1(int num, int min) 
	{
		if(num <= min || min == 0)
		{
			min = num;
		}
		return min;
	}
}	


public class Main{
 public static void main(String[] args) {
  
 int num = 0; //값을 입력받을 정수형 변수 num
 int max = 0; //최대값을 넣어줄 정수형 변수 max
 int min = 0; //최소값을 넣어줄 정수형 변수 min
 int sum = 0; //합을 구할 정수형 변수 sum

  
  System.out.println("안녕하세요. 주인님");
  System.out.println("저는 주인님이 입력하신 3개의 데이터를 바탕으로 합과 평균, 최대값, 최소값을 구하는 프로그램입니다.");
  System.out.println("그럼 지금부터 프로그램을 시작하겠습니다.");
 
  MaxMin xn = new MaxMin();
  Scanner scan = new Scanner(System.in);
  
  for(int i=1; i<=3; i++) {
	  System.out.println(i + "번째 숫자를 입력하세요.");
	  	num = scan.nextInt();
		  	
	  	sum = sum + num;
	  	
	  	max = xn.Max_1(num, max);
	  	min = xn.Min_1(num, min);
  }
    
  double avg = sum/3; //평균을 구할 실수형 변수 avg
  
//  num = scan.nextInt();
//  num = scan.nextInt();
//  
  
  
//  int sum = num + num + num;
//  float avg = (float)(num + num + num)/3;

  System.out.printf("입력하신 데이터의 합은 : %d \n", sum);
  System.out.printf("입력하신 데이터의 평균은 : %.2f \n", avg);
  System.out.printf("입력하신 데이터 중 최대값은 : %d \n", max);
  System.out.printf("입력하신 데이터 중 최소값은 : %d \n", min);
 }
}

------------------------------------------------------------------
결과 화면
안녕하세요. 주인님
저는 주인님이 입력하신 3개의 데이터를 바탕으로 합과 평균, 최대값, 최소값을 구하는 프로그램입니다.
그럼 지금부터 프로그램을 시작하겠습니다.
1번째 숫자를 입력하세요.
7908
2번째 숫자를 입력하세요.
273
3번째 숫자를 입력하세요.
10
입력하신 데이터의 합은 : 8191 
입력하신 데이터의 평균은 : 2730.00 
입력하신 데이터 중 최대값은 : 7908 
입력하신 데이터 중 최소값은 : 10 
------------------------------------------------------------------
//참고한 사이트 : https://tinyurl.com/yxb5x9p7(입력받은 값의 최대값, 최소값 출력)

*/

//4. 190718_제어문.txt

//반복문은 while문과 do-while, 
//for문 중 아무거나 사용하되 가급적 모두 사용해 보자. 

/*
문제 1.
프로그램 사용자로부터 양의 정수를 하나 입력받아서, 
그 수만큼 "Hello World!"를 출력하는 프로그램을 작성해보자.
*/

/* 코드 작성
import java.util.Scanner;
	public class Main{
		public static void main(String[] args){
			int num; //사용자로부터 입력받을 정수형 변수 num
			
			System.out.println("안녕하세요. 주인님");
			System.out.println("저는 주인님이 입력하신 정수의 데이터만큼 \"Hello world!\"를 출력하는 착한 프로그램입니다.");
			System.out.print("원하시는 정수 데이터를 입력하세요 : ");
			
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			
			for(int i=1; i <= num; i++) {
				System.out.println(i+"번째 " + "\"Hello world!\"");
			}
				
			
		}
}

----------------------------
결과 화면

안녕하세요. 주인님
저는 주인님이 입력하신 정수의 데이터만큼 "Hello world!"를 출력하는 착한 프로그램입니다.
원하시는 정수 데이터를 입력하세요 : 5
1번째 "Hello world!"
2번째 "Hello world!"
3번째 "Hello world!"
4번째 "Hello world!"
5번째 "Hello world!"
----------------------------
*/

/* 문제 2.
프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 
그 수만큼 3의 배수를 출력하는 프로그램을 작성해 보자. 

예를 들어 5를 입력받았다면 3, 6, 9, 12, 15를 출력해야 하고 
3을 입력받았다면 3, 6, 9를 출력해야 한다. */

/* 코드 작성
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num; //주인님에게 입력받을 정수형 변수 num
		int three = 3; //주인님이 입력하신 정수값에 3를 곱해줄 정수형 변수 three
		
		System.out.println("주인님, 안녕하세요.");
		System.out.println("저는 주인님께서 입력하신 수만큼 3의 배수를 출력하는 프로그램입니다.");
		System.out.print("원하시는 숫자를 입력해주세요 : ");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
				for(int i=1; i <= num; i++)
		{
			System.out.println(i + "번째 : " + three * i);
		}
	}
}

----------------------------
결과 화면

주인님, 안녕하세요.
저는 주인님께서 입력하신 수만큼 3의 배수를 출력하는 프로그램입니다.
원하시는 숫자를 입력해주세요 : 5
1번째 : 3
2번째 : 6
3번째 : 9
4번째 : 12
5번째 : 15
----------------------------
*/

/* 문제 3.
프로그램 사용자로부터 계속해서 정수를 입력받는다. 
그리고 그 값을 계속해서 더해나간다. 

이러한 작업은 프로그램 사용자가 0을 입력할 때까지 계속되어야 하며, 
0이 입력되면 입력된 모든 정수의 합을 출력하고 프로그램을 종료한다.
*/

/* 작성 코드
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num; //주인님으로부터 입력받을 정수형 변수 num
		int sum = 0; //주인님으로부터 입력받은 값을 누적시켜줄 정수형 변수 sum 
		
		System.out.println("주인님, 안녕하세요.");
		System.out.println("저는 주인님이 입력하신 정수형 데이터를 계속 더하고 0을 입력하시면 종료되는 프로그램입니다.");
		System.out.println("그럼~ 프로그램을 시작하겠습니다.");
		
		Scanner scan = new Scanner(System.in);
				
		while(true)
		{
			System.out.print("값을 입력해주세요 : ");
			
			num = scan.nextInt();
					
			if(num == 0)
			{
				System.out.println("0을 입력하셨습니다. 프로그램이 종료됩니다.");
				break;
			}
						
			else {
			sum = sum + num;
			System.out.println("현재 누적된 값은 : " + sum + "\n");
			}
		}
	}
}

----------------------------
결과 화면

주인님, 안녕하세요.
저는 주인님이 입력하신 정수형 데이터를 계속 더하고 0을 입력하시면 종료되는 프로그램입니다.
그럼~ 프로그램을 시작하겠습니다.
값을 입력해주세요 : 5
현재 누적된 값은 : 5

값을 입력해주세요 : 5
현재 누적된 값은 : 10

값을 입력해주세요 : 5
현재 누적된 값은 : 15

값을 입력해주세요 : 5
현재 누적된 값은 : 20

값을 입력해주세요 : 0
0을 입력하셨습니다. 프로그램이 종료됩니다.
----------------------------
*/

/*
문제 4.
프로그램 사용자로부터 입력 받은 숫자에 해당하는 구구단을 출력하되, 
역순으로 출력하는 프로그램을 작성해 보자.
*/
//
//import java.util.Scanner;
//
//public class Main{
//	public static void main(String[] args) {
//		int num; //주인님으로부터 숫자를 입력받을 정수형 변수  num
//		int j;
//		
//		System.out.println("안녕하세요. 주인님");
//		System.out.println("저는 주인님이 입력하신 숫자에 해당하는 구구단을 역순으로 출력하는 똑똑한 프로그램입니다.");
//		System.out.print("출력하고 싶은 단수를 입력해보세요 : ");
//		
//		Scanner scan = new Scanner(System.in);
//		num = scan.nextInt();
//		System.out.print("\n");
//		System.out.println(num + "단 구구단을 출력합니다.");
//		
//		for(j=9; j>0; j--)
//		{
//			System.out.printf("%d * %d = %d \n", num, j, (num * j));
//		}
//		System.out.print("\n");
//		System.out.println("출력이 끝났습니다.");
//		System.out.println("프로그램을 종료합니다.");
//	}
//}
//
//--------------------------------------------------------
//결과 화면
//
//안녕하세요. 주인님
//저는 주인님이 입력하신 숫자에 해당하는 구구단을 역순으로 출력하는 똑똑한 프로그램입니다.
//출력하고 싶은 단수를 입력해보세요 : 3
//
//3단 구구단을 출력합니다.
//3 * 9 = 27 
//3 * 8 = 24 
//3 * 7 = 21 
//3 * 6 = 18 
//3 * 5 = 15 
//3 * 4 = 12 
//3 * 3 = 9 
//3 * 2 = 6 
//3 * 1 = 3 
//
//출력이 끝났습니다.
//프로그램을 종료합니다.
//--------------------------------------------------------

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







