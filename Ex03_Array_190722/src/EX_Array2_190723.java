//190723(화) 자바 수업 5일차 2차원 배열

/*
import java.util.ArrayList;
import java.util.Scanner;

public class EX_Array2_190723 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  int[] arr = new int[3];
  
  //2차원 배열 
  int[][] aaa = new int[2][3];
  
  //배열 요소에 값 대입
  aaa[0][0] = 10;
  aaa[0][1] = 20;
  aaa[0][2] = 30;
  
  aaa[1][0] = 100;
  aaa[1][1] = 200;
  aaa[1][2] = 300;
  
  //배열 요소값 출력
  
//  System.out.println(aaa[0][geta()]);
//  System.out.println(aaa[0][n]);
  System.out.println(aaa[0][0]);  
  System.out.println(aaa[0][0+1]);
  System.out.println(aaa[0][0]+5);
  System.out.println(aaa[0][1]);
  System.out.println(aaa[0][2]);
  System.out.println();
  
  System.out.println(aaa[1][0]);
  System.out.println(aaa[1][1]);
  System.out.println(aaa[1][2]);
  System.out.println();
  
  //배열의 길이값 알아보기
  System.out.println("배열의 길이는 : " + aaa.length);
  System.out.println(aaa[0].length);
  System.out.println(aaa[1].length);
  System.out.println();
  
  //반복문 이용 배열요소값 출력
//  for(int i = 0; i<2; i++) {
//   for(int k=0; k<3; k++) {
//    System.out.println(aaa[i][k]);
//   }
//   System.out.println();
   
  for(int i = 0; i < aaa.length; i++) {
   for(int k=0; k < aaa[i].length; k++) {
    System.out.println(aaa[i][k]);
   }
   System.out.println(); 
  }
  System.out.println();
  
  //각 층마다 다른 길이의 2차원 배열 만들기
//  int[][] bbb = new int[3][];
  
  //각 층이 참조하는 1차원 배열 객체 생성하여 대입
//  bbb[0] = new int[2];
//  bbb[1] = new int[5];
//  bbb[2] = new int[4];
//  
//  for(int i = 0; i < bbb.length; i++) {
//   for(int k = 0; k < bbb[i].length; k++) {
//    System.out.print(bbb[i][k] + "   ");
//   }
//   System.out.println();
//  }
//  
  //2차원 배열의 초기화
//  int[][] ccc = new int[][] { new int[] {10, 20}, new int[] {100, 200, 300}};
//  int[][] ccc = {10, 20}, {100, 200, 300};
  int[][] ccc = {
    {10, 20}, 
    {100, 200, 300, 400, 500},
    {50, 80, 40}
  };
    
  for(int i = 0; i < ccc.length; i++) {
   for(int k = 0; k > ccc[i][k]; k++) {
     System.out.print(ccc[i][k] + "   ");
  }
  System.out.println();
  //확장된 for문(for each문)
  for( int[] t: ccc ) {
   for(int a : t) {
    System.out.print(a+ "   ");
   }
   System.out.println();
  }
  System.out.println();
  
  //2차원 배열의 길이값은 변수로 지정이 가능함
//  Scanner scan = new Scanner(System.in);;
//  System.out.print("층수 입력 : ");
//  
//  int a = scan.nextInt();
//  int[][] ddd = new int[a][];
//  
//  for(int i = 0; i<ddd.length; i++) {
//   System.out.println("호수 입력 : ");
//   int b = scan.nextInt();
//   ddd(i) = new int[b];
//  }
  
  //2차원배열의 길이값은 변수로 지정이 가능함
//  Scanner scan= new Scanner(System.in);
//  
//  System.out.print("층수입력 : ");
//  int a=scan.nextInt();
//  int[][] ddd= new int[a][];
//  
//  for(int i1=0; i1<ddd.length; i1++) {
//   System.out.print("호수입력 : ");
//   int b=scan.nextInt();
//   ddd[i1]= new int[b];
//  }  
//  
//  
//  for( int[] t : ddd) {
//   for(int h : t) {
//    System.out.print(h+"  ");
//   }
//   System.out.println();
//  }
//  System.out.println();
  
  
//  System.out.print("호수 입력 : ");
//  int b = scan.nextInt();
//  ddd[0] = new int[b];
//  
//  System.out.print("호수 입력 : ");
//  b = scan.nextInt();
//  ddd[1] = new int[b];
//  
//  for(int[]t : ddd) {
//   for(int h: t) {
//    System.out.println(h+ "   ");
//   }
//   System.out.println();

  //3차원 배열 .... 4, 5, 6... 같은 방식
  int[][][] abc = new int[2][][];
  
  abc[0] = new int [3][];
  //abc[1] = new int[4][];
  abc[1] = aaa; //다른 배열객체의 주소를 참조할 수 있음.
  abc[1] = new int [4][];
  
  abc[0][0] = new int [5];
  abc[0][1] = new int [3];
  abc[0][2] = new int [2];
  
  abc[1][0] = new int [7];
  abc[1][1] = new int [4];
  abc[1][2] = new int [8];
  abc[1][3] = new int [2];
  
  //한번 만들어진 배열객체의 길이(요소개수)는 변경할 수 없음!!!!

  //유동적 배열 클래스 : ArrayList
  ArrayList<String> arrList = new ArrayList<String>();
  
  arrList.add(new String("Hello"));
  arrList.add(new String("Nice"));
  
  System.out.println("배열 길이 : " + arrList.size());
  System.out.println(arrList.get(0));
  System.out.println(arrList.get(1));
  
  arrList.add("android");
  System.out.println("배열 길이 : " + arrList.size());
  
  //요소 제거
  arrList.remove(1);
  System.out.println("배열 길이 : " + arrList.size());
  for(int i1 = 0; i1 < arrList.size(); i1++) {
   System.out.println(arrList.get(i1));
  }
  
  //for each문
  for(String t : arrList) {
   System.out.println(t);
  }
  
  //ArrayList는 객체만 끌고 다닐 수 있음. 즉, 기본형 변수는 불가!!
  //ArrayList<int> kkk = new ArrayList<int>(); //error
  
  //Wrapper 클래스 : Integer, Double, Byte, Boolean....
  int x=10;//기본형 변수  
  Integer obj= new Integer(x);
  
  Integer obj2= 20;// Auto Boxing: 자동으로 Integer객체로 감싸서 만들어짐.
  
  System.out.println( x );
  System.out.println( obj );
  System.out.println( obj2 );
  
  Integer obj3= new Integer(100);
  int z= obj3;// Auto UnBoxing...
  System.out.println(z); //출력 : 100
  
  ArrayList<Integer> eee= new ArrayList<Integer>();
  eee.add( new Integer(5) );
  eee.add( new Integer(20) );
  eee.add( 30 );//Auto Boxing -> new Integer(30) 
  
  System.out.println( eee.get(0)  );
  System.out.println( eee.get(1)  );
  
  Double obj5 = new Double(3.14);
  System.out.println(obj5);
  
  ArrayList<Double> arrList3 = new ArrayList<Double>();
  arrList3.add(new Double(3.14));
  arrList3.add(5.55);
  
  //별외
  //Wrapper 클래스를 가장 많이 사용하는 경우는...
  //문자열을 기본형으로 변환할 때!!! 가장 빈번히 사용!!
  String s = "50";
  System.out.println(s + 15);
  //문자열 s("50")를 int형으로 변환하기...
  int q = Integer.parseInt(s);
  System.out.println(q + 15);
  
  double w = Double.parseDouble("3.14");
  System.out.println( w + 1.1 );
  }
 }
}
*/

