//190723(ȭ) �ڹ� ���� 5���� 2���� �迭

/*
import java.util.ArrayList;
import java.util.Scanner;

public class EX_Array2_190723 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  int[] arr = new int[3];
  
  //2���� �迭 
  int[][] aaa = new int[2][3];
  
  //�迭 ��ҿ� �� ����
  aaa[0][0] = 10;
  aaa[0][1] = 20;
  aaa[0][2] = 30;
  
  aaa[1][0] = 100;
  aaa[1][1] = 200;
  aaa[1][2] = 300;
  
  //�迭 ��Ұ� ���
  
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
  
  //�迭�� ���̰� �˾ƺ���
  System.out.println("�迭�� ���̴� : " + aaa.length);
  System.out.println(aaa[0].length);
  System.out.println(aaa[1].length);
  System.out.println();
  
  //�ݺ��� �̿� �迭��Ұ� ���
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
  
  //�� ������ �ٸ� ������ 2���� �迭 �����
//  int[][] bbb = new int[3][];
  
  //�� ���� �����ϴ� 1���� �迭 ��ü �����Ͽ� ����
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
  //2���� �迭�� �ʱ�ȭ
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
  //Ȯ��� for��(for each��)
  for( int[] t: ccc ) {
   for(int a : t) {
    System.out.print(a+ "   ");
   }
   System.out.println();
  }
  System.out.println();
  
  //2���� �迭�� ���̰��� ������ ������ ������
//  Scanner scan = new Scanner(System.in);;
//  System.out.print("���� �Է� : ");
//  
//  int a = scan.nextInt();
//  int[][] ddd = new int[a][];
//  
//  for(int i = 0; i<ddd.length; i++) {
//   System.out.println("ȣ�� �Է� : ");
//   int b = scan.nextInt();
//   ddd(i) = new int[b];
//  }
  
  //2�����迭�� ���̰��� ������ ������ ������
//  Scanner scan= new Scanner(System.in);
//  
//  System.out.print("�����Է� : ");
//  int a=scan.nextInt();
//  int[][] ddd= new int[a][];
//  
//  for(int i1=0; i1<ddd.length; i1++) {
//   System.out.print("ȣ���Է� : ");
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
  
  
//  System.out.print("ȣ�� �Է� : ");
//  int b = scan.nextInt();
//  ddd[0] = new int[b];
//  
//  System.out.print("ȣ�� �Է� : ");
//  b = scan.nextInt();
//  ddd[1] = new int[b];
//  
//  for(int[]t : ddd) {
//   for(int h: t) {
//    System.out.println(h+ "   ");
//   }
//   System.out.println();

  //3���� �迭 .... 4, 5, 6... ���� ���
  int[][][] abc = new int[2][][];
  
  abc[0] = new int [3][];
  //abc[1] = new int[4][];
  abc[1] = aaa; //�ٸ� �迭��ü�� �ּҸ� ������ �� ����.
  abc[1] = new int [4][];
  
  abc[0][0] = new int [5];
  abc[0][1] = new int [3];
  abc[0][2] = new int [2];
  
  abc[1][0] = new int [7];
  abc[1][1] = new int [4];
  abc[1][2] = new int [8];
  abc[1][3] = new int [2];
  
  //�ѹ� ������� �迭��ü�� ����(��Ұ���)�� ������ �� ����!!!!

  //������ �迭 Ŭ���� : ArrayList
  ArrayList<String> arrList = new ArrayList<String>();
  
  arrList.add(new String("Hello"));
  arrList.add(new String("Nice"));
  
  System.out.println("�迭 ���� : " + arrList.size());
  System.out.println(arrList.get(0));
  System.out.println(arrList.get(1));
  
  arrList.add("android");
  System.out.println("�迭 ���� : " + arrList.size());
  
  //��� ����
  arrList.remove(1);
  System.out.println("�迭 ���� : " + arrList.size());
  for(int i1 = 0; i1 < arrList.size(); i1++) {
   System.out.println(arrList.get(i1));
  }
  
  //for each��
  for(String t : arrList) {
   System.out.println(t);
  }
  
  //ArrayList�� ��ü�� ���� �ٴ� �� ����. ��, �⺻�� ������ �Ұ�!!
  //ArrayList<int> kkk = new ArrayList<int>(); //error
  
  //Wrapper Ŭ���� : Integer, Double, Byte, Boolean....
  int x=10;//�⺻�� ����  
  Integer obj= new Integer(x);
  
  Integer obj2= 20;// Auto Boxing: �ڵ����� Integer��ü�� ���μ� �������.
  
  System.out.println( x );
  System.out.println( obj );
  System.out.println( obj2 );
  
  Integer obj3= new Integer(100);
  int z= obj3;// Auto UnBoxing...
  System.out.println(z); //��� : 100
  
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
  
  //����
  //Wrapper Ŭ������ ���� ���� ����ϴ� ����...
  //���ڿ��� �⺻������ ��ȯ�� ��!!! ���� ����� ���!!
  String s = "50";
  System.out.println(s + 15);
  //���ڿ� s("50")�� int������ ��ȯ�ϱ�...
  int q = Integer.parseInt(s);
  System.out.println(q + 15);
  
  double w = Double.parseDouble("3.14");
  System.out.println( w + 1.1 );
  }
 }
}
*/

//<�ܰ� ����>
//1. Array.txt 1�� ~ 10��

/* ���� 1.
���̰� 5�� int�� �迭�� �����ؼ� ���α׷� ����ڷκ��� �� 5���� ������ �Է� ����.
�׸��� �Է��� ������ ������ ������ ����ϵ��� ������ �ۼ��غ���.
  - �Էµ� ���� �߿��� �ִ�
  - �Էµ� ���� �߿��� �ּڰ�
  - �Էµ� ������ ����

��, �ݵ�� �Է��� �Ϸ��� ���¿��� '�ִ�'�� '�ּڰ�' �׸��� '����'�� ����ؾ� �Ѵ�. */

