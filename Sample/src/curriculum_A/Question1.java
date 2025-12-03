package curriculum_A;

public class Question1 {

	public static void main(String[] args) {

		// 変数の初期化
		byte byteNum = 0 ;
		short shortNum = 0 ;
		int intNum = 0 ;
		long longNum = 0L ;
		float floatNum = 0.0f ;
		double doubleNum = 0.0 ;
		char letter = '\u0000';
		String letters = null;
		boolean Boolean = false;

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

		/* Q3
		 * 上記Q2の値を代入した変数を用いて出力
		*/
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum + byteNum);
		System.out.println(letter + " " + letters + " " + Boolean);

		double Number00 = byteNum + shortNum + intNum + longNum + floatNum + doubleNum;
		System.out.println((long) Number00);

		long Number01 = byteNum * shortNum * intNum * longNum;
		System.out.printf("%.0E%n", (double) Number01);

		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);

		/* Q4
		 * 変数名name String型で「山田太郎」を代入しテキストとともに出力
		*/
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");

		/* Q5 
		 * 変数名age int型で「25」を代入しテキストとともに出力
		*/
		int age = 25;
		System.out.println("年齢：" + age + "歳");

		/* Q6 
		 * 変数名Num1 int型で「10」を代入
		 * 変数名Num2 int型で「5」を代入
		 * Num1とNum2の合計を変数名sumに代入し出力
		*/
		int Num1 = 10;
		int Num2 = 5;
		int sum = Num1 + Num2;
		System.out.println(sum);

		/* Q7
		 * 変数名score int型で「80」を代入
		 * scoreに「20」を追加し、テキストとともに出力
		*/
		int score = 80;
		score += 20;
		System.out.println("最終スコア：" + score);

		/* Q8 
		 * 変数名price　double型で「99.99」を代入
		 * priceをint型に変換し「99」で出力
		*/
		double price = 99.99;
		System.out.println((int) price);

		/* Q9
		 * 変数名numStr　String型で「123」を代入
		 * numStrをint型に変換し、値に10を追加して出力
		*/
		String numStr = "123";
		int num00 = Integer.parseInt(numStr);
		System.out.println(num00 + 10);

		/* Q10
		 * 変数名num int型に「50」を代入
		 * numをString型に変換し、テキストとともに出力
		*/
		int num = 50;
		String Str01 = String.valueOf(num);
		System.out.println("得点：" + Str01 + "点");

		/* Q11
		 * int 型の変数 a に 10 を代入
		 * int 型の変数 b に 20 を代入
		 * a が b より小さいかどうかを boolean 変数 result に代入
		 * result の値を出力	       
		*/
		int a = 10;
		int b = 20;
		boolean result = a > b;
		System.out.println(result);

		/* Q12
		 * 変数名xに「15」を代入
		 * 条件演算子を使用し、x が 10 以上なら "OK"、そうでなければ "NG" を出力		   
		*/
		int x = 15;
		String xNum = (x >= 10) ? "OK" : "NG";
		System.out.println(xNum);

		/*Q13 
		 * String text = "私はJavaが好きです。Javaは楽しい!";という
		 * 文章の中にある 「Java」 を 「Python」 に置き換えて出力させてください。
		 */
		String text = "私はJavaが好きです。Javaは楽しい!";
		String text2 = text.replace("Java", "Python");
		System.out.println(text2);

	}

}