//<쌤공 문제>
//1. Array.txt 1번 ~ 10번

/* 문제 1.
길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
  - 입력된 정수 중에서 최댓값
  - 입력된 정수 중에서 최솟값
  - 입력된 정수의 총합

단, 반드시 입력을 완료한 상태에서 '최댓값'과 '최솟값' 그리고 '총합'을 계산해야 한다. */

/* 작성 코드
import java.util.Scanner;
public class EX_Array2_190723{
 public static void main(String[] args) {
  
  int i;
  int[] num = new int[5];
  int max = 0; //최댓값을 구하는 변수 max
  int min = 0; //최솟값을 구하는 변수 min
  int sum = 0; //총합을 구하는 변수 sum
  
  System.out.println("안녕하세요. 주인님");
  System.out.println("프로그램을 시작하겠습니다.");
  System.out.println("원하시는 정수 데이터를 입력해주세요 : ");
    
  Scanner scan = new Scanner(System.in);
  
  for(i = 0; i < 5; i++) {
  num[i] = scan.nextInt();
  
  sum = sum + num[i];
  }
  
  min = num[0];
  
  for(i =0; i < 5; i++) {
  if(max < num[i]) 
   max = num[i];
  
  if(min > num[i]) 
   min = num[i];
  }
  
  System.out.println("주인님이 입력하신 정수 데이터의 최댓값은 " + max + "입니다.");
  System.out.println("주인님이 입력하신 정수 데이터의 최솟값은 " + min + "입니다.");
  System.out.println("주인님이 입력하신 정수 데이터의 총합은 " + sum + "입니다.");
 
 }
}

------------------------------------------------------------------
결과 화면

안녕하세요. 주인님
프로그램을 시작하겠습니다.
원하시는 정수 데이터를 입력해주세요 : 
1
20
30
40
50
주인님이 입력하신 정수 데이터의 최댓값은 50입니다.
주인님이 입력하신 정수 데이터의 최솟값은 1입니다.
주인님이 입력하신 정수 데이터의 총합은 141입니다.
------------------------------------------------------------------
*/

/* 문제 2.
아래와 같이 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성해보자.

실행결과 예시)

학생의 수를 입력하시오 : 2

학생 1의 성적을 입력하세요 : 20
학생 2의 성적을 입력하세요 : 110
잘못된 성적입니다. 다시 입력하시오.
학생 2의 성적을 입력하세요 : 30

성적 평균은 25.0 입니다. */

/* 작성 코드
import java.util.Scanner;
 public class EX_Array2_190723{
  public static void main(String[] args) {
   
   int[] num = new int[10]; 
   int snum; //학생 수를 넣어줄 변수 snum
   int i; //반복문을 넣어줄 정수형 변수 i
   int sum = 0; //학생들의 성적을 누적시켜줄 변수 sum
   Scanner scan = new Scanner(System.in);
     
   System.out.println("안녕하세요. 주인님");
   System.out.println("프로그램을 시작합니다.");
   System.out.print("학생 수를 입력해주세요 : ");
   snum = scan.nextInt();
   
   for(i = 0; i < snum; i++)
   {
    System.out.print("학생 " + (i+1) + "의 성적을 입력하세요 :");
    num[i] = scan.nextInt();
    
    if(num[i] > 100)
    {
     System.out.println("잘못된 성적입니다. 다시 입력하세요.");
     i--;
     continue;
    }
    sum = sum + num[i];
   }
   System.out.println("성적 평균은" + (sum/2.0) + "입니다.");
 }
}

------------------------------------------------------------------
결과 화면 
 
안녕하세요. 주인님
프로그램을 시작합니다.
학생 수를 입력해주세요 : 2
학생 1의 성적을 입력하세요 :20
학생 2의 성적을 입력하세요 :110
잘못된 성적입니다. 다시 입력하세요.
학생 2의 성적을 입력하세요 :30
성적 평균은25.0입니다.
------------------------------------------------------------------
*/

/* 문제 3.
입력값들의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램을 작성하시오.
이 프로그램은 1부터 100이하의 정수 10개를 읽어야 하고, 1-10,11-20 등의 범위에 드는
값들의 횟수를 아래와 같이 출력하여야 한다.

  1 - 10 : ****
 11 - 20 : **
 21 - 30 : *
 31 - 40 : **
 ..........
 ..........
*/

