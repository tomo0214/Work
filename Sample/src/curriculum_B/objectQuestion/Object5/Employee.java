package curriculum_B.objectQuestion.Object5;

abstract class Employee {
	protected String id; // フィールド
	protected String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract int calculateDailyWage(int hoursWorked);
}
