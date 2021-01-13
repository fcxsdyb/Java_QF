package Stage_01.Method_Practice;

public class P1 {

	public static void main(String[] args){ 
		
		int[] a=new int[1]; 
		modify(a); 
		System.out.println(a[0]);
		
	}
	
	public static void modify(int[] a){ 
		a[0]++;
	} 


}
