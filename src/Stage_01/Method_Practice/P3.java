package Stage_01.Method_Practice;

public class P3 {

	public static void main(String[] args){
		
		int x = 1;
		for(show('a'); show('b') && x<3; show('c')){
			show('d'); 
			x++;
		}
		
	}
	
	public static boolean show(char ch){
		System.out.print(ch);
		return true;
	}

}
