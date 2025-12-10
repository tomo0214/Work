package curriculum_B.objectQuestion.Object4;

public class PartTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1000; // 時給

	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;  // 割増賃金なしの時給計算

	}
}