/* 작성 코드
import java.util.Scanner;
 public class EX_Array2_190723{
  public static void main(String[] args) {
   
   int[] count = new int[10]; 
   
   int[] num = new int[10];
      
   int i = 0;
   
   System.out.println("안녕하세요, 주인님");
   System.out.println("저는 주인님이 입력하신 1 ~ 100 이하의 정수 10개를 가지고" + "\n" + "10단위로 값을 끊어서 해당하는 범위에 속하는 입력값들을 별표시로 카운트하는 프로그램입니다.");
   System.out.println()
   ;
   Scanner scan = new Scanner(System.in);
         
   for(i = 0 ; i < 10 ; i++)
   {
    System.out.print("원하시는 데이터를 입력하세요 : ");
    num[i] = scan.nextInt();
    System.out.println("입력하신 값은 " + num[i] + "입니다.");
    System.out.println();
    
    if(num[i] > 0 && num[i] < 11)  count[0]++;
    if(num[i] > 10 && num[i] < 21) count[1]++;
    if(num[i] > 20 && num[i] < 31) count[2]++;
    if(num[i] > 30 && num[i] < 41) count[3]++;
    if(num[i] > 40 && num[i] < 51) count[4]++;
    if(num[i] > 50 && num[i] < 61) count[5]++;
    if(num[i] > 60 && num[i] < 71) count[6]++;
    if(num[i] > 70 && num[i] < 81) count[7]++;
    if(num[i] > 80 && num[i] < 91) count[8]++;
    if(num[i] > 90 && num[i] < 101) count[9]++;
   }

   System.out.println();
   System.out.println("-----히스토그램-----");
   System.out.println();
   
   System.out.print("1-10 : ");
   star(count[0]);
   
   System.out.print("11-20 : ");
   star(count[1]);
   
   System.out.print("21-30 : ");
   star(count[2]);   
   
   System.out.print("31-40 : ");
   star(count[3]);
   
   System.out.print("41-50 : ");
   star(count[4]);
   
   System.out.print("51-60 : "); 
   star(count[5]);
   
   System.out.print("61-70 : ");
   star(count[6]);
   
   System.out.print("71-80 : ");
   star(count[7]);
   
   System.out.print("81-90 : ");
   star(count[8]);
   
   System.out.print("91-100 : ");
   star(count[9]);
   
   System.out.println();
   System.out.println("-----------------");
   System.out.println("출력이 종료됐습니다.");
   System.out.println("프로그램을 종료합니다.");
   System.out.println("-----------------");
   System.out.println();
  }
  
  
  
public static void star(int c) {

  // *을 찍고 다음줄로 내림 

  for(int i = 0; i < c ; i++){

   System.out.print("* ");

  }
  System.out.println();  
 }
}

안녕하세요, 주인님
저는 주인님이 입력하신 1 ~ 100 이하의 정수 10개를 가지고
10단위로 값을 끊어서 해당하는 범위에 속하는 입력값들을 별표시로 카운트하는 프로그램입니다.

원하시는 데이터를 입력하세요 : 1
입력하신 값은 1입니다.

원하시는 데이터를 입력하세요 : 2
입력하신 값은 2입니다.

원하시는 데이터를 입력하세요 : 3
입력하신 값은 3입니다.

원하시는 데이터를 입력하세요 : 4
입력하신 값은 4입니다.

원하시는 데이터를 입력하세요 : 11
입력하신 값은 11입니다.

원하시는 데이터를 입력하세요 : 12
입력하신 값은 12입니다.

원하시는 데이터를 입력하세요 : 21
입력하신 값은 21입니다.

원하시는 데이터를 입력하세요 : 31
입력하신 값은 31입니다.

원하시는 데이터를 입력하세요 : 32
입력하신 값은 32입니다.

원하시는 데이터를 입력하세요 : 1000
입력하신 값은 1000입니다.


-----히스토그램-----

1-10 : * * * * 
11-20 : * * 
21-30 : * 
31-40 : * * 
41-50 : 
51-60 : 
61-70 : 
71-80 : 
81-90 : 
91-100 : 

-----------------
출력이 종료됐습니다.
프로그램을 종료합니다.
-----------------

------------------------------------------------------------------
*/


/* 문제 4.
배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자. 아주 작은 극장이라서 좌석이
10개밖에 안 된다. 사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 
즉, 예약이 끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.

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

/* 작성 코드
import java.util.Scanner;
 public class EX_Array2_190723{
  public static void main(String[] args) {
   
   int num;
   int num2;
   int num3;
   int sum = 0;
   int cnt = 0;
   int[] seat = new int[] {0,0,0,0,0,0,1,1,1,0,1};
   
   System.out.println("안녕하세요. 주인님");
   System.out.println("저는 극장 예약 시스템입니다.");
   System.out.println("그럼~ 프로그램을 시작하겠습니다.");
   
   while(true) {
    
    if(cnt == 6)
    {
     break;
    }
        
   System.out.println("좌석을 예약하시겠습니까?");
   System.out.print("1는(예약) 또는 0을(아니오) 눌러주세요 : ");
   
   Scanner scan = new Scanner(System.in);
   num = scan.nextInt();
   
   System.out.println();
      
   if(num == 1)
   {
    System.out.println("현재의 예약 상태는 다음과 같습니다.");
    System.out.println("-----------------------------");
    
    System.out.print("좌석 번호 : " );
    for(int i = 1; i <= 10; i++) {
     System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("-----------------------------");
    System.out.print("예약 상태 : ");
    for(int j = 1; j < seat.length; j++) {
     System.out.print(seat[j] + " ");
    }
     
    System.out.println();
    
    for(int k = 1; k < seat.length-1; k++)
    {
     if(cnt == 6) break;
       
    
     System.out.print("몇 번째 좌석을 예약하시겠습니까? ");
     System.out.println();
     num2 = scan.nextInt();
     
     
     if(seat[num2] == 1)
     {
      System.out.println("죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
      
      System.out.println("현재의 예약 상태는 다음과 같습니다.");
      System.out.println("-----------------------------");
      
      System.out.print("좌석 번호 : " );
      for(int i = 1; i <= 10; i++) {
       System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("-----------------------------");
      System.out.print("예약 상태 : ");
      for(int j = 1; j < seat.length; j++) {
       System.out.print(seat[j] + " ");
      }
       
      System.out.println();
      
      continue;
     }
     if(seat[num2] == 0)
     {
      System.out.println(num2 + "번 좌석 예약되었습니다.");
      System.out.println();
      seat[num2] = 1;
      cnt++;
           
      System.out.println("현재의 예약 상태는 다음과 같습니다.");
      System.out.println("-----------------------------");
      
      System.out.print("좌석 번호 : " );
      for(int i = 1; i <= 10; i++) {
       System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("-----------------------------");
      System.out.print("예약 상태 : ");
      for(int j = 1; j < seat.length; j++) {
       System.out.print(seat[j] + " ");
      }
      System.out.println();
      System.out.println();
      
       if(cnt == 6)
       {
        break;
       }
           
      System.out.println();
      continue;
     }
    }   
   }
   
   else if(num == 0)
   {
    System.out.println("예약을 종료합니다.");
    break;
   }
   else if(num > 1 || num < 0)
   {
    System.out.println("잘못된 값을 눌렀습니다.");
   }
  System.out.println("프로그램이 종료됐습니다.");
  }
 } 
} 

------------------------------------------------------------------
결과 화면

안녕하세요. 주인님
저는 극장 예약 시스템입니다.
그럼~ 프로그램을 시작하겠습니다.
좌석을 예약하시겠습니까?
1는(예약) 또는 0을(아니오) 눌러주세요 : 1

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 0 0 0 0 0 1 1 1 0 1 
몇 번째 좌석을 예약하시겠습니까? 
1
1번 좌석 예약되었습니다.

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 1 0 0 0 0 1 1 1 0 1 


몇 번째 좌석을 예약하시겠습니까? 
2
2번 좌석 예약되었습니다.

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 1 1 0 0 0 1 1 1 0 1 


몇 번째 좌석을 예약하시겠습니까? 
3
3번 좌석 예약되었습니다.

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 1 1 1 0 0 1 1 1 0 1 


몇 번째 좌석을 예약하시겠습니까? 
4
4번 좌석 예약되었습니다.

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 1 1 1 1 0 1 1 1 0 1 


몇 번째 좌석을 예약하시겠습니까? 
5
5번 좌석 예약되었습니다.

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 1 1 1 1 1 1 1 1 0 1 


몇 번째 좌석을 예약하시겠습니까? 
9
9번 좌석 예약되었습니다.

현재의 예약 상태는 다음과 같습니다.
-----------------------------
좌석 번호 : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
예약 상태 : 1 1 1 1 1 1 1 1 1 1 

프로그램이 종료됐습니다.
------------------------------------------------------------------
*/