/* �ۼ� �ڵ�
import java.util.Scanner;
public class EX_Array2_190723{
 public static void main(String[] args) {
  
  int i;
  int[] num = new int[5];
  int max = 0; //�ִ��� ���ϴ� ���� max
  int min = 0; //�ּڰ��� ���ϴ� ���� min
  int sum = 0; //������ ���ϴ� ���� sum
  
  System.out.println("�ȳ��ϼ���. ���δ�");
  System.out.println("���α׷��� �����ϰڽ��ϴ�.");
  System.out.println("���Ͻô� ���� �����͸� �Է����ּ��� : ");
    
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
  
  System.out.println("���δ��� �Է��Ͻ� ���� �������� �ִ��� " + max + "�Դϴ�.");
  System.out.println("���δ��� �Է��Ͻ� ���� �������� �ּڰ��� " + min + "�Դϴ�.");
  System.out.println("���δ��� �Է��Ͻ� ���� �������� ������ " + sum + "�Դϴ�.");
 
 }
}

------------------------------------------------------------------
��� ȭ��

�ȳ��ϼ���. ���δ�
���α׷��� �����ϰڽ��ϴ�.
���Ͻô� ���� �����͸� �Է����ּ��� : 
1
20
30
40
50
���δ��� �Է��Ͻ� ���� �������� �ִ��� 50�Դϴ�.
���δ��� �Է��Ͻ� ���� �������� �ּڰ��� 1�Դϴ�.
���δ��� �Է��Ͻ� ���� �������� ������ 141�Դϴ�.
------------------------------------------------------------------
*/

/* ���� 2.
�Ʒ��� ���� �л����� ������ �޾Ƽ� ����� ���ϴ� ���α׷��� �ۼ��غ���.

������ ����)

�л��� ���� �Է��Ͻÿ� : 2

�л� 1�� ������ �Է��ϼ��� : 20
�л� 2�� ������ �Է��ϼ��� : 110
�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.
�л� 2�� ������ �Է��ϼ��� : 30

���� ����� 25.0 �Դϴ�. */

/* �ۼ� �ڵ�
import java.util.Scanner;
 public class EX_Array2_190723{
  public static void main(String[] args) {
   
   int[] num = new int[10]; 
   int snum; //�л� ���� �־��� ���� snum
   int i; //�ݺ����� �־��� ������ ���� i
   int sum = 0; //�л����� ������ ���������� ���� sum
   Scanner scan = new Scanner(System.in);
     
   System.out.println("�ȳ��ϼ���. ���δ�");
   System.out.println("���α׷��� �����մϴ�.");
   System.out.print("�л� ���� �Է����ּ��� : ");
   snum = scan.nextInt();
   
   for(i = 0; i < snum; i++)
   {
    System.out.print("�л� " + (i+1) + "�� ������ �Է��ϼ��� :");
    num[i] = scan.nextInt();
    
    if(num[i] > 100)
    {
     System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
     i--;
     continue;
    }
    sum = sum + num[i];
   }
   System.out.println("���� �����" + (sum/2.0) + "�Դϴ�.");
 }
}

------------------------------------------------------------------
��� ȭ�� 
 
�ȳ��ϼ���. ���δ�
���α׷��� �����մϴ�.
�л� ���� �Է����ּ��� : 2
�л� 1�� ������ �Է��ϼ��� :20
�л� 2�� ������ �Է��ϼ��� :110
�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.
�л� 2�� ������ �Է��ϼ��� :30
���� �����25.0�Դϴ�.
------------------------------------------------------------------
*/

/* ���� 3.
�Է°����� ������ �ð������� �� �� �ִ� ������׷��� ����� ���α׷��� �ۼ��Ͻÿ�.
�� ���α׷��� 1���� 100������ ���� 10���� �о�� �ϰ�, 1-10,11-20 ���� ������ ���
������ Ƚ���� �Ʒ��� ���� ����Ͽ��� �Ѵ�.

  1 - 10 : ****
 11 - 20 : **
 21 - 30 : *
 31 - 40 : **
 ..........
 ..........
*/

/* �ۼ� �ڵ�
import java.util.Scanner;
 public class EX_Array2_190723{
  public static void main(String[] args) {
   
   int[] count = new int[10]; 
   
   int[] num = new int[10];
      
   int i = 0;
   
   System.out.println("�ȳ��ϼ���, ���δ�");
   System.out.println("���� ���δ��� �Է��Ͻ� 1 ~ 100 ������ ���� 10���� ������" + "\n" + "10������ ���� ��� �ش��ϴ� ������ ���ϴ� �Է°����� ��ǥ�÷� ī��Ʈ�ϴ� ���α׷��Դϴ�.");
   System.out.println()
   ;
   Scanner scan = new Scanner(System.in);
         
   for(i = 0 ; i < 10 ; i++)
   {
    System.out.print("���Ͻô� �����͸� �Է��ϼ��� : ");
    num[i] = scan.nextInt();
    System.out.println("�Է��Ͻ� ���� " + num[i] + "�Դϴ�.");
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
   System.out.println("-----������׷�-----");
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
   System.out.println("����� ����ƽ��ϴ�.");
   System.out.println("���α׷��� �����մϴ�.");
   System.out.println("-----------------");
   System.out.println();
  }
  
  
  
public static void star(int c) {

  // *�� ��� �����ٷ� ���� 

  for(int i = 0; i < c ; i++){

   System.out.print("* ");

  }
  System.out.println();  
 }
}

�ȳ��ϼ���, ���δ�
���� ���δ��� �Է��Ͻ� 1 ~ 100 ������ ���� 10���� ������
10������ ���� ��� �ش��ϴ� ������ ���ϴ� �Է°����� ��ǥ�÷� ī��Ʈ�ϴ� ���α׷��Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 1
�Է��Ͻ� ���� 1�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 2
�Է��Ͻ� ���� 2�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 3
�Է��Ͻ� ���� 3�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 4
�Է��Ͻ� ���� 4�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 11
�Է��Ͻ� ���� 11�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 12
�Է��Ͻ� ���� 12�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 21
�Է��Ͻ� ���� 21�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 31
�Է��Ͻ� ���� 31�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 32
�Է��Ͻ� ���� 32�Դϴ�.

���Ͻô� �����͸� �Է��ϼ��� : 1000
�Է��Ͻ� ���� 1000�Դϴ�.


-----������׷�-----

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
����� ����ƽ��ϴ�.
���α׷��� �����մϴ�.
-----------------

------------------------------------------------------------------
*/


