//190719(��) �ڹ� ���� 3���� - ���ڿ� ����

/*
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
	//java������ ���ڿ�(string)�� ��ü�� ������.
	//��, java������ ���ڿ��� ��ü��!!!
	
	//10;
	//3.14;
	//��ü�� �ּҸ� �����ϴ� ���� : �������� 
	//String str= "Hello";
	//String str; //String ��ü�� �����ϴ� ���� ����
		
	//str = "Hello"; //literal ���ڿ� ��� ��ü ����
	
	//int n = "He".length(); 
	//���� ȸ�� ���Խÿ� �Է��� ���ڼ��� üũ
	
	//String str = new String("Hello"); //String ���� ����
//	(1) String str = "Hello";
//	(2) String str = new String("Hello");
		
//	String str2 = "Hello";
			
	//System.out.println(str);
	//System.out.println(str2);
	//System.out.println(str == str2);
	//���� ���������� �� ������ �ּҳ����� ������ �ǹ���.
		
	String str = null;
//	System.out.println(str);
	//null�� ������ null�� ����
	
	str = new String("Hello");
//	System.out.println(str);
//	System.out.println(str.toString());
//	(str) == (str.toString())
	
//	Random rnd = new Random(); //���� ����
//	System.out.println(rnd);
//	System.out.println(rnd.toString());
	
//	String str = new String("Hello");
//	
//	//��ü�� ���(Method)���� �����ϰ� ����.
//	//String ��ü�� ������ �޼ҵ��
//	
//	//1.���ڿ� �������� ����(���ڼ�)�� �������ִ� ���(Method)
//	int len = str.length();
//	System.out.println(len);
//	
//	//2. ���ڿ����� ��
//	System.out.println(str == "Hello"); //false: �ּ� ��
//	System.out.println(str.equals("Hello"));
//	System.out.println(str.equals(new String("Hello")));
//	String s1 = "Hello";
//	System.out.println(str.equals(s1));
//	System.out.println("Hello".equals(str));
//	
//	//2-1. ��ҹ��� ��
//	System.out.println(str.equals("hello"));
//	System.out.println(str.equalsIgnoreCase("hello"));
	//��ҹ��� ���� ���� ���ϴ� �Լ� equalsIgnoreCase
	
	//3. ���ڿ����� Ư�� char ������!!
//	char ch = str.charAt(0);
//	System.out.println(ch);
//	System.out.println(str.charAt(1));
//	System.out.println(str.charAt(2));
//	System.out.println(str.charAt(3));
//	System.out.println(str.charAt(4));
//	System.out.println(str.charAt(5)); //���� hello�� 0~4�� �迭������
	
//	for(int i = 0; i < str.length(); i++) {
//		System.out.println(str.charAt(i));
//		}
	//Scanner�� �̿��ؼ� �ѹ���(char) �Է¹ޱ�
//	Scanner scan = new Scanner(System.in);
//	String s2 = scan.next(); //���ڿ� �Է¹ޱ�
//	char c = s2.charAt(0);
//	System.out.println(c);
	
	//4. ���ڿ��ȿ� Ư�� ���ڰ� ���°�� �ִ���..
	int index = str.indexOf('l');
	System.out.println(index);
	System.out.println(str.lastIndexOf('l'));
	
	//���ڿ� �˻��� ����
	System.out.println(str.indexOf("eo"));
	//indexOf�� ���� �� -1�� ��������� ������ ���ȣ�� ��ã�Ҵٴ� �ǹ�
	System.out.println(str.indexOf('e',2));//2������� �˻���
	
	//5. �Ķ���ͷ� ���޵� ���ڿ��� �� ���ڿ� �ȿ� ���ԵǾ� �ִ°�?
	String s = "Hello world! Hello android! nice world!";
	boolean b = s.contains("world");
	System.out.println(b);
	
	//6. ���ڿ� ����
	String s3 = s.concat(" nice android!"); //���� ���� X, ���ο� ���ڿ��� ����
	s3 = s + "aaa";
	
	System.out.println(s); //������ �״��...
	System.out.println(s3);
	
	//7. Ư�� ���ڿ��� ���۵Ǵ°�?
	System.out.println(s.startsWith("Hello"));
	System.out.println(s.startsWith("https"));

	//7-1. Ư�� ���ڿ��� ����Ǵ°�?
	System.out.println(s.endsWith("Hello"));
	System.out.println(s.endsWith("world"));
	
	//8. ��ҹ��� �ڵ� ��ȯ
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s); //������ �ٲ��� ����
	
//	s = s.toUpperCase();
	
	//9. ���ڿ��� �糡�� ���鹮�ڸ� �����ϱ�!!(�߰� ���� ���ڴ� ���� �� ��)
	s = " Hello     ";
	System.out.println(  "[" + s + "]"  );
	System.out.println(s.equals("Hello"));
	
	s.trim();
	System.out.println(  "[" + s + "]"  );
	System.out.println(s.equals("Hello"));
		
	//10. Ư�� ���� �ٲ�ġ��!!
	s = "Hello world! Hello android! nice world!";
	System.out.println(s.replace('H', 'K'));
	System.out.println(s.replace("android", "ios"));
	//�߰� ���鵵 ������ �� ����
	System.out.println(s.replace(" ",""));
	
	//11. ���ڿ� �߶󳻱�!!
	String s4 = s.substring(6);
	System.out.println(s4);
	
	String s5 = s.substring(6, 12);
	System.out.println(s5);
	
	//12. ���ڿ� ���� ��Һ�!! <- ����
	char ch1 = 'a';
	char ch2 = 'b';
	System.out.println( ch1 > ch2);
	
	String s6 = "aac";
	String s7 = "aab";
	
//	System.out.println(s6 > s7); //error: �ּ� �񱳴� �� ��
	System.out.println(s6.compareTo(s7)); //������ s6�� �۰� ����� s6�� ũ��.
	
	//13. ���ڿ��� �и�!!(���ڿ��� �и��ؼ� �迭�� ����� ��)
	s = "android:ios:nice:windows";
	String[] arr = s.split(":"); //String �迭�� ����
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]); 
		}
	
	// String class�� static Method��...
	// static �޼ҵ� : ��ü ���� ���� �ٷ� ����� �� �ִ� �޼ҵ�[ Ŭ������.�޼ҵ��()];
	
	//1) ���� ������ִ�... like... printf()����...
	int h   = 10; //��
	int m   =  5; //��
	int sec = 12; //��
	System.out.println(h+":"+m+":"+sec);
	System.out.printf("%02d:%02d:%02d \n", h, m, sec);
	
	//System.out.printf()�� �ܼ�â�� ������..
	
	//Ư�� ����(���ڿ� ���)���� ������ִ� ���
	String s10 = String.format("%02d:%02d:%02d", h, m, sec);
	System.out.println(s10);
//	
	//�⺻(primitive) �ڷ����� String ��ü�� ��ȯ ����
	int num = 10;
	String s11 = String.valueOf(num);
	System.out.println(s11.length());
	
	
	s11 = String.valueOf(3.14);
	System.out.println(s11.length());
	
	
	s11 = String.valueOf(true);
	System.out.println(s11.length());
	//String.format(format, args)
	
	//������ String.valueOf()�� �� ������� ����. wh?
	s11 = 10+"";
	s11 = 3.14+"";
	s11 = true+"";
	
	//�ݴ��, String�� �⺻����..(Integer, Double, Float, Byte, Boolean)
	//WrapperŬ����(�⺻���� ����������..�����ִ� Ŭ����)
	int n = Integer.parseInt("100"); //String ->int
	double d = Double.parseDouble("3.14");//String->double
	}
}
229p ~ 235p �а� ���� �����ϱ�
*/