/*
import java.util.Scanner;

public class EX_Array2_190723{
 public static void main(String[] args) {
  final int size = 10;
  int[] seats = new int[size];
  
  while(true) {
   System.out.println("-------------------");
   for(int i = 0; i < size; i++)
    System.out.print(i + 1 + " ");
   System.out.println("\n-----------------");
   for(int i = 0; i < size; i++)
    System.out.print(seats[i] + " ");
   System.out.println("\n-----------------");
   
   System.out.println("원하시는 좌석 번호를 입력하세요.(종료는 -1): ");
   Scanner scan = new Scanner(System.in);
   int s = scan.nextInt();
   if(s == -1)
    break;
   if(seats[s-1] == 0) {
    seats[s-1] = 1;
    System.out.println("예약되었습니다.");
   }
   else {
    System.out.println("이미 예약된 자리입니다.");
   }
  }
 }
}
*/


/* 문제 5.
첫번째 배열 arr1은 {10, 20, 30, 40, 50}의 정수형 요소값을 가지고 있다.
두번째 배열 arr2은 {1, 2, 3, 4, 5}의 정수형 요소값을 가지고 있다.
세번째 배열 arr3의 요소값은 arr1의 요소와 arr2의 요소값을 차례로 덧셈한
결과를 저장하도록 프로그래밍 해보자. 단 arr2의 요소는 역순으로 더해지도록 하자.
즉, arr1의 0번 요소와 arr2의 4번 요소를 더해서 arr3의 0번 요소에 대입하도록 해야한다.
arr3의 1번 요소에는 arr1의 1번 요소와 arr2의 3번 요소가 더해져야 한다는 것이다.

이렇게 arr3의 요소값을 모두 대입하고 그 값을 차례대로 출력해보자. */

/* 작성 코드
public class EX_Array2_190723{
 public static void main(String[] args) {
  
  int[] arr1 = new int[] {10, 20, 30, 40, 50};
  int[] arr2 = new int[] {1, 2, 3, 4, 5};
  int[] arr3 = new int[5] ;
  
  arr3[0] = arr1[0] + arr2[4];
  arr3[1] = arr1[1] + arr2[3];
  arr3[2] = arr1[2] + arr2[2];
  arr3[3] = arr1[3] + arr2[1];
  arr3[4] = arr1[4] + arr2[0];

  System.out.println("arr3[0]값은 : " + arr3[0]);
  System.out.println("arr3[1]값은 : " + arr3[1]);
  System.out.println("arr3[2]값은 : " + arr3[2]);
  System.out.println("arr3[3]값은 : " + arr3[3]);
  System.out.println("arr3[4]값은 : " + arr3[4]);
 }
}

------------------------------------------------------------------
결과 화면

arr3[0]값은 : 15
arr3[1]값은 : 24
arr3[2]값은 : 33
arr3[3]값은 : 42
arr3[4]값은 : 51
------------------------------------------------------------------
*/

/* 문제 6.
길이가 25인 정수형 배열을 만들어라. 그리고 이 배열의 각 요소에 1부터 25까지 25개의 정수값이
Random하게 저장되도록 프로그래밍 하시오. 단, 배열안에 저장된 Random값은 중복된 숫자가
있으면 안된다. 값들이 제대로 대입되어 있는지 알아보기 위해 1줄에 5개씩 5줄로 각 배열의 요소를
인덱스 순서대로 출력해보자. */

/* 작성 코드
import java.util.Random;

public class Main{
 public static void main(String[] args) {
  int[] arr1 = new int[26];
  Random random = new Random();
  int i;
  int j;
  int b;
  
  for(i = 0; i < 25; i++) 
  {
   arr1[i] = random.nextInt(25)+1;
   
   for(j = 0; j < i ; j++)
   {
    if(arr1[i] == arr1[j])
    {
     i--;
    }
   }
  }
  for(b = 0; b < 25; b++)
  {
   if(b % 5 == 0)
   {
    System.out.println();
   }
   System.out.printf("%02d ", arr1[b]);
  }
 }
}

------------------------------------------------------------------
결과 화면

03 12 05 08 02 
19 14 25 24 22 
07 13 10 06 18 
17 09 20 01 11 
04 23 15 21 16
------------------------------------------------------------------
*/

/* 문제 7.
위의 6번 문제를 가로 5, 세로 5인 2차원 배열로 만들어 보자.
*/

