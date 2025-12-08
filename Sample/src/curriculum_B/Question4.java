package curriculum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {

		// Q1 int型の配列を作成し、「1, 2, 3, 4, 5」を格納、順に表示
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		for (int n = 0; n < numbers.length; n++) {
			System.out.println(numbers[n]);
		}

		// Q2 int型の配列に「10, 20, 30, 40, 50」を格納、逆順に表示
		int[] scores = { 10, 20, 30, 40, 50 };

		for (int s = scores.length - 1; s >= 0; s--) {
			System.out.println(scores[s]);
		}

		// Q3 int型の配列に「3, 5, 7, 9, 11」を格納
		int[] oddNumbers = { 3, 5, 7, 9, 11 };
		int sum = 0;

		for (int o = 0; o < oddNumbers.length; o++) {
			sum += oddNumbers[o];
		}
		System.out.println(sum); // 合計値を出力

		// Q4 int型の配列に「12, 7, 9, 21, 5, 18」を格納
		int[] randNumbers = { 12, 7, 9, 21, 5, 18 };

		int max = Arrays.stream(randNumbers).max().getAsInt();
		int min = Arrays.stream(randNumbers).min().getAsInt();

		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

		// Q5 int型の配列に「 1, 2, 3, 4, 5 」を格納
		int[] numbers2 = { 1, 2, 3, 4, 5 };

		// 要素の値を2倍にし表示
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] *= 2;
		}
		for (int num : numbers2) {
			System.out.println(num);
		}

		// Q6 int型の配列に「4, 7, 10, 15, 20」を格納
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers3 = {4, 7, 10, 15, 20};

		System.out.print("数値を入力してください: ");
		int input = scanner.nextInt();

		// 入力した数字が配列に含まれているか確認
		boolean found = false;
		for (int num : numbers3) {

			if (num == input) {
				found = true;
				break;
			}
		}
		// 確認後、結果の表示
		if (found) {
			System.out.println("結果: 「" + input + "」は配列に含まれています");
		} else {
			System.out.println("結果: 「" + input + "」は配列に含まれていません");
		}

		// Q7 2次元配列{{1, 2}, {3, 4}, {5, 6}}を用意
		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		// すべての要素を表示
		for (int ar = 0; ar < array.length; ar++) {
			for (int j = 0; j < array[ar].length; j++) {
				System.out.print(array[ar][j] + " ");
			}
			System.out.println();
		}

		// Q8 = 2次元配列{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}を用意
		int[][] array2 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};

		// 計算
		int sum2 = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum2 += array2[i][j];
			}
		}
		// すべての要素の合計を表示
		System.out.println("合計値: " + sum2);

		// Q9 {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}を用意する

		int[][] array3 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};

		// 最大値と最小値の
		int max2 = array3[0][0];
		int min2 = array3[0][0];

		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				if (array3[i][j] > max2) {
					max2 = array3[i][j];
				}
				if (array3[i][j] < min2) {
					min2 = array3[i][j];
				}
			}
		}

		// 結果を表示
		System.out.println("最大値: " + max2);
		System.out.println("最小値: " + min2);

		// Q10 
		int[][][] array4 = {
				{ { 1, 2 }, { 3, 4 } },
				{ { 5, 6 }, { 7, 8 } }
		};

		// すべての要素を表示させるループ
		for (int i = 0; i < array4.length; i++) { 
			for (int j = 0; j < array4[i].length; j++) { 
				for (int k = 0; k < array4[i][j].length; k++) {
					System.out.print(array4[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("----");
		}

		scanner.close();

	}
}