/* ���� 4.
����ڷκ��� ���� 3���� �Է¹޾Ƽ� ���� 3���� ��, ���, �ִ밪, �ּҰ��� ���ؼ� ����ϴ� ���α׷���
�ۼ��Ͽ� ����. ��, ����� �Ҽ��� ������ ���ڵ� ��µǵ��� �Ѵ�.
*/

/* �ڵ� �ۼ� 
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
  
 int num = 0; //���� �Է¹��� ������ ���� num
 int max = 0; //�ִ밪�� �־��� ������ ���� max
 int min = 0; //�ּҰ��� �־��� ������ ���� min
 int sum = 0; //���� ���� ������ ���� sum

  
  System.out.println("�ȳ��ϼ���. ���δ�");
  System.out.println("���� ���δ��� �Է��Ͻ� 3���� �����͸� �������� �հ� ���, �ִ밪, �ּҰ��� ���ϴ� ���α׷��Դϴ�.");
  System.out.println("�׷� ���ݺ��� ���α׷��� �����ϰڽ��ϴ�.");
 
  MaxMin xn = new MaxMin();
  Scanner scan = new Scanner(System.in);
  
  for(int i=1; i<=3; i++) {
	  System.out.println(i + "��° ���ڸ� �Է��ϼ���.");
	  	num = scan.nextInt();
		  	
	  	sum = sum + num;
	  	
	  	max = xn.Max_1(num, max);
	  	min = xn.Min_1(num, min);
  }
    
  double avg = sum/3; //����� ���� �Ǽ��� ���� avg
  
//  num = scan.nextInt();
//  num = scan.nextInt();
//  
  
  
//  int sum = num + num + num;
//  float avg = (float)(num + num + num)/3;

  System.out.printf("�Է��Ͻ� �������� ���� : %d \n", sum);
  System.out.printf("�Է��Ͻ� �������� ����� : %.2f \n", avg);
  System.out.printf("�Է��Ͻ� ������ �� �ִ밪�� : %d \n", max);
  System.out.printf("�Է��Ͻ� ������ �� �ּҰ��� : %d \n", min);
 }
}

------------------------------------------------------------------
��� ȭ��
�ȳ��ϼ���. ���δ�
���� ���δ��� �Է��Ͻ� 3���� �����͸� �������� �հ� ���, �ִ밪, �ּҰ��� ���ϴ� ���α׷��Դϴ�.
�׷� ���ݺ��� ���α׷��� �����ϰڽ��ϴ�.
1��° ���ڸ� �Է��ϼ���.
7908
2��° ���ڸ� �Է��ϼ���.
273
3��° ���ڸ� �Է��ϼ���.
10
�Է��Ͻ� �������� ���� : 8191 
�Է��Ͻ� �������� ����� : 2730.00 
�Է��Ͻ� ������ �� �ִ밪�� : 7908 
�Է��Ͻ� ������ �� �ּҰ��� : 10 
------------------------------------------------------------------
//������ ����Ʈ : https://tinyurl.com/yxb5x9p7(�Է¹��� ���� �ִ밪, �ּҰ� ���)

*/

