package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		
		// 変数の初期化
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean Boolean;
		
		// 変数に代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		Boolean = true;
		
		// Q3の出力
		System.out.println( byteNum + shortNum + intNum + longNum);
		System.out.println( byteNum + byteNum);
		System.out.println( letter + " " + letters + " " + Boolean);
		
		double Number00 = byteNum + shortNum + intNum + longNum + floatNum + doubleNum ;
		System.out.println( (long)Number00 );
		
		long Number01 = byteNum * shortNum * intNum * longNum;
		System.out.printf( "%.0E%n", (double) Number01 );
		
		System.out.println( doubleNum / shortNum );
		System.out.println( byteNum - shortNum );
		
		// Q4
		String name = "山田太郎";
		System.out.println( "こんにちは、" + name + "さん！" );
		
		// Q5
		int age = 25;
		System.out.println( "年齢：" + age + "歳");
		
		// Q6
		int Num1 = 10;
		int Num2 = 5;
		int sum = Num1 + Num2 ;
		System.out.println( sum );
		
		// Q7
		int score = 80;
		score = score + 20;
		System.out.println( "最終スコア：" + score );
		
		// Q8
		double price = 99.99;
		System.out.println((int)price);
		
		
		// Q9
		String  numStr = "123";
		int num00 = Integer.parseInt(numStr);
		System.out.println(num00+10);
		
		// Q10
		int num01 = 50 ;
		String Str01 =   String.valueOf(num01);
		System.out.println("得点：" + Str01 + "点");
		
		// Q11
		int a = 10;
		int b = 20;
		boolean result = a > b ;
		System.out.println(result);
		
		// Q12
		int x = 15;
		String xNum = ( x >= 10) ? "OK" : "NG" ;
		System.out.println(xNum);
		
		//Q13
		String text = "私はJavaが好きです。Javaは楽しい!";
		String text2 = text.replace("Java", "Python");
        System.out.println(text2);

	}

}