/* ���� 4.
�迭�� �̿��Ͽ� ������ ���� ���� �ý����� �ۼ��Ͽ� ����. ���� ���� �����̶� �¼���
10���ۿ� �� �ȴ�. ����ڰ� ������ �Ϸ��� �ϸ� ���� �¼� ��ġǥ�� �����ش�. 
��, ������ ���� �¼��� 1��, ������ �ȵ� �¼��� 0���� ��Ÿ����.

 �¼��� �����Ͻðڽ��ϱ�( 1(Y) �Ǵ� 0(N) )?  1

 ������ ���� ���´� ������ �����ϴ�.
 -----------------------
 �¼� ��ȣ :  1  2  3  4  5  6  7  8  9  10
 -----------------------
 ���� ���� :  0  0  0  0  0  1  1  1  0   1

 
 ���° �¼��� �����Ͻðڽ��ϱ�? 6
 �˼��մϴ�. �̹� ����� �¼��Դϴ�. �ٸ� �¼��� ������ �ּ���.
 
 ���° �¼��� �����Ͻðڽ��ϱ�? 1
 1�� �¼� ����Ǿ����ϴ�.

 �¼��� �����Ͻðڽ��ϱ�( 1(Y) �Ǵ� 0(N) )?  0
 ������ �����մϴ�. */ 

/* �ۼ� �ڵ�
import java.util.Scanner;
 public class EX_Array2_190723{
  public static void main(String[] args) {
   
   int num;
   int num2;
   int num3;
   int sum = 0;
   int cnt = 0;
   int[] seat = new int[] {0,0,0,0,0,0,1,1,1,0,1};
   
   System.out.println("�ȳ��ϼ���. ���δ�");
   System.out.println("���� ���� ���� �ý����Դϴ�.");
   System.out.println("�׷�~ ���α׷��� �����ϰڽ��ϴ�.");
   
   while(true) {
    
    if(cnt == 6)
    {
     break;
    }
        
   System.out.println("�¼��� �����Ͻðڽ��ϱ�?");
   System.out.print("1��(����) �Ǵ� 0��(�ƴϿ�) �����ּ��� : ");
   
   Scanner scan = new Scanner(System.in);
   num = scan.nextInt();
   
   System.out.println();
      
   if(num == 1)
   {
    System.out.println("������ ���� ���´� ������ �����ϴ�.");
    System.out.println("-----------------------------");
    
    System.out.print("�¼� ��ȣ : " );
    for(int i = 1; i <= 10; i++) {
     System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("-----------------------------");
    System.out.print("���� ���� : ");
    for(int j = 1; j < seat.length; j++) {
     System.out.print(seat[j] + " ");
    }
     
    System.out.println();
    
    for(int k = 1; k < seat.length-1; k++)
    {
     if(cnt == 6) break;
       
    
     System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�? ");
     System.out.println();
     num2 = scan.nextInt();
     
     
     if(seat[num2] == 1)
     {
      System.out.println("�˼��մϴ�. �̹� ����� �¼��Դϴ�. �ٸ� �¼��� �������ּ���.");
      
      System.out.println("������ ���� ���´� ������ �����ϴ�.");
      System.out.println("-----------------------------");
      
      System.out.print("�¼� ��ȣ : " );
      for(int i = 1; i <= 10; i++) {
       System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("-----------------------------");
      System.out.print("���� ���� : ");
      for(int j = 1; j < seat.length; j++) {
       System.out.print(seat[j] + " ");
      }
       
      System.out.println();
      
      continue;
     }
     if(seat[num2] == 0)
     {
      System.out.println(num2 + "�� �¼� ����Ǿ����ϴ�.");
      System.out.println();
      seat[num2] = 1;
      cnt++;
           
      System.out.println("������ ���� ���´� ������ �����ϴ�.");
      System.out.println("-----------------------------");
      
      System.out.print("�¼� ��ȣ : " );
      for(int i = 1; i <= 10; i++) {
       System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("-----------------------------");
      System.out.print("���� ���� : ");
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
    System.out.println("������ �����մϴ�.");
    break;
   }
   else if(num > 1 || num < 0)
   {
    System.out.println("�߸��� ���� �������ϴ�.");
   }
  System.out.println("���α׷��� ����ƽ��ϴ�.");
  }
 } 
} 

------------------------------------------------------------------
��� ȭ��

�ȳ��ϼ���. ���δ�
���� ���� ���� �ý����Դϴ�.
�׷�~ ���α׷��� �����ϰڽ��ϴ�.
�¼��� �����Ͻðڽ��ϱ�?
1��(����) �Ǵ� 0��(�ƴϿ�) �����ּ��� : 1

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 0 0 0 0 0 1 1 1 0 1 
�� ��° �¼��� �����Ͻðڽ��ϱ�? 
1
1�� �¼� ����Ǿ����ϴ�.

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 1 0 0 0 0 1 1 1 0 1 


�� ��° �¼��� �����Ͻðڽ��ϱ�? 
2
2�� �¼� ����Ǿ����ϴ�.

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 1 1 0 0 0 1 1 1 0 1 


�� ��° �¼��� �����Ͻðڽ��ϱ�? 
3
3�� �¼� ����Ǿ����ϴ�.

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 1 1 1 0 0 1 1 1 0 1 


�� ��° �¼��� �����Ͻðڽ��ϱ�? 
4
4�� �¼� ����Ǿ����ϴ�.

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 1 1 1 1 0 1 1 1 0 1 


�� ��° �¼��� �����Ͻðڽ��ϱ�? 
5
5�� �¼� ����Ǿ����ϴ�.

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 1 1 1 1 1 1 1 1 0 1 


�� ��° �¼��� �����Ͻðڽ��ϱ�? 
9
9�� �¼� ����Ǿ����ϴ�.

������ ���� ���´� ������ �����ϴ�.
-----------------------------
�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10 
-----------------------------
���� ���� : 1 1 1 1 1 1 1 1 1 1 

���α׷��� ����ƽ��ϴ�.
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
   
   System.out.println("���Ͻô� �¼� ��ȣ�� �Է��ϼ���.(����� -1): ");
   Scanner scan = new Scanner(System.in);
   int s = scan.nextInt();
   if(s == -1)
    break;
   if(seats[s-1] == 0) {
    seats[s-1] = 1;
    System.out.println("����Ǿ����ϴ�.");
   }
   else {
    System.out.println("�̹� ����� �ڸ��Դϴ�.");
   }
  }
 }
}
*/