/* 작성 코드
import java.util.Random;

public class Main{
 public static void main(String[] args) {
  
  Random rnd = new Random();
  
  //2차원 배열 객체 생성
  int[][] arr = new int[5][5];
  
  int y, x; //y는 2차원 배열의 앞의 층번호, x는 뒤의 호실 번호
  
  //6번 문제처럼 0 ~ 24의 인덱스 번호 반복
  for(int i = 0; i < 25; i++) {
   
   int n = rnd.nextInt(25) + 1; //1~25의 Random값 생성
   
   //1차원 배열의 인덱스 번호 0~24로 된 i값을
   //2차원 배열의 인덱스 번호로 변환
   //ex) 0->0,0  1-> 0,1  2-> 0,2 ...... 5->1,0
   
   y = i / 5; //층 번호(2차원 배열의 앞 인덱스)
   x = i % 5; //호실 번호(2차원 배열의 뒤 인덱스)
   
   arr[y][x] = n; //변환된 인덱스 번호를 이용해서 값 저장
   
   //i번 인덱스의 배열 요소에 대입된 랜덤값이
   //배열의 0번 부터 현재 i번째 이전의 값들 중 같은 값이 있는지
   
   for(int k = 0; k < i; k++) {
    //위와 같은 방식으로 k를 2차원 배열 인덱스로 변환
    y = k / 5;
    x = k % 5;
    
    //6번 문제와 같은 방식으로 중복값 비교 처리
    if(n == arr[y][x]) {
     i--;
     break;
    }
   }//제어 변수 k로 제어되는 반복문
  }//제어변수 i로 제어되는 반복문
  
  //6번 문제처럼 2차원 배열의 값을 중첩 반복문으로 출력
  for(int i = 0; i < 5; i++) {
   for(int j = 0; j < 5; j++) {
    System.out.printf("%4d", arr[i][j]);
   }
   System.out.println();
  }
 }
}

------------------------------------------------------------------
결과 화면

22  19  12  25  20
 6  23  13  17  11
 4   5  14   7   2
18   3   9   1  24
10  21  15   8  16
------------------------------------------------------------------
*/


/* 문제 8.
사용자로부터 정수형 숫자 하나를 입력받자. 이 입력된 숫자 만큼의 String 배열을 만들어보자.
배열을 만들었다면 사용자로부터 배열의 길이 만큼 문자열을 입력받아 저장하도록 프로그래밍 해보자.
입력된 문자열들이 잘 저장되어 있는지 확인하기 위해 배열의 각 요소들을 차례로 출력해보자.
단, 출력은 for each 문을 이용해보자. */

/* 작성 코드
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  int i;
  
  System.out.print("String 배열 길이 입력 : ");
  int num = scan.nextInt();
  System.out.println();
  
  //입력된 수(num) 길이의 String형 배열 객체 생성
  String[] arr = new String[num];
    
  for(i = 0; i < arr.length; i++) {
   System.out.print("문자열 입력 : ");
   arr[i] = scan.next();
  }
  scan.close();
  
  //for each문을 이용한 반복문
  System.out.println();
  for(String t: arr) {
   System.out.println("입력한 데이터는 : " + t);   
  }
 }
}

------------------------------------------------------------------
결과 화면

String 배열 길이 입력 : 3

문자열 입력 : hello
문자열 입력 : hi
문자열 입력 : bye

입력한 데이터는 : hello
입력한 데이터는 : hi
입력한 데이터는 : bye
------------------------------------------------------------------
*/

/* 문제 9.
어느 교육원의 Java Programming 성적을 저장하는 프로그램을 만들어보다.
교육원의 Java Programming은 3개 반으로 운영되고 있다. 단, 각 반의 인원수는 서로 다를 수 있다.
프로그램 사용자가 3개반의 성적을 입력하기 전에 해당 반의 인원수를 입력할 수 있도록 하고 그 인원수
만큼 성적을 넣으면 다음 반의 인원수를 입력하는 방식으로 3개반의 모든 성적을 입력해보자.
모든 성적 입력이 끝났으면 그 값들을 출력해보고 각 반의 평균도 같이 계산되도록 해보자. 

실행 예)

[1반] 인원 수 입력 : 3
[1반 1번] : 80
[1반 2번] : 70
[1반 3번] : 60

[2반] 인원 수 입력 : 4
[2반 1번] : 90
[2반 2번] : 80
[2반 3번] : 80
[2반 4번] : 60

[3반] 인원 수 입력 : 5
[3반 1번] : 90
[3반 2번] : 80
[3반 3번] : 70
[3반 4번] : 40
[3반 5번] : 60

--- Java Programming 성적표 ----
[1반]  80  70  60   [평균 : 70.0]            
[2반]  90  80  80  60   [평균 : 77.5]
[3반]  90  80  70  40  60  [평균 : 68.0]
-----------------------
전체평균 :  71.67
최 우수반 [2반]  
*/

