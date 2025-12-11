package curriculum_B.self_introduction;

class Person {
	String name; // Q1 フィールド
	int age;
	double height;
	double weight; // Q4 weightを定義

	static int count = 0;

	Person(String name, int age, double height, double weight) { // Q2 コンストラクタ
		this.name = name; // Q3 各インスタンスフィールドに値をセット
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンス生成ごとに1ずつ増える
		count++;
	}

	public double bmi() { // Q6 インスタンスメソッド「bmi」を定義
		double bmi = weight / (height * height);
		return bmi; // Q7 インスタンスのBMIを返す
	}

	public void print() { // Q8 「print」を定義
		System.out.println("名前は" + this.name + "です。"); // thisを用いて出力
		System.out.println("年齢は" + this.age + "です。");
		System.out.printf("BMIは%.2fです。\n", this.bmi());
	}

}