/* ���� 5.
ù��° �迭 arr1�� {10, 20, 30, 40, 50}�� ������ ��Ұ��� ������ �ִ�.
�ι�° �迭 arr2�� {1, 2, 3, 4, 5}�� ������ ��Ұ��� ������ �ִ�.
����° �迭 arr3�� ��Ұ��� arr1�� ��ҿ� arr2�� ��Ұ��� ���ʷ� ������
����� �����ϵ��� ���α׷��� �غ���. �� arr2�� ��Ҵ� �������� ���������� ����.
��, arr1�� 0�� ��ҿ� arr2�� 4�� ��Ҹ� ���ؼ� arr3�� 0�� ��ҿ� �����ϵ��� �ؾ��Ѵ�.
arr3�� 1�� ��ҿ��� arr1�� 1�� ��ҿ� arr2�� 3�� ��Ұ� �������� �Ѵٴ� ���̴�.

�̷��� arr3�� ��Ұ��� ��� �����ϰ� �� ���� ���ʴ�� ����غ���. */

/* �ۼ� �ڵ�
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

  System.out.println("arr3[0]���� : " + arr3[0]);
  System.out.println("arr3[1]���� : " + arr3[1]);
  System.out.println("arr3[2]���� : " + arr3[2]);
  System.out.println("arr3[3]���� : " + arr3[3]);
  System.out.println("arr3[4]���� : " + arr3[4]);
 }
}

------------------------------------------------------------------
��� ȭ��

arr3[0]���� : 15
arr3[1]���� : 24
arr3[2]���� : 33
arr3[3]���� : 42
arr3[4]���� : 51
------------------------------------------------------------------
*/

/* ���� 6.
���̰� 25�� ������ �迭�� ������. �׸��� �� �迭�� �� ��ҿ� 1���� 25���� 25���� ��������
Random�ϰ� ����ǵ��� ���α׷��� �Ͻÿ�. ��, �迭�ȿ� ����� Random���� �ߺ��� ���ڰ�
������ �ȵȴ�. ������ ����� ���ԵǾ� �ִ��� �˾ƺ��� ���� 1�ٿ� 5���� 5�ٷ� �� �迭�� ��Ҹ�
�ε��� ������� ����غ���. */

/* �ۼ� �ڵ�
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
��� ȭ��

03 12 05 08 02 
19 14 25 24 22 
07 13 10 06 18 
17 09 20 01 11 
04 23 15 21 16
------------------------------------------------------------------
*/

/* ���� 7.
���� 6�� ������ ���� 5, ���� 5�� 2���� �迭�� ����� ����.
*/

/* �ۼ� �ڵ�
import java.util.Random;

public class Main{
 public static void main(String[] args) {
  
  Random rnd = new Random();
  
  //2���� �迭 ��ü ����
  int[][] arr = new int[5][5];
  
  int y, x; //y�� 2���� �迭�� ���� ����ȣ, x�� ���� ȣ�� ��ȣ
  
  //6�� ����ó�� 0 ~ 24�� �ε��� ��ȣ �ݺ�
  for(int i = 0; i < 25; i++) {
   
   int n = rnd.nextInt(25) + 1; //1~25�� Random�� ����
   
   //1���� �迭�� �ε��� ��ȣ 0~24�� �� i����
   //2���� �迭�� �ε��� ��ȣ�� ��ȯ
   //ex) 0->0,0  1-> 0,1  2-> 0,2 ...... 5->1,0
   
   y = i / 5; //�� ��ȣ(2���� �迭�� �� �ε���)
   x = i % 5; //ȣ�� ��ȣ(2���� �迭�� �� �ε���)
   
   arr[y][x] = n; //��ȯ�� �ε��� ��ȣ�� �̿��ؼ� �� ����
   
   //i�� �ε����� �迭 ��ҿ� ���Ե� ��������
   //�迭�� 0�� ���� ���� i��° ������ ���� �� ���� ���� �ִ���
   
   for(int k = 0; k < i; k++) {
    //���� ���� ������� k�� 2���� �迭 �ε����� ��ȯ
    y = k / 5;
    x = k % 5;
    
    //6�� ������ ���� ������� �ߺ��� �� ó��
    if(n == arr[y][x]) {
     i--;
     break;
    }
   }//���� ���� k�� ����Ǵ� �ݺ���
  }//����� i�� ����Ǵ� �ݺ���
  
  //6�� ����ó�� 2���� �迭�� ���� ��ø �ݺ������� ���
  for(int i = 0; i < 5; i++) {
   for(int j = 0; j < 5; j++) {
    System.out.printf("%4d", arr[i][j]);
   }
   System.out.println();
  }
 }
}

------------------------------------------------------------------
��� ȭ��

22  19  12  25  20
 6  23  13  17  11
 4   5  14   7   2
18   3   9   1  24
10  21  15   8  16
------------------------------------------------------------------
*/


