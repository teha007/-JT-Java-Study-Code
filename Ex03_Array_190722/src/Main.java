//190722(��) �ڹ� ���� 4����

/*
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		//�ڹ� ������ �迭�� ��ü��!!!
		
		//int�� 3ĭ¥�� �迭 ��ü ����
		//��ü�� heap �޸𸮿��� �������. new Ű����� �����ؾ� ��.
		int[] arr = new int[3];  //���� ���� ���, ������ ����
//		int [] arr2 = new int[3]; //ok
//		int arr3[] = new int[3]; //ok
		//���� 3�� �� ���� ��������� ������ ���� ���ʿ� ����� ��� ����
		
//		int[] arr4; //int[] ���� ������ ���� ����
//		arr4 = new int[3]; //int[] ��ü�� �����Ͽ� �����ϱ� -ok
//		arr4 = arr; //�迭 ���� ���������� ���Ե� ����, ���� ������ ���� �ƴ϶� �ּҸ� ������ ��
				
//		new String("aaa");
//		new Scanner();
//		new Random();
	
//		int arr[3];

//		String p = new String("Hello");
//		Random rnd = new Random();
//		Scanner scan = new Scanner()
		System.out.println(arr); //�迭 �̸�,���� ������ ��� .toString()�޼ҵ尡 �ڵ� �����
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]); //error - �ε��� ������ ����� ���� �߻�
		
		//�迭 ��ҿ� �� ����
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//�迭�� �ʱ�ȭ
		int[] arr2 = new int[] {10,20,30};
		//int[] arr2 = new int[3] {10,20,30}; //error : �ʱ�ȭ�ϸ� ���� ��� �Ұ�!!
		//int[] arr2 = new int[]; //error : �ʱ�ȭ���� ������� ������ ����!
	
		//�ʱ�ȭ�� ��� ǥ���
//		String s = new String("aaa");
//		String s1 = "aaa";
		
		int[] arr3 = {10, 20, 30}; //�ڵ� new int[]
	
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		//�迭�� ����(��� ����) ������ ���� ������.
//		int[] arr4 = new int[3];
		
		//Ű���� �Է����� �迭�� ���� �Է��� ������.
//		Scanner scan = new Scanner(System.in);
		
//		int k = scan.nextInt();
//		int[] arr4 = new int[k];
//		k++;
		
//		arr4[0] = 1;
//		arr4[1] = 2;
		
//		for(int i = 0; i < arr4.length; i++) {
//			System.out.print(arr4[i] + ", ");
			
		//�迭 ��� ������ 0��¥���� �迭�� ���� �� ����
		int[] arr5 = new int[0];
		System.out.println(arr5.length);
		
		//�ʱ�ȭ�� �� ���������� �� ���� ������.
//		int a = 10;
//		int arr[] = {10, 20, 30};
		
		int n = 10;
//		int[] arr6 = new int[] {n, 20, 30};
		int[] arr6 = new int[] {n, n + 1, n + 2};
		for(int i = 0; i < arr6.length; i++) {
			System.out.print(arr6[i] + ", ");
		}
		System.out.println();
		
		//�迭 ���� ������ ������� �Ұ�
		//int[3] arr7; //error
		
		//�迭 ���� ���������� ����
		double[] arr7 = new double[] {1.1, 2.2, 3.3};
		double[] arr8; //�迭 ��������[4byte]
		arr8 = arr7; //���� �迭 ��ü�� �����ϰ� ��.
		
		for(int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < arr8.length; i++) {
			System.out.print(arr8[i] + ", ");
		}
		System.out.println();
		
		//�ٸ� ���� ������ ���� ������ ����
		arr8[1] = 3.14;
		
		for(int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i] + ", ");
		}
		System.out.println();
		
		//�迭 ��ü�� copy�ϱ�[�迭 ��Ұ����� ����]
		int[] arr9 = new int[] {5,6,7};
		int[] arr10 = new int[ arr9.length ];
		
		for(int i = 0; i < arr9.length; i++)
			arr10[i] = arr9[i];

		//arr10�� ��ü�� arr9�� ��ü�� ���� �ٸ� ��ü��.
		
		//�⺻�� ������ �迭!
		int a, b, c;
		int[] arr11 = new int[3];
		
		//������ ������ �迭!
		String s1, s2, s3;
		s1 = new String("aaa");
		s2 = new String("bbb");
		s3 = "ccc"; //�ڵ� new String?()
		
//		System.out.println(s1);
		
//		new String[3];
		
		String[] arr12 = new String[3];
//		System.out.println(arr12);
				
		arr12[0] = new String("Hello");
		arr12[1] = new String("Nice");
		arr12[2] = "android"; //�ڵ� new String()
		
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
		//�н� �ÿ� ���� ���
		String[] arr15 = new String[] {"Hello", "Nice", "android"};
		String[] arr16 = {"Hello", "nice", "android"}; 
		//�������� ���� ���� ���
		
		//�� �ٸ� �������鵵 �迭 ��� ������.
//		Random rnd;
		Random[] arr17 = new Random[3];
		System.out.println( arr17[0] );
		
		//�� �迭�� ���(Random ���� ����)�� ��ü ����
		arr17[0] = new Random();
		int m = arr17[0].nextInt(15); // 0~14
//		m = arr17[1].nextInt(10); //error
		
		//�迭 �ʱ�ȭ
		Random[] arr18 = new Random[] {new Random(), new Random(), new Random()};
		Random[] arr19 = {new Random(), new Random()};
		System.out.println(arr19.length);
		System.out.println(arr18.length);
		
		//Scanner ���� ������ 3�� ���� �迭 ��ü ����
		Scanner[] aaa = new Scanner[3];
		aaa[0] = new Scanner(System.in);
		aaa[1] = new Scanner(System.in);
		aaa[2] = new Scanner(System.in);

		//����� ���� class�� �迭��...
		Student stu = new Student(); //��ü ����
		stu.kor = 80;
		
		Student[] stus = new Student[5]; //student ���������� 5�� �迭�� ���� [ Student ��ü�� ���� ���� �ƴ�!!!]
		//stus[0].kor = 80; //error;
		stus[0] = new Student(); //�̶� Student ��ü�� ����
		stus[1] = new Student();
		
//		new int[3];
		
		//Ȯ���� for��.. for each����
		int[] nums = new int[3];
		nums[0] =10;
		nums[1] =20;
		nums[2] =30;
	
		//�迭 ��Ұ� ���
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println("=======");
		
		//�ݺ������� ��Ұ� ���
		for(int i = 0 ; i < nums.length; i++) {
//			System.out.println(nums[i]);
			int t = nums[i];
			
			System.out.println(t);
		}
		System.out.println("=======");
		
		//�� �ݺ����� �����ϰ� ���� ����(for each��)
		for(int t : nums) {
			System.out.println(t);
		}
		
		//for each���� ������ ���� �迭 ��ü�� ����
		String[] strs = new String[3];
		strs[0] = new String("Hello");
		strs[1] = new String("Nice");
		strs[2] = "android"; //�ڵ� new String();
		
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
		
		//�� �ݺ����� �����ϰ� ���� ����(for each��) 
		for(String t : strs) {
			System.out.println(t);
			System.out.print(t + "   ");
			System.out.println(t.charAt(2));
			System.out.println(t.length());
		}
		
	}//main �޼ҵ�
}// Main class

//����� ���� class
class Student{
	
	int kor;
	int eng;
	int avg;
}
*/

