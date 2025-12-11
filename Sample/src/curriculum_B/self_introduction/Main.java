package curriculum_B.self_introduction;

class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60); // Q5 weight「60」追加

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		System.out.println(); // 出力結果が見やすくなるように改行

		person1.print();

		// Q10 人数の合計を出力
		System.out.println("合計" + Person.count + "人です。");

	}

}