/* ���� 8.
����ڷκ��� ������ ���� �ϳ��� �Է¹���. �� �Էµ� ���� ��ŭ�� String �迭�� ������.
�迭�� ������ٸ� ����ڷκ��� �迭�� ���� ��ŭ ���ڿ��� �Է¹޾� �����ϵ��� ���α׷��� �غ���.
�Էµ� ���ڿ����� �� ����Ǿ� �ִ��� Ȯ���ϱ� ���� �迭�� �� ��ҵ��� ���ʷ� ����غ���.
��, ����� for each ���� �̿��غ���. */

/* �ۼ� �ڵ�
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  int i;
  
  System.out.print("String �迭 ���� �Է� : ");
  int num = scan.nextInt();
  System.out.println();
  
  //�Էµ� ��(num) ������ String�� �迭 ��ü ����
  String[] arr = new String[num];
    
  for(i = 0; i < arr.length; i++) {
   System.out.print("���ڿ� �Է� : ");
   arr[i] = scan.next();
  }
  scan.close();
  
  //for each���� �̿��� �ݺ���
  System.out.println();
  for(String t: arr) {
   System.out.println("�Է��� �����ʹ� : " + t);   
  }
 }
}

------------------------------------------------------------------
��� ȭ��

String �迭 ���� �Է� : 3

���ڿ� �Է� : hello
���ڿ� �Է� : hi
���ڿ� �Է� : bye

�Է��� �����ʹ� : hello
�Է��� �����ʹ� : hi
�Է��� �����ʹ� : bye
------------------------------------------------------------------
*/

/* ���� 9.
��� �������� Java Programming ������ �����ϴ� ���α׷��� ������.
�������� Java Programming�� 3�� ������ ��ǰ� �ִ�. ��, �� ���� �ο����� ���� �ٸ� �� �ִ�.
���α׷� ����ڰ� 3������ ������ �Է��ϱ� ���� �ش� ���� �ο����� �Է��� �� �ֵ��� �ϰ� �� �ο���
��ŭ ������ ������ ���� ���� �ο����� �Է��ϴ� ������� 3������ ��� ������ �Է��غ���.
��� ���� �Է��� �������� �� ������ ����غ��� �� ���� ��յ� ���� ���ǵ��� �غ���. 

���� ��)

[1��] �ο� �� �Է� : 3
[1�� 1��] : 80
[1�� 2��] : 70
[1�� 3��] : 60

[2��] �ο� �� �Է� : 4
[2�� 1��] : 90
[2�� 2��] : 80
[2�� 3��] : 80
[2�� 4��] : 60

[3��] �ο� �� �Է� : 5
[3�� 1��] : 90
[3�� 2��] : 80
[3�� 3��] : 70
[3�� 4��] : 40
[3�� 5��] : 60

--- Java Programming ����ǥ ----
[1��]  80  70  60   [��� : 70.0]            
[2��]  90  80  80  60   [��� : 77.5]
[3��]  90  80  70  40  60  [��� : 68.0]
-----------------------
��ü��� :  71.67
�� ����� [2��]  
*/