/* 작성 코드
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  //3개층을 가진 2차원 배열 객체 생성
  //각 층의 호실수는 아직 미정
  int[][] arr = new int[3][];
  
  int studentNum = 0; //전체 학생수
  
  //2차원 배열 arr의 길이(length : 3)만큼 반복
  for(int i = 0; i < arr.length; i++) {
   //먼저 해당 반의 인원수 입력
   System.out.print("[" + (i + 1) + "반] 인원수 입력 : ");
   int num = s.nextInt();
   //입력된 인원수(num)만큼의 1차원 배열 객체 생성
   //생성된 1차원 배열 객체를 2차원 배열 객체의 3개의 참조 변수에 차례로 대입
   
   arr[i] = new int[num];
   
   //전체 학생수에 학생수 누적
   studentNum = studentNum + num;
   
   //입력된 학생수(num)만큼 점수 입력
   for(int k = 0; k < num; k++) {
    System.out.print("[" + (i + 1) + "반  " + (k + 1) +"번] : ");
    
    arr[i][k] = s.nextInt();
   }
   System.out.println();
  }
  //모든 입력이 끝났으므로 배열값 출력
  System.out.println("---Java Programming 성적표---");
  
  int total = 0; //전체 평균용
  double max = 0; //최우수반 검증요
  int maxBan = 1; //최우수반 번호(기본 1반)
  
  for(int i = 0; i < arr.length; i++) { //3번 반복
   System.out.print("[" + (i + 1) + "반]"); //출력 형태
   
   int sum = 0; //평균 계산을 위한 합계 누적용 변수
   
   for(int k = 0; k < arr[i].length; k++) { //각 반의 학생수만큼 반복
    System.out.print(" " + arr[i][k] + "  ");
    sum = sum + arr[i][k]; //(i + 1)반 학생 점수 누적
    total = total + arr[i][k]; //전체 평균용 총점 누적
   }
   
   //평균 : 총점/학생수
   double aver = (double)sum / (double)arr[i].length;
   System.out.println("[평균 : " + aver + "]");
   
   //최우수반 검증
   if(aver > max) {
    max = aver;
    maxBan = (i + 1);
   }
  }
  
  System.out.println("------------------------------");
  
  //전체 평균 : 전체 학생 총점 / 전체 학생수
  float total_aver = (float)total/studentNum;
  
  // %.2f => 소수점 밑으로 2자리까지 실수값을 출력해라.(반올림됨)
  System.out.printf("전체 평균 : %.2f \n", total_aver);
  System.out.println("최우수반 [" + maxBan + "반" + "]");
 }
}

------------------------------------------------------------------
결과 화면

[1반] 인원수 입력 : 3
[1반  1번] : 80
[1반  2번] : 70
[1반  3번] : 60

[2반] 인원수 입력 : 4
[2반  1번] : 90
[2반  2번] : 80
[2반  3번] : 80
[2반  4번] : 60

[3반] 인원수 입력 : 5
[3반  1번] : 90
[3반  2번] : 80
[3반  3번] : 70
[3반  4번] : 40
[3반  5번] : 60

---Java Programming 성적표---
[1반] 80   70   60  [평균 : 70.0]
[2반] 90   80   80   60  [평균 : 77.5]
[3반] 90   80   70   40   60  [평균 : 68.0]
------------------------------
전체 평균 : 71.67 
최우수반 [2반]

------------------------------------------------------------------
*/

/* 문제 10.
5 * 5크기의 Metrix에 나선형으로 숫자를 출력하는 프로그램을 작성해 보자.
가로가 5, 세로가 5인 matrix에 1부터 25까지의 숫자를 나선형으로 저장하는 프로그램으로
2차원 배열 int buf[][]에 아래의 결과처럼 나오도록 각 배열요소에 값을 저장하는 프로그램
이다.

  01  16  15  14  13
  02  17  24  23  12
  03  18  25  22  11
  04  19  20  21  10
  05  06  07  08  09

배열의 값을 출력하는 함수는 아래와 같다. 
이 함수는 변경하지 못한다.

for(int i =0; i < 5; i++)
{
        for(int j = 0; j < 5; j++)
        {
             System.out.printf("%03d \t", buf[i][j]);
        }
        System.out.println();
   }
}
*/

/* 작성 코드
public class Main{
 public static void main(String[] args) {
  int[][] buf = new int[5][5];
  
  int y = 0, x = 0; //인덱스 번호
  int dy = 1, dx = 0; //y, x 인덱스의 변화값(처음은 아래쪽으로)
  int limit_y = 0, limit_x = 0;
  
  for(int n = 1; n <= 25; n++) {
   buf[y][x] = n;
   
   y = y + dy; //y값 변경
   x = x + dx; //x값 변경
   
   if(dy > 0 && y == 4 - limit_y) { //y값이 증가될 때
    dy = 0;
    dx = 1;
   }
   
   if(dx > 0 && x == 4 - limit_x) { //x값이 증가될 때
    dy = -1;
    dx = 0;
   }
   
   if(dy < 0 && y == limit_y) { //y값이 감소될 때
    dy = 0;
    dx = -1;
    limit_x++;
   }
   
   if(dx < 0 && x == limit_x) { //x값이 감소될 때
    dy = 1;
    dx = 0;
    limit_y++;
   }
  }
  
  for(int i = 0; i < 5; i++) {
   for(int j = 0; j < 5; j++) {
    System.out.printf("%02d \t", buf[i][j]);
   }
   System.out.println();
  }
 }
}

------------------------------------------------------------------
결과 화면

01  16  15  14  13  
02  17  24  23  12  
03  18  25  22  11  
04  19  20  21  10  
05  06  07  08  09  
------------------------------------------------------------------
*/

//2. 자바의 정석 연습문제 배열(C5)
//[연습 문제]

