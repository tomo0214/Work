package curriculum_B.objectQuestion.Object5;

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250; // 時給
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);//残業後の割増賃金
	}
}