//4. 190718_���.txt

//�ݺ����� while���� do-while, 
//for�� �� �ƹ��ų� ����ϵ� ������ ��� ����� ����. 

/*
���� 1.
���α׷� ����ڷκ��� ���� ������ �ϳ� �Է¹޾Ƽ�, 
�� ����ŭ "Hello World!"�� ����ϴ� ���α׷��� �ۼ��غ���.
*/

/* �ڵ� �ۼ�
import java.util.Scanner;
	public class Main{
		public static void main(String[] args){
			int num; //����ڷκ��� �Է¹��� ������ ���� num
			
			System.out.println("�ȳ��ϼ���. ���δ�");
			System.out.println("���� ���δ��� �Է��Ͻ� ������ �����͸�ŭ \"Hello world!\"�� ����ϴ� ���� ���α׷��Դϴ�.");
			System.out.print("���Ͻô� ���� �����͸� �Է��ϼ��� : ");
			
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			
			for(int i=1; i <= num; i++) {
				System.out.println(i+"��° " + "\"Hello world!\"");
			}
				
			
		}
}

----------------------------
��� ȭ��

�ȳ��ϼ���. ���δ�
���� ���δ��� �Է��Ͻ� ������ �����͸�ŭ "Hello world!"�� ����ϴ� ���� ���α׷��Դϴ�.
���Ͻô� ���� �����͸� �Է��ϼ��� : 5
1��° "Hello world!"
2��° "Hello world!"
3��° "Hello world!"
4��° "Hello world!"
5��° "Hello world!"
----------------------------
*/

/* ���� 2.
���α׷� ����ڷκ��� ���� ������ �ϳ� �Է� ���� ����, 
�� ����ŭ 3�� ����� ����ϴ� ���α׷��� �ۼ��� ����. 

���� ��� 5�� �Է¹޾Ҵٸ� 3, 6, 9, 12, 15�� ����ؾ� �ϰ� 
3�� �Է¹޾Ҵٸ� 3, 6, 9�� ����ؾ� �Ѵ�. */

