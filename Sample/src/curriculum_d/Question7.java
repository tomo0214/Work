package curriculum_d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static Character loadDaemon(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String name = br.readLine();
		int hp = Integer.parseInt(br.readLine());
		int at = Integer.parseInt(br.readLine());
		int sp = Integer.parseInt(br.readLine());
		br.close();
		return new Character(name, hp, at, sp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		try {
			// Player作成
			System.out.print("勇者の名前を入力してください: ");
			String playerName = sc.nextLine();
			int hp = rand.nextInt(50) + 50; // HP: 50〜99
			int at = rand.nextInt(10) + 5; // AT: 5〜14
			int sp = rand.nextInt(10) + 1; // SP: 1〜10
			Character player = new Character(playerName, hp, at, sp);

			// Daemon読み込み
			Character daemon = loadDaemon("src/daemon_status.txt");

			// battle_log.txt 出力準備
			PrintWriter log = new PrintWriter(new FileWriter("battle_log.txt"));

			log.println("=== Battle Start ===");
			log.println(player);
			log.println(daemon);
			log.println();

			// 先攻決定
			Character attacker, defender;
			if (player.getSp() > daemon.getSp()) {
				attacker = player;
				defender = daemon;
			} else if (player.getSp() < daemon.getSp()) {
				attacker = daemon;
				defender = player;
			} else {
				if (rand.nextBoolean()) {
					attacker = player;
					defender = daemon;
				} else {
					attacker = daemon;
					defender = player;
				}
			}

			log.println("First attacker: " + attacker.getName());
			log.println();

			// バトル開始

			System.out.println(player.getName() + " HP: " + player.getHp());
			System.out.println(daemon.getName() + " HP: " + daemon.getHp());
			System.out.println();

			while (player.isAlive() && daemon.isAlive()) {
				attacker.attack(defender);
				log.println(attacker.getName() + " の攻撃！ " + defender.getName() + "は"
						+ attacker.getAt() + " ダメージを受けた！");

				// 各キャラクターの残りHPを表示
				System.out.println(player.getName() + " HP: " + player.getHp());
				System.out.println(daemon.getName() + " HP: " + daemon.getHp());

				System.out.println();

				if (!defender.isAlive()) {
					log.println(defender.getName() + "は倒れた！");
					System.out.println(defender.getName() + "は倒れた！");
					break;
				}

				// ターン交代
				Character temp = attacker;
				attacker = defender;
				defender = temp;
			}

			log.println("=== Battle End ===");
			log.close();
			System.out.println("戦闘終了！");

		} catch (IOException e) {
			System.out.println("デーモンテキストが見当たりません.");
		}
	}
}