// <å ����>

//1. 154p ArrayTest1.java

/* �ۼ� �ڵ�
public class Main {
	
	public static void main(String[] args) {

		int[] s = new int[10]; //ũ�Ⱑ 10�� �迭 ����
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i; //i��° ���ҿ� i�� ����
		}
		
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}

------------------------------------------------------------------
��� ȭ��

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
			System.out.println("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
		}
		
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
			
			System.out.println("��� ������" + total / STUDENTS + "�Դϴ�");
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

//5. 159p �ִ밪 �ּҰ� ���ϱ�

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//6. 161p Ư���� �� ã��

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//7. 163p �ֻ��� ������

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//8. 167p ArrayTest4.java

public class Main {
	
	public static void main(String[] args) {
			
		}
}

//<�ܰ� ����>

/* ���� 1.
���̰� 5�� int�� �迭�� �����ؼ� ���α׷� ����ڷκ��� �� 5���� ������ �Է� ����.
�׸��� �Է��� ������ ������ ������ ����ϵ��� ������ �ۼ��غ���.
  - �Էµ� ���� �߿��� �ִ밪
  - �Էµ� ���� �߿��� �ּҰ�
  - �Էµ� ������ �� ��

��, �ݵ�� �Է��� �Ϸ��� ���¿��� '�ִ밪'�� '�ּҰ�' �׸��� '����'�� ����ؾ� �Ѵ�. */