/* �ڵ� �ۼ�
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num; //���δԿ��� �Է¹��� ������ ���� num
		int three = 3; //���δ��� �Է��Ͻ� �������� 3�� ������ ������ ���� three
		
		System.out.println("���δ�, �ȳ��ϼ���.");
		System.out.println("���� ���δԲ��� �Է��Ͻ� ����ŭ 3�� ����� ����ϴ� ���α׷��Դϴ�.");
		System.out.print("���Ͻô� ���ڸ� �Է����ּ��� : ");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
				for(int i=1; i <= num; i++)
		{
			System.out.println(i + "��° : " + three * i);
		}
	}
}

----------------------------
��� ȭ��

���δ�, �ȳ��ϼ���.
���� ���δԲ��� �Է��Ͻ� ����ŭ 3�� ����� ����ϴ� ���α׷��Դϴ�.
���Ͻô� ���ڸ� �Է����ּ��� : 5
1��° : 3
2��° : 6
3��° : 9
4��° : 12
5��° : 15
----------------------------
*/

/* ���� 3.
���α׷� ����ڷκ��� ����ؼ� ������ �Է¹޴´�. 
�׸��� �� ���� ����ؼ� ���س�����. 

�̷��� �۾��� ���α׷� ����ڰ� 0�� �Է��� ������ ��ӵǾ�� �ϸ�, 
0�� �ԷµǸ� �Էµ� ��� ������ ���� ����ϰ� ���α׷��� �����Ѵ�.
*/

/* �ۼ� �ڵ�
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num; //���δ����κ��� �Է¹��� ������ ���� num
		int sum = 0; //���δ����κ��� �Է¹��� ���� ���������� ������ ���� sum 
		
		System.out.println("���δ�, �ȳ��ϼ���.");
		System.out.println("���� ���δ��� �Է��Ͻ� ������ �����͸� ��� ���ϰ� 0�� �Է��Ͻø� ����Ǵ� ���α׷��Դϴ�.");
		System.out.println("�׷�~ ���α׷��� �����ϰڽ��ϴ�.");
		
		Scanner scan = new Scanner(System.in);
				
		while(true)
		{
			System.out.print("���� �Է����ּ��� : ");
			
			num = scan.nextInt();
					
			if(num == 0)
			{
				System.out.println("0�� �Է��ϼ̽��ϴ�. ���α׷��� ����˴ϴ�.");
				break;
			}
						
			else {
			sum = sum + num;
			System.out.println("���� ������ ���� : " + sum + "\n");
			}
		}
	}
}

----------------------------
��� ȭ��

���δ�, �ȳ��ϼ���.
���� ���δ��� �Է��Ͻ� ������ �����͸� ��� ���ϰ� 0�� �Է��Ͻø� ����Ǵ� ���α׷��Դϴ�.
�׷�~ ���α׷��� �����ϰڽ��ϴ�.
���� �Է����ּ��� : 5
���� ������ ���� : 5

���� �Է����ּ��� : 5
���� ������ ���� : 10

���� �Է����ּ��� : 5
���� ������ ���� : 15

���� �Է����ּ��� : 5
���� ������ ���� : 20

���� �Է����ּ��� : 0
0�� �Է��ϼ̽��ϴ�. ���α׷��� ����˴ϴ�.
----------------------------
*/