/* �ۼ� �ڵ�
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  //3������ ���� 2���� �迭 ��ü ����
  //�� ���� ȣ�Ǽ��� ���� ����
  int[][] arr = new int[3][];
  
  int studentNum = 0; //��ü �л���
  
  //2���� �迭 arr�� ����(length : 3)��ŭ �ݺ�
  for(int i = 0; i < arr.length; i++) {
   //���� �ش� ���� �ο��� �Է�
   System.out.print("[" + (i + 1) + "��] �ο��� �Է� : ");
   int num = s.nextInt();
   //�Էµ� �ο���(num)��ŭ�� 1���� �迭 ��ü ����
   //������ 1���� �迭 ��ü�� 2���� �迭 ��ü�� 3���� ���� ������ ���ʷ� ����
   
   arr[i] = new int[num];
   
   //��ü �л����� �л��� ����
   studentNum = studentNum + num;
   
   //�Էµ� �л���(num)��ŭ ���� �Է�
   for(int k = 0; k < num; k++) {
    System.out.print("[" + (i + 1) + "��  " + (k + 1) +"��] : ");
    
    arr[i][k] = s.nextInt();
   }
   System.out.println();
  }
  //��� �Է��� �������Ƿ� �迭�� ���
  System.out.println("---Java Programming ����ǥ---");
  
  int total = 0; //��ü ��տ�
  double max = 0; //�ֿ���� ������
  int maxBan = 1; //�ֿ���� ��ȣ(�⺻ 1��)
  
  for(int i = 0; i < arr.length; i++) { //3�� �ݺ�
   System.out.print("[" + (i + 1) + "��]"); //��� ����
   
   int sum = 0; //��� ����� ���� �հ� ������ ����
   
   for(int k = 0; k < arr[i].length; k++) { //�� ���� �л�����ŭ �ݺ�
    System.out.print(" " + arr[i][k] + "  ");
    sum = sum + arr[i][k]; //(i + 1)�� �л� ���� ����
    total = total + arr[i][k]; //��ü ��տ� ���� ����
   }
   
   //��� : ����/�л���
   double aver = (double)sum / (double)arr[i].length;
   System.out.println("[��� : " + aver + "]");
   
   //�ֿ���� ����
   if(aver > max) {
    max = aver;
    maxBan = (i + 1);
   }
  }
  
  System.out.println("------------------------------");
  
  //��ü ��� : ��ü �л� ���� / ��ü �л���
  float total_aver = (float)total/studentNum;
  
  // %.2f => �Ҽ��� ������ 2�ڸ����� �Ǽ����� ����ض�.(�ݿø���)
  System.out.printf("��ü ��� : %.2f \n", total_aver);
  System.out.println("�ֿ���� [" + maxBan + "��" + "]");
 }
}

------------------------------------------------------------------
��� ȭ��

[1��] �ο��� �Է� : 3
[1��  1��] : 80
[1��  2��] : 70
[1��  3��] : 60

[2��] �ο��� �Է� : 4
[2��  1��] : 90
[2��  2��] : 80
[2��  3��] : 80
[2��  4��] : 60

[3��] �ο��� �Է� : 5
[3��  1��] : 90
[3��  2��] : 80
[3��  3��] : 70
[3��  4��] : 40
[3��  5��] : 60

---Java Programming ����ǥ---
[1��] 80   70   60  [��� : 70.0]
[2��] 90   80   80   60  [��� : 77.5]
[3��] 90   80   70   40   60  [��� : 68.0]
------------------------------
��ü ��� : 71.67 
�ֿ���� [2��]

------------------------------------------------------------------
*/

/* ���� 10.
5 * 5ũ���� Metrix�� ���������� ���ڸ� ����ϴ� ���α׷��� �ۼ��� ����.
���ΰ� 5, ���ΰ� 5�� matrix�� 1���� 25������ ���ڸ� ���������� �����ϴ� ���α׷�����
2���� �迭 int buf[][]�� �Ʒ��� ���ó�� �������� �� �迭��ҿ� ���� �����ϴ� ���α׷�
�̴�.

  01  16  15  14  13
  02  17  24  23  12
  03  18  25  22  11
  04  19  20  21  10
  05  06  07  08  09

�迭�� ���� ����ϴ� �Լ��� �Ʒ��� ����. 
�� �Լ��� �������� ���Ѵ�.

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

/* �ۼ� �ڵ�
public class Main{
 public static void main(String[] args) {
  int[][] buf = new int[5][5];
  
  int y = 0, x = 0; //�ε��� ��ȣ
  int dy = 1, dx = 0; //y, x �ε����� ��ȭ��(ó���� �Ʒ�������)
  int limit_y = 0, limit_x = 0;
  
  for(int n = 1; n <= 25; n++) {
   buf[y][x] = n;
   
   y = y + dy; //y�� ����
   x = x + dx; //x�� ����
   
   if(dy > 0 && y == 4 - limit_y) { //y���� ������ ��
    dy = 0;
    dx = 1;
   }
   
   if(dx > 0 && x == 4 - limit_x) { //x���� ������ ��
    dy = -1;
    dx = 0;
   }
   
   if(dy < 0 && y == limit_y) { //y���� ���ҵ� ��
    dy = 0;
    dx = -1;
    limit_x++;
   }
   
   if(dx < 0 && x == limit_x) { //x���� ���ҵ� ��
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
��� ȭ��

01  16  15  14  13  
02  17  24  23  12  
03  18  25  22  11  
04  19  20  21  10  
05  06  07  08  09  
------------------------------------------------------------------
*/

//2. �ڹ��� ���� �������� �迭(C5)
//[���� ����]

