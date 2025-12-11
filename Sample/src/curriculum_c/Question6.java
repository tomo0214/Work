package curriculum_c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {

			{
				System.out.print("グー(0), チョキ(1), パー(2) を入力:");
				int select = scanner.nextInt();
				switch (select) {
				case 0: {
					System.out.println("あなたの手: グー");
					break;
				}
				case 1: {
					System.out.println("あなたの手: チョキ");
					break;

				}
				case 2: {
					System.out.println("あなたの手: パー");
					break;
				}
				default:
					System.out.println("不正な入力です");
					return;
				}

				int CPUselect = random.nextInt(3);

				switch (CPUselect) {
				case 0: {
					System.out.println("ＣＰＵの手: グー");
					break;
				}
				case 1: {
					System.out.println("ＣＰＵの手: チョキ");
					break;

				}
				case 2: {
					System.out.println("ＣＰＵの手: パー");
					break;
				}

				}
				if (select == CPUselect) {
					System.out.println("あいこ！もう一度！");
				} else if ((select == 2 && CPUselect == 0) ||
						(select == 0 && CPUselect == 1) ||
						(select == 1 && CPUselect == 2)) {
					System.out.println("あなたの勝ち！");
					break;
				} else {
					System.out.println("あなたの負け！");
					return;
				}
			}

			scanner.close();
		}
	}
}