/*
//[5-1]

답) 
d, e

해설) 
d. int[] arr = new int[] {1,2,3,4,5}에서는 대괄호[]안에 배열의 크기를 지정할 수 없다.
괄호 {}안의 데이터의 개수에 따라 자동적으로 결정되기 때문이다.

//[5-2]

/*
int[][] arr = {
  {5, 5, 5, 5, 5},
  {10, 10, 10},
  {20, 20, 20, 20},
  {30, 30}
};

답)
2

해설)
arr[3].length는 arr[3]이 가리키는 배열의 크기를 의미한다. 위의 그림에서 arr[3]이 가리키는
배열은 0x500번지에 있는 배열이며 크기는 2이다. 그래서 arr[3].length의 값은 2가 된다.
참고로 arr.length의 갑은 4이고, arr[0].length의 값은 5, arr[1].length의 값은 3,
arr[2].length의 값은 4이다.

//[5-3]

class Excercise5_3
{
 public static void main(String[] args) {
  int[] arr = {10, 20, 30, 40, 50};
  int sum = 0;
  
  for(int i = 0; i < arr.length; i++) {
   sum += arr[i];
  }
  System.out.println("sum = " + sum);
 }
}

답)
for(int i = 0; i < arr.length; i++) {
 sum = sum + arr[i];
}

해설)
간단한 문제라서 별도의 설명은 생략함.

//[5-4]

class Excercise5_4
{
 public static void main(String[] args) {
  int[][] arr = {
    {5, 5, 5, 5, 5},
    {10,10,10,10,10},
    {20,20,20,20,20},
    {30,30,30,30,30},
  };
  
  int total = 0;
  float average = 0;
  
  for(int i = 0; i < arr.length; i++) {
   for(int j = 0; j < arr[i].length; j++) {
    total = total + arr[i][j];
   }
  }
  
  average = total / (float)(arr.length * arr[0].length);
  System.out.println("total = " + total);
  System.out.println("average = " + average);
 } //end of main
} //end of class

답)
for(int i = 0; i < arr.length; i++) {
 for(int j = 0; j < arr[i].length; j++) {
  total = total + arr[i][j];
 }
}

average = total / (float)(arr.length * arr[0].length)

해설)
이번에도 배열과 반복문을 이용하는 문제인데, 2차원 배열이라 2중 for문을 사용해야 한다는 것을 제외하고는
이전 문제와 다르지 않다.

평균을 구할 때는 배열의 모든 요소의 총합을 개수로 나누면 되는데, int로 나누면 int 나누기 int이기 때문에
결과를 int로 얻으므로 소수점 이하의 값을 얻을 수 없다. 그래서 나누는 값을 float로 형변환 해주었다.
만일 float로 형변환을 해주지 않으면 average는 16.25가 아닌 16.0이 될 것이다.
(average의 타입이 float이므로 16을 저장하면 16.0이 된다.)

1. int형(4byte)보다 크기가 작은 자료형은 int형으로 형변환 후에 연산을 수행한다.
byte/short -> int / int -> int

2. 두 개의 피연산자 중 자료형의 표현범위가 큰 쪽에 맞춰서 형변환 된 후 연산을 수행한다.
int / float -> float / float -> float

3. 정수형 간의 나눗셈에서 0으로 나누는 것은 금지되어 있다.

//[5-5]

class Excercise5_5
 public static void main(String[] args) {
  int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  int[] ball3 = new int[3];
  
  //배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
  for(int i = 0; i < ballArr.length; i++) {
   int j = (int)(Math.random() * ballArr.length);
   int tmp = 0;
   
   tmp = ballArr[i];
   ballArr[i] = ballArr[j];
   ballArr[j] = tmp;
  }
  
  //배열 ballArr의 앞에서 3개의 수를 배열  ball3로 복사한다.
  System.out.println(ballArr, 0, ball3, 0, 3);
  
  for(int i = 0; i < ball3.length; i++) {
   System.out.println(ball3[i]);
  }
  System.out.println();
 } //end of main
} //end of class

답)

(1)
tmp = ballArr[i];
ballArr[i] = ballArr[j];
ballArr[j] = tmp;

(2)
system.arraycopy(ballArr,0, ball3,0,3);

해설)
1~9의 숫자를 배열에 순서대로 담고, 반복해서 위치를 서로 바꿈으로써 숫자를 섞는다.
그 다음에 배열의 세 요소를 차례대로 가져오면 중복되지 않은 세 개의 정수를 얻을 수 있다.
그 다음엔 배열 ballArr에서 세 개의 값을 배열 ball3으로 복사한다. 편의상
맨 앞의 세 값을 ball3로 복사하기로 하자.

//[5-6]

class Excercise5_6{
 public static void main(String[] args) {
  //큰 금액의 동전을 우선적으로 거슬러줘야 한다.
  int[] coinUnit = {500, 100, 50, 10};
  
  int money = 2680;
  System.out.println("money = " + money);
  
  for(int i = 0; i < coinUnit.length; i++){
   System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
   money = money % coinUnit[i];
  }
 } //main
}

답)
System.out.println(coinUnit[i] + "원: " + money/coinUnit[i]);
money = money % coinUnit[i];

해설)
동전의 단위를 내림차순으로 배열에 초기화한다. 금액이 큰 동전을 우선적으로 지불해야 가장
적은 동전의 개수로 거스름돈을 줄 수 있기 때문이다. 그렇지 않으면, 모든 거스름돈을
10원짜리로만 주게 될 수도 있다.

변수 money를 coinUnit[i]로 나누면 지불할 동전의 개수가 되고, 나머지 연산을 하면
coinUnit[i]로 지불하고 남은 금액이 된다. 동전단위(coinUnit배열)의 개수만큼
이 과정을 반복하면 된다.

//[5-7]

class Excercise 5_7
{
 public static void main(String[] args) 
 {
  if(args.length! = 1) {
   System.out.println("USAGE: java Excercise5_7 3120");
   System.exit(0);
  }
  
  //문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
  int money = Integer.parseInt(args[0]);
  
  System.out.println("money = " + money);
  
  int[] coinUnit = {500, 100, 50, 10}; //동전의 단위
  int[] coin = {5, 5, 5, 5}; //단위별 동전의 개수
  
  for(int i = 0; i < coinUnit.length; i++) {
   int coinNum = 0;
   
   //1. 금액(money)을 동전 단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
   coinNum = money / coinUnit[i];
   
   //2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
   //(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
   if(coin[i] >= coinNum) {
    coin[i] -= coinNum;
   }else {
    coinNum = coin[i];
    coin[i] = 0;
   }
   
   //3. 금액에서 동전의 개수(coinNum)와 동전 단위를 곱한 값을 뺀다.
   money -= coinNum * coinUnit[i];
   
   System.out.println(coinUnit[i] + "원: " + coinNum);
  }
  
  if(money > 0) {
   System.out.println("거스름돈이 부족합니다.");
   System.exit(0); //프로그램을 종료한다.
  }
  
  System.out.println("=남은 동전의 개수 =");
  
  for(int i = 0; i < coinUnit.length; i++) {
   System.out.println(coinUnit[i] + "원:" + coin[i]);
  }
 } //main
}

답)
//1. 금액(money)을 동전 단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
coinNum = money/coinUnit[i];

//2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
if(coin[i] >= coinNum) {
 coin[i] -= coinNum;
}else {
 coinNum = coin[i];
 coin[i] = 0;
}

//3. 금액에서 동전의 개수(coinNum)와 동전 단위를 곱한 값을 뺀다.
money -= coinNum * coinUnit[i];

해설)
주어진 로직대로만 작성하여 별 어려움 없이 풀 수 있었을 것이라 생각한다. 문제 5~6을 이해했다면
이 문제도 쉽게 이해될 것이므로 자세한 설명은 생략한다.
이 예제를 발전시켜 자판기 프로그램을 작성해보면 좋은 공부가 될 것이다.

//[5-8]

class Excercise5_8{
 public static void main(String[] args) {
  int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
  int[] counter = new int[4];
  
  for(int i = 0; i < answer.length; i++) {
   counter[answer[i]-1]++;
  }
  
  for(int i = 0; i < counter.length; i++) {
   System.out.println(counter[i]);
  
  
   for(int j = 0; j < counter[i]; j++) {
    System.out.println("*"); //counter[i]의 값 만큼 '*'을 찍는다.
   }
   System.out.println();
  }
 } // end of main
} // end of class

답)

(1) 
counter[answer[i]-1]++;

(2) 
System.out.print(counter[i]);

for(int j = 0; j < counter[i]; j++) {
 System.out.print("*");
}

해설)
배열을 이용해서 데이터의 개수를 세는 문제이다. 1~4 범위의 데이터를 집계할 것이기 때문에 크기가
4인 배열(counter)을 생성하였다. 크기가 4이지만 배열의 index는 0~3이기 때문에 answer[i]에서
1을 빼주어야 한다.

counter[answer[i]-1]++;

//[5-9]

class Excercise5_9{
 public static void main(String[] args) {
  char[][] star = {
    {'*', '*', ' ', ' ', ' '};
    {'*', '*', ' ', ' ', ' '};
    {'*', '*', '*', '*', '*'};
    {'*', '*', '*', '*', '*'};
  };
  
  char[][] result = new char[star[0].length][star.length];
  
  for(int i = 0; i < star.length; i++) {
   for(int j = 0; j < star[i].length; j++){
    System.out.println(star[i][j]);
   }
   System.out.println();
  }
  
  System.out.println();
 }
 
 System.out.println();
 
 for(int i = 0; i < star.length; i++) {
  for(int j = 0; j < star[i].length; j++) {
   int x = j;
   int y = star.length-1-i;
   
   result[x][y] = star[i][j];
  }
 }
 
 for(int i = 0; i < result.length; i++) {
  for(int j = 0; j < result[i].length; j++) {
   System.out.print(result[i][j]);
   }
   System.out.println();
  }
 } //end of main
} //end of class

답)
int x = j;
int y = star.length-1-i;

result[x][y] = star[i][j];

해설)
테트리스의 도형을 회전시키듯이 배열을 회전시키는 문제이다. 배열 star가 4 x 5의 2차원 배열이므로
이 배열을 90도 회전시키면 5 x 4의 2차원 배열이 되어야 한다.

char[][] result = new char[star[0].length][star.length];
//[5-10]

class Exercise5_10{
 public static void main(String[] args) {
  char[] abcCode = 
   {'`','~','!','@','#','$','%','^','&','*',
   '(',')','-','_','+','=','|','[',']','{','}',
   ';',':',';',':',',','.','/'};
  
  char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
  
  String src = "abc123";
  String result = "";
  
  //문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
  for(int i = 0; i < src.length(); i++) {
	  char ch = src.charAt(i);
	  
	  if('a' <= ch && ch <= 'z') {
		  result = result + abcCode[ch-'a'];
	  }else if('0' <= ch && ch <= '9') {
		  result = result + numCode[ch-'0'];
	  }
  }
  System.out.println("src : " + src);
  System.out.println("result : " + result);
 }//end of main
}//end of class

답)
if('a' <= ch && ch <= 'z') {
	  result = result + abcCode[ch-'a'];
}else if('0' <= ch && ch <= '9') {
	  result = result + numCode[ch-'0'];
}

해설)
문자열을 반복문과 charAt(int i)을 이용해서, 한 문자씩 배열에 있는 암호코드로 변경해서
암호화하는 문제이다.

암호코드는 영어소문자와 숫자로 나뉘어져 있는데, 영어소문자인 경우 배열 abcCode에서 해당 암호코드를 얻고,
숫자인 경우에는 배열 numCode에서 암호 코드를 얻도록 되어 있다.
그래서 조건문으로 문자가 영어소문자인 경우와 숫자인 경우를 나누어서 처리했다.

//[5-11]

class Excercise5_11
{
	public static void main(String[] args) {
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
		};
		
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.println("%4d", result[i][j]);
			}
			System.out.println();
		}
	} //main
}

답)
result[i][j] = score[i][j];
result[i][score[0].length] += result[i][j];
result[score.length][j] += result[i][j];
result[score.length][score[0].length] += result[i][j];

해설)
2차원 배열의 복사를 조금 응요한 문제이다. 

//[5-12]

import java.util.*;

class Excercise5_12{
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"}; //words[0][0], words[0][1]
				{"computer", "컴퓨터"}; 
		}
	}
답)

해설)

//[5-13]

답)

해설)
*/