/*
//[5-1]

��) 
d, e

�ؼ�) 
d. int[] arr = new int[] {1,2,3,4,5}������ ���ȣ[]�ȿ� �迭�� ũ�⸦ ������ �� ����.
��ȣ {}���� �������� ������ ���� �ڵ������� �����Ǳ� �����̴�.

//[5-2]

/*
int[][] arr = {
  {5, 5, 5, 5, 5},
  {10, 10, 10},
  {20, 20, 20, 20},
  {30, 30}
};

��)
2

�ؼ�)
arr[3].length�� arr[3]�� ����Ű�� �迭�� ũ�⸦ �ǹ��Ѵ�. ���� �׸����� arr[3]�� ����Ű��
�迭�� 0x500������ �ִ� �迭�̸� ũ��� 2�̴�. �׷��� arr[3].length�� ���� 2�� �ȴ�.
����� arr.length�� ���� 4�̰�, arr[0].length�� ���� 5, arr[1].length�� ���� 3,
arr[2].length�� ���� 4�̴�.

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

��)
for(int i = 0; i < arr.length; i++) {
 sum = sum + arr[i];
}

�ؼ�)
������ ������ ������ ������ ������.

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

��)
for(int i = 0; i < arr.length; i++) {
 for(int j = 0; j < arr[i].length; j++) {
  total = total + arr[i][j];
 }
}

average = total / (float)(arr.length * arr[0].length)

�ؼ�)
�̹����� �迭�� �ݺ����� �̿��ϴ� �����ε�, 2���� �迭�̶� 2�� for���� ����ؾ� �Ѵٴ� ���� �����ϰ��
���� ������ �ٸ��� �ʴ�.

����� ���� ���� �迭�� ��� ����� ������ ������ ������ �Ǵµ�, int�� ������ int ������ int�̱� ������
����� int�� �����Ƿ� �Ҽ��� ������ ���� ���� �� ����. �׷��� ������ ���� float�� ����ȯ ���־���.
���� float�� ����ȯ�� ������ ������ average�� 16.25�� �ƴ� 16.0�� �� ���̴�.
(average�� Ÿ���� float�̹Ƿ� 16�� �����ϸ� 16.0�� �ȴ�.)

1. int��(4byte)���� ũ�Ⱑ ���� �ڷ����� int������ ����ȯ �Ŀ� ������ �����Ѵ�.
byte/short -> int / int -> int

2. �� ���� �ǿ����� �� �ڷ����� ǥ�������� ū �ʿ� ���缭 ����ȯ �� �� ������ �����Ѵ�.
int / float -> float / float -> float

3. ������ ���� ���������� 0���� ������ ���� �����Ǿ� �ִ�.

//[5-5]

class Excercise5_5
 public static void main(String[] args) {
  int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  int[] ball3 = new int[3];
  
  //�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
  for(int i = 0; i < ballArr.length; i++) {
   int j = (int)(Math.random() * ballArr.length);
   int tmp = 0;
   
   tmp = ballArr[i];
   ballArr[i] = ballArr[j];
   ballArr[j] = tmp;
  }
  
  //�迭 ballArr�� �տ��� 3���� ���� �迭  ball3�� �����Ѵ�.
  System.out.println(ballArr, 0, ball3, 0, 3);
  
  for(int i = 0; i < ball3.length; i++) {
   System.out.println(ball3[i]);
  }
  System.out.println();
 } //end of main
} //end of class

��)

(1)
tmp = ballArr[i];
ballArr[i] = ballArr[j];
ballArr[j] = tmp;

(2)
system.arraycopy(ballArr,0, ball3,0,3);

�ؼ�)
1~9�� ���ڸ� �迭�� ������� ���, �ݺ��ؼ� ��ġ�� ���� �ٲ����ν� ���ڸ� ���´�.
�� ������ �迭�� �� ��Ҹ� ���ʴ�� �������� �ߺ����� ���� �� ���� ������ ���� �� �ִ�.
�� ������ �迭 ballArr���� �� ���� ���� �迭 ball3���� �����Ѵ�. ���ǻ�
�� ���� �� ���� ball3�� �����ϱ�� ����.

//[5-6]

class Excercise5_6{
 public static void main(String[] args) {
  //ū �ݾ��� ������ �켱������ �Ž������ �Ѵ�.
  int[] coinUnit = {500, 100, 50, 10};
  
  int money = 2680;
  System.out.println("money = " + money);
  
  for(int i = 0; i < coinUnit.length; i++){
   System.out.println(coinUnit[i] + "��: " + money / coinUnit[i]);
   money = money % coinUnit[i];
  }
 } //main
}

��)
System.out.println(coinUnit[i] + "��: " + money/coinUnit[i]);
money = money % coinUnit[i];

�ؼ�)
������ ������ ������������ �迭�� �ʱ�ȭ�Ѵ�. �ݾ��� ū ������ �켱������ �����ؾ� ����
���� ������ ������ �Ž������� �� �� �ֱ� �����̴�. �׷��� ������, ��� �Ž�������
10��¥���θ� �ְ� �� ���� �ִ�.

���� money�� coinUnit[i]�� ������ ������ ������ ������ �ǰ�, ������ ������ �ϸ�
coinUnit[i]�� �����ϰ� ���� �ݾ��� �ȴ�. ��������(coinUnit�迭)�� ������ŭ
�� ������ �ݺ��ϸ� �ȴ�.

//[5-7]

class Excercise 5_7
{
 public static void main(String[] args) 
 {
  if(args.length! = 1) {
   System.out.println("USAGE: java Excercise5_7 3120");
   System.exit(0);
  }
  
  //���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
  int money = Integer.parseInt(args[0]);
  
  System.out.println("money = " + money);
  
  int[] coinUnit = {500, 100, 50, 10}; //������ ����
  int[] coin = {5, 5, 5, 5}; //������ ������ ����
  
  for(int i = 0; i < coinUnit.length; i++) {
   int coinNum = 0;
   
   //1. �ݾ�(money)�� ���� ������ ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
   coinNum = money / coinUnit[i];
   
   //2. �迭 coin���� coinNum��ŭ�� ������ ����.
   //(���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
   if(coin[i] >= coinNum) {
    coin[i] -= coinNum;
   }else {
    coinNum = coin[i];
    coin[i] = 0;
   }
   
   //3. �ݾ׿��� ������ ����(coinNum)�� ���� ������ ���� ���� ����.
   money -= coinNum * coinUnit[i];
   
   System.out.println(coinUnit[i] + "��: " + coinNum);
  }
  
  if(money > 0) {
   System.out.println("�Ž������� �����մϴ�.");
   System.exit(0); //���α׷��� �����Ѵ�.
  }
  
  System.out.println("=���� ������ ���� =");
  
  for(int i = 0; i < coinUnit.length; i++) {
   System.out.println(coinUnit[i] + "��:" + coin[i]);
  }
 } //main
}

��)
//1. �ݾ�(money)�� ���� ������ ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
coinNum = money/coinUnit[i];

//2. �迭 coin���� coinNum��ŭ�� ������ ����.
//(���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
if(coin[i] >= coinNum) {
 coin[i] -= coinNum;
}else {
 coinNum = coin[i];
 coin[i] = 0;
}

//3. �ݾ׿��� ������ ����(coinNum)�� ���� ������ ���� ���� ����.
money -= coinNum * coinUnit[i];

�ؼ�)
�־��� ������θ� �ۼ��Ͽ� �� ����� ���� Ǯ �� �־��� ���̶� �����Ѵ�. ���� 5~6�� �����ߴٸ�
�� ������ ���� ���ص� ���̹Ƿ� �ڼ��� ������ �����Ѵ�.
�� ������ �������� ���Ǳ� ���α׷��� �ۼ��غ��� ���� ���ΰ� �� ���̴�.

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
    System.out.println("*"); //counter[i]�� �� ��ŭ '*'�� ��´�.
   }
   System.out.println();
  }
 } // end of main
} // end of class

��)

(1) 
counter[answer[i]-1]++;

(2) 
System.out.print(counter[i]);

for(int j = 0; j < counter[i]; j++) {
 System.out.print("*");
}

�ؼ�)
�迭�� �̿��ؼ� �������� ������ ���� �����̴�. 1~4 ������ �����͸� ������ ���̱� ������ ũ�Ⱑ
4�� �迭(counter)�� �����Ͽ���. ũ�Ⱑ 4������ �迭�� index�� 0~3�̱� ������ answer[i]����
1�� ���־�� �Ѵ�.

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

��)
int x = j;
int y = star.length-1-i;

result[x][y] = star[i][j];

�ؼ�)
��Ʈ������ ������ ȸ����Ű���� �迭�� ȸ����Ű�� �����̴�. �迭 star�� 4 x 5�� 2���� �迭�̹Ƿ�
�� �迭�� 90�� ȸ����Ű�� 5 x 4�� 2���� �迭�� �Ǿ�� �Ѵ�.

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
  
  //���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
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

��)
if('a' <= ch && ch <= 'z') {
	  result = result + abcCode[ch-'a'];
}else if('0' <= ch && ch <= '9') {
	  result = result + numCode[ch-'0'];
}

�ؼ�)
���ڿ��� �ݺ����� charAt(int i)�� �̿��ؼ�, �� ���ھ� �迭�� �ִ� ��ȣ�ڵ�� �����ؼ�
��ȣȭ�ϴ� �����̴�.

��ȣ�ڵ�� ����ҹ��ڿ� ���ڷ� �������� �ִµ�, ����ҹ����� ��� �迭 abcCode���� �ش� ��ȣ�ڵ带 ���,
������ ��쿡�� �迭 numCode���� ��ȣ �ڵ带 �򵵷� �Ǿ� �ִ�.
�׷��� ���ǹ����� ���ڰ� ����ҹ����� ���� ������ ��츦 ����� ó���ߴ�.

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

��)
result[i][j] = score[i][j];
result[i][score[0].length] += result[i][j];
result[score.length][j] += result[i][j];
result[score.length][score[0].length] += result[i][j];

�ؼ�)
2���� �迭�� ���縦 ���� ������ �����̴�. 

//[5-12]

import java.util.*;

class Excercise5_12{
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "����"}; //words[0][0], words[0][1]
				{"computer", "��ǻ��"}; 
		}
	}
��)

�ؼ�)

//[5-13]

��)

�ؼ�)
*/

