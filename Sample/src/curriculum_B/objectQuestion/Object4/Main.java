package curriculum_B.objectQuestion.Object4;

public class Main {

	public static void main(String[] args) {
		//IDと名前で該当の人物を確定させる
		Employee fulltime = new FullTimeEmployee("A001","正社員");
		Employee parttime = new PartTimeEmployee("B001","パート社員");
		
		// 労働時間
		int fulltimewage = fulltime.calculateDailyWage(9); 
		int parttimewage = parttime.calculateDailyWage(9);
		
		
		System.out.println(fulltime.getName() + "の給与：" + fulltimewage +"円");
		System.out.println(parttime.getName() + "の給与：" + parttimewage +"円");
	}

}
