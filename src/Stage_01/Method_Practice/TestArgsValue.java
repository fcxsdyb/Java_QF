package Stage_01.Method_Practice;

public class TestArgsValue {
	
	public static void main(String[] args) {
		
		int i = 10;
		TestArgsValue tv = new TestArgsValue();
		tv.method1(i);
		System.out.println("i=" + i);
		
		System.out.println();
		Demo d = new Demo();
		System.out.println(d);
		tv.method2(d);
		System.out.println("d.i = " + d.i);
		
	}
	
	public void method1(int i){
		System.out.println("i=" + i++);
	}
	
	public void method2(Demo d){
		System.out.println(d);
		System.out.println("d.i : " + d.i++);
	}

}

class Demo{
	
	int i = 5;
	
}