//3. 입사 테스트 문제 자바로 풀기
//주민등록증 번호, 카드 번호 로직 만들기

/*
import java.util.Scanner;

public class EX_Array2_190723{
 public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  
  String data;
  
  while(true) {
   System.out.print("입력값 : ");
   data = scan.nextLine();
   
   //입력된 글자의 길이를 얻어오기
   int len = data.length();
   
   System.out.println("입력값은 : " + len);
   
   int sum = 0; //각 자리수의 덧셈 누적 값 저장용 변수 sum
   
   if(len < 13)
   {
    System.out.println("잘못 입력했습니다.");
    System.out.println();
    continue;
   }
   
   if(len < 15) {
    
    //주민번호 판별 로직
    int k = 2;
    
    for(int i = 0; i < len - 1; i++) { //마지막 자리는 연산에서 제외
     char ch = data.charAt(i);
     if(ch >= '0' && ch <= '9') {
      sum = sum + ((ch - 48) * k);
      k++; // k = k + 1;
      if(k > 9) k = 2;
     }
    }
    
    int M = (11 - (sum % 11)) % 10; //오류 검증 코드 
    
    int m = data.charAt(len - 1) - 48; //마지막 자리수의 문자값을 정수값으로 전환
    if(M == m) {
     System.out.println("주민 번호가 맞습니다.");
     System.out.println();
    }
    else {
     System.out.println("개인 정보가 아닙니다.");
     System.out.println("다시 입력하세요.");
     System.out.println();
    }
   }
   
   else {
    
    //카드번호 판별 로직
    
    int count = 0; //data 안에 있는 숫자의 개수를 카운팅하기 위한 변수
    for(int i = 0; i < len; i++) {
     char ch = data.charAt(i);
     if(ch >= '0' && ch <= '9') count++;
    }
    
    //data 안의 숫자의 개수가 16개면 카드 번호가 맞는 것으로 인식
    if(count == 16) {
     System.out.println("카드 번호가 맞습니다.");
     System.out.println();
     break;
    }
    
    else {
     System.out.println("개인 정보가 아닙니다.");
     System.out.println("다시 입력하세요.");
     System.out.println();
    }
   }
  }
 }
}
*/