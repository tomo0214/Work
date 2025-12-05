package curriculum_B;

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
	}
}
