package curriculum_B;

public class Main {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		System.out.println("Q4 実行結果 : ");
		greeting.sayHello();

		System.out.println("Q5 実行結果 : ");
		Animal animal = new Animal();

		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		System.out.println("動物名 : " + animal.getName());
		System.out.println("体長 : " + animal.getLength() + "m");
		System.out.println("速度 : " + animal.getSpeed() + "km/h");

	}

}
