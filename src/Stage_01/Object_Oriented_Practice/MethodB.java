package Stage_01.Object_Oriented_Practice;

import java.util.Arrays;

public class MethodB {

	public int max(int a, int b) {
		return Math.max(a, b);
	}

	// �����ʽ�����Դ������һ��Ҳ���Բ���
	// �����б�ֻ����һ����εĲ���
	// ��εĲ���ֻ�ܷ��ڲ����б������
	public double max(String b, boolean c, int d, char m, double... a) {
		if (a != null) {
			Arrays.sort(a);
			return a[a.length - 1];
		}
		return -1;
	}

//	
//	public double max(double[] a) {
//		
//		return 0;
//	}
	public static void main(String[] args) {
		MethodB m = new MethodB();
		double max = m.max("a", false, 10, 'a', 120.1, 10.2, 320.3);
		System.out.println(max);
	}

}