/* ���� 2.
�Ʒ��� ���� �л����� ������ �޾Ƽ� ����� ���ϴ� ���α׷��� �ۼ��غ���.

������ ����)

 �л��� ���� �Է��Ͻÿ� : 2

 �л� 1�� ������ �Է��ϼ��� : 20
 �л� 2�� ������ �Է��ϼ��� : 110
 �߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.
 �л� 2�� ������ �Է��ϼ��� : 30
 
 ���� ����� 25.0 �Դϴ�. */


/* ���� 3.
�Է°����� ������ �ð������� �� �� �ִ� ������׷��� ����� ���α׷��� �ۼ��Ͻÿ�.
�� ���α׷��� 1���� 100������ ���� 10���� �о�� �ϰ�, 1-10,11-20 ���� ������ ���
������ Ƚ���� �Ʒ��� ���� ����Ͽ��� �Ѵ�.

  1 - 10 : ****
 11 - 20 : **
 21 - 30 : *
 31 - 40 : **
 ..........
 .......... */


/* ���� 4.
�迭�� �̿��Ͽ� ������ ���� ���� �ý����� �ۼ��Ͽ� ����. ���� ���� �����̶� �¼���
10���ۿ� �� �ȴ�. ����ڰ� ������ �Ϸ��� �ϸ� ���� �¼� ��ġǥ�� �����ش�. ��, ������
���� �¼��� 1��, ������ �ȵ� �¼��� 0���� ��Ÿ����.

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


/* ���� 5.
ù��° �迭 arr1�� {10, 20, 30, 40, 50}�� ������ ��Ұ��� ������ �ִ�.
�ι�° �迭 arr2�� { 1,  2 ,  3  ,  4 ,  5 }�� ������ ��Ұ��� ������ �ִ�.
����° �迭 arr3�� ��Ұ��� arr1�� ��ҿ� arr2�� ��Ұ��� ���ʷ� ������
����� �����ϵ��� ���α׷��� �غ���. �� arr2�� ��Ҵ� �������� ���������� ����.
��, arr1�� 0�� ��ҿ� arr2�� 4�� ��Ҹ� ���ؼ� arr3�� 0�� ��ҿ� �����ϵ��� �ؾ��Ѵ�.
arr3�� 1�� ��ҿ��� arr1�� 1�� ��ҿ� arr2�� 3�� ��Ұ� �������� �Ѵٴ� ���̴�.

�̷��� arr3�� ��Ұ��� ��� �����ϰ� �� ���� ���ʴ�� ����غ���. */


/* ���� 6.
���̰� 25�� ������ �迭�� ������. �׸��� �� �迭�� �� ��ҿ� 1���� 25���� 25���� ��������
Random�ϰ� ����ǵ��� ���α׷��� �Ͻÿ�. ��, �迭�ȿ� ����� Random���� �ߺ��� ���ڰ�
������ �ȵȴ�. ������ ����� ���ԵǾ� �ִ��� �˾ƺ��� ���� 1�ٿ� 5���� 5�ٷ� �� �迭�� ��Ҹ�
�ε��� ������� ����غ���. */