//3. �Ի� �׽�Ʈ ���� �ڹٷ� Ǯ��
//�ֹε���� ��ȣ, ī�� ��ȣ ���� �����

/*
import java.util.Scanner;

public class EX_Array2_190723{
 public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  
  String data;
  
  while(true) {
   System.out.print("�Է°� : ");
   data = scan.nextLine();
   
   //�Էµ� ������ ���̸� ������
   int len = data.length();
   
   System.out.println("�Է°��� : " + len);
   
   int sum = 0; //�� �ڸ����� ���� ���� �� ����� ���� sum
   
   if(len < 13)
   {
    System.out.println("�߸� �Է��߽��ϴ�.");
    System.out.println();
    continue;
   }
   
   if(len < 15) {
    
    //�ֹι�ȣ �Ǻ� ����
    int k = 2;
    
    for(int i = 0; i < len - 1; i++) { //������ �ڸ��� ���꿡�� ����
     char ch = data.charAt(i);
     if(ch >= '0' && ch <= '9') {
      sum = sum + ((ch - 48) * k);
      k++; // k = k + 1;
      if(k > 9) k = 2;
     }
    }
    
    int M = (11 - (sum % 11)) % 10; //���� ���� �ڵ� 
    
    int m = data.charAt(len - 1) - 48; //������ �ڸ����� ���ڰ��� ���������� ��ȯ
    if(M == m) {
     System.out.println("�ֹ� ��ȣ�� �½��ϴ�.");
     System.out.println();
    }
    else {
     System.out.println("���� ������ �ƴմϴ�.");
     System.out.println("�ٽ� �Է��ϼ���.");
     System.out.println();
    }
   }
   
   else {
    
    //ī���ȣ �Ǻ� ����
    
    int count = 0; //data �ȿ� �ִ� ������ ������ ī�����ϱ� ���� ����
    for(int i = 0; i < len; i++) {
     char ch = data.charAt(i);
     if(ch >= '0' && ch <= '9') count++;
    }
    
    //data ���� ������ ������ 16���� ī�� ��ȣ�� �´� ������ �ν�
    if(count == 16) {
     System.out.println("ī�� ��ȣ�� �½��ϴ�.");
     System.out.println();
     break;
    }
    
    else {
     System.out.println("���� ������ �ƴմϴ�.");
     System.out.println("�ٽ� �Է��ϼ���.");
     System.out.println();
    }
   }
  }
 }
}
*/