
package curriculum_B;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		/* Q1
		 * 変数名score int型に「75」を代入
		 * scoreが60以上なら「合格です！」を表示
		 */

		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		/* Q2
		 * 変数名age int型に「25」を代入
		 */
		int age = 25;
		if (age >= 20 && age < 30) { // age が 20 以上 30 以下なら "適正年齢です" と表示
			System.out.println("適正年齢です");
		} else { // それ以外の場合は "対象外です" と表示
			System.out.println("対象外です");
		}

		/* Q3
		 * int 型の変数 age1 に 18 を代入
		 */
		int age1 = 18;
		if (age1 >= 20) { // age が 20 以上なら "成人です" と表示
			System.out.println("成人です");
		} else if (age1 >= 13) { // age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
			System.out.println("ティーンエイジャーです");
		} else { // age が 12 以下なら "子供です" と表示
			System.out.println("子供です");
		}

		/* Q4
		 * 変数名x, y, z に「30」,「15」,「50」
		 */
		int x = 30;
		int y = 15;
		int z = 50;

		//3つの数字から最大値を判定
		int max;
		if (x >= y && x >= z) {
			max = x;
		} else if (y >= x && y >= z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println("最大値は " + max + " です。");

		/* Q5
		 * 変数名num コンソール入力 
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("数値を入力してください: ");
		int num = scanner.nextInt(); // int型の変数 num に代入

		if (num > 0) { //num の値が 0 より大きければ "正の数です" と表示
			System.out.println("正の数です");
		} else if (num == 0) { //num の値が 0 なら "0 です" と表示
			System.out.println("0です");
		} else { //num の値が 0 より小さければ "負の数です" と表示
			System.out.println("負の数です");
		}

		/* Q6
		 * int 型の変数 value を用意　コンソール入力でいずれかの値を代入
		 */
		System.out.print("数値を入力してください: ");
		int value = scanner.nextInt(); // int型の変数 num に代入

		if (value % 2 == 0) { //value が 偶数 なら "偶数です" と表示
			System.out.println("偶数です");
		} else { //value が 奇数 なら "奇数です" と表示
			System.out.println("奇数です");
		}

		/* Q7
		 *  int 型の変数 score3 にコンソール入力で 0 から 100 のいずれかの数値を代入
		 */
		System.out.print("0から100の間で数値を入力してください: ");
		int score3 = scanner.nextInt();

		if (score3 >= 90) { //90 以上なら "優"
			System.out.println("優");
		} else if (score3 >= 70) { //70 以上なら "良"
			System.out.println("良");
		} else if (score3 >= 50) { //50 以上なら "可"
			System.out.println("可");
		} else { // 50 未満なら "不可"　を表示
			System.out.println("不可");
		}

		/* Q8
		 * コンソール入力が null または空文字（""）のときに「入力が無効です」と表示する
		 */
		scanner.nextLine(); 
		
		System.out.print("文字列を入力してください: ");
		String input = scanner.nextLine();  
		
        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力された値: " + input);
        }
		
		
		
		
		
		
		
		
		

		scanner.close(); // Scannerを閉じる
	}
}
