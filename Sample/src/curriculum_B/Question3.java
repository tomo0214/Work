package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// Q1 for文を使用して1から10まで1つずつ表示
		for (int i1 = 1; i1 <= 10; i1++) {
			System.out.println(i1);
		}

		// Q2 for文を使用して1から20までの偶数を1つずつ表示
		for (int i2 = 1; i2 <= 20; i2++) {
			if (i2 % 2 == 0) {
				System.out.println(i2);
			}
		}

		// Q3 for文を使用してカウントダウン形式で10から1まで表示
		for (int i3 = 10; i3 >= 1; i3--) {
			System.out.println(i3);
		}

		// Q4 for文を使用して1から100までの合計を表示
		int sum = 0;
		for (int i4 = 1; i4 <= 100; i4++) {
			sum += i4;
		}
		System.out.println(sum);

		// Q5 for文を使用して★で三角形を作成
		int x = 5;
		for (int i5 = 1; i5 <= x; i5++) {
			for (int j = 1; j <= i5; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}

		// Q6 while文を使って1から10まで1つずつ表示
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		// Q07 while文を使って1から20までの偶数を1つずつ表示
		int count2 = 1;
		while (count2 <= 20) {
			if (count2 % 2 == 0) {
				System.out.println(count2);
			}
			count2++;
		}

		// Q08 while文を使ってカウントダウン形式で10から1まで表示
		int count3 = 10;
		while (count3 >= 1) {
			System.out.println(count3);
			count3--;
		}

		// Q9 while文を使用して1から100までの合計を表示
		int sum2 = 0;
		int count4 = 1;
		while (count4 <= 100) {
			sum2 += count4;
			count4++;
		}
		System.out.println(sum2);

		// Q10 数値をコンソール入力
		Scanner scanner = new Scanner(System.in);
		int num1;

		while (true) { //「0」が入力されるまで繰り返す
			System.out.print("数字を入力： ");
			num1 = scanner.nextInt();

			if (num1 == 0) { //「0」が入力されたら「終了しました」を表示
				System.out.println("終了しました");
				break;
			}
		}

		//Q11 for文を使用して九九表を作成する
		int z = 0;
		for (int x1 = 1; x1 <= 9; x1++) {
			for (int y1 = 1; y1 <= 9; y1++) {
				z = x1 * y1;

				if (y1 == 9) {
				} else {
					System.out.print(" || ");
				}
			}
			System.out.println("");
		}

		//Q12 入力したシステムの残り台数が表示さえれるシステム
		Random rand = new Random();

		System.out.print("商品の入力：");
		scanner.nextLine();
		String input = scanner.nextLine();

		String[] products = input.split("、");

		for (String product : products) {

			switch (product) { //パソコン、冷蔵庫、扇⾵機、洗濯機、加湿器
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int stock = rand.nextInt(12);
				System.out.println(product + "の残り台数は" + stock + "台です");
				break;

			case "テレビ": //テレビ、ディスプレイ
			case "ディスプレイ":
				int tvStock = rand.nextInt(12);
				int displayStock = 11 - tvStock;

				String tvMsg = (product.equals("テレビ"))
						? "テレビの残り台数は" + tvStock + "台です\nディスプレイの残り台数は" + displayStock + "台です"
						: "ディスプレイの残り台数は" + displayStock + "台です\nテレビの残り台数は" + tvStock + "台です";

				System.out.println(tvMsg);
				break;

			default: //その他
				System.out.println("『" + product + "』は指定の商品ではありません");
			}
		}

		scanner.close();

	}

}