/*
���� 4.
���α׷� ����ڷκ��� �Է� ���� ���ڿ� �ش��ϴ� �������� ����ϵ�, 
�������� ����ϴ� ���α׷��� �ۼ��� ����.
*/
//
//import java.util.Scanner;
//
//public class Main{
//	public static void main(String[] args) {
//		int num; //���δ����κ��� ���ڸ� �Է¹��� ������ ����  num
//		int j;
//		
//		System.out.println("�ȳ��ϼ���. ���δ�");
//		System.out.println("���� ���δ��� �Է��Ͻ� ���ڿ� �ش��ϴ� �������� �������� ����ϴ� �ȶ��� ���α׷��Դϴ�.");
//		System.out.print("����ϰ� ���� �ܼ��� �Է��غ����� : ");
//		
//		Scanner scan = new Scanner(System.in);
//		num = scan.nextInt();
//		System.out.print("\n");
//		System.out.println(num + "�� �������� ����մϴ�.");
//		
//		for(j=9; j>0; j--)
//		{
//			System.out.printf("%d * %d = %d \n", num, j, (num * j));
//		}
//		System.out.print("\n");
//		System.out.println("����� �������ϴ�.");
//		System.out.println("���α׷��� �����մϴ�.");
//	}
//}
//
//--------------------------------------------------------
//��� ȭ��
//
//�ȳ��ϼ���. ���δ�
//���� ���δ��� �Է��Ͻ� ���ڿ� �ش��ϴ� �������� �������� ����ϴ� �ȶ��� ���α׷��Դϴ�.
//����ϰ� ���� �ܼ��� �Է��غ����� : 3
//
//3�� �������� ����մϴ�.
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
//����� �������ϴ�.
//���α׷��� �����մϴ�.
//--------------------------------------------------------

/*
���� 5.
���α׷� ����ڷκ��� �Է� ���� ������ ����� ����ϴ� ���α׷��� �ۼ��ϵ�
���� �� ���� ������ �������Ѿ� �Ѵ�.

- ���� �� ���� ������ �Է��� ������ ���α׷� ����ڿ��� ���´�. 
    �׸��� �� ����ŭ ������ �Է� �޴´�.
- ��հ��� �Ҽ��� ���ϱ��� ��µǵ��� �Ѵ�.
*/

/*
���� 6.
���α׷� ����ڷκ��� �� 5���� ������ �Է¹޾Ƽ�, 
�� ���� ���� ����ϴ� ���α׷��� �ۼ��غ���. 

��, �Ѱ��� ������ �ִ�. 
������ �ݵ�� 1�̻��̾�� �Ѵ�.
 
���࿡ 1�̸��� ���� �ԷµǴ� ��쿡��, 
�̸� �Է����� �������� �ʰ� �� �Է��� �䱸�ؾ� �Ѵ�. 
�׷��� �ᱹ 1�̻��� ���� 5���� ��� �Է¹��� �� �ִ� 
���α׷��� �ϼ��ؾ�  �Ѵ�.
*/

/*
���� 7.
�Ʒ��� ����� ���̴� ���α׷��� �ۼ��غ���.

*
o *
o o *
o o o *
o o o o *

�����, �� 5�࿡ ���ļ� ����� �̷������, ���� ������ ������ 
'o'���ڰ� �����Ѵٴ� Ư¡�� ������� �ݺ����� ��ø�� �����ϸ� �ȴ�.
*/

/*
���� 8.
1�̻� 100�̸��� ���� �߿��� 7�� ����� 9�� ����� ����ϴ� ���α׷��� �ۼ��� ����.
��! 7�� ����̸鼭 ���ÿ� 9�� ����� ������ �ѹ��� ����ؾ� �Ѵ�.
*/

/*
���� 9.
�� ���� ������ �Է� �޾Ƽ� �� ���� ���� ����ϴ� ���α׷��� ������ ����. 
��, ������ ū ������ ���� ���� �� ����� ����ؾ� �Ѵ�. 

���� �� �Էµ� �� ���� ������ ������� 12�� 5��� 7�� ��µǾ�� �ϰ�, 
�Էµ� �� ���� ������ ������� 4�� 16�̶�� 12�� ��µǾ�� �Ѵ�. 
��, ��� ����� ������ 0 �̻��� �Ǿ�� �Ѵ�.
*/

/*
����10.
���� 9���� ������ if~else�� ����Ͽ� �ذ��Ͽ��°�? 
�̸� if~else�� �ƴ� ���׿����ڸ� �̿��Ͽ� ������ ����. 

/*
����11.
�������� ����ϵ� ¦�� ��(2��, 4��, 6��, 8��)�� ��µǵ��� �Ѵ�. 
���� 2���� 2 * 2����, 4���� 4 * 4����, 6���� 6 * 6����, 8���� 8 * 8������ ��µǵ��� �غ���. 
�̸� �ذ��ϱ� ���� break�� continue���� ����غ���.
(�Ƚᵵ ���α׷����� ���������� �����ϴ� �ǹ̿��� ������ �� ��)
*/


//�ڹ��� ���� 
//2. 190718_������(C3)
 

//3. 190718_���(C4)







