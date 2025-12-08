package curriculum_B.Question5;

public class Question5 {

	public static void main(String[] args) { // 実行メイン
		System.out.print("Q1 実行結果 : ");
		helloWorld();// Q1 実行
		
		System.out.print("Q2 実行結果 : ");
		doubleValue(10);
		
		System.out.print("Q3-1 実行結果 : ");
		isEven(10);
		System.out.print("Q3-2 実行結果 : ");
		isEven(7);
	}
	
	public static void helloWorld(){ // Q1 helloWorldメソッド
		System.out.println("HelloWorld!");
		
	}
	
	public static void doubleValue(int num) { // Q2 doubleValueメソッド
		System.out.println(num + "を２倍すると" + num*2 + "です");
		
	}
	
	public static void isEven(int num) { // Q3 isEvenメソッド
		if(num % 2 == 0 ) {
			System.out.println(num + "は偶数です");
		}else {
			System.out.println(num + "は奇数です");
		}
		
	}

}
