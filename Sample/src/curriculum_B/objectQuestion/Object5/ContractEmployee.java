package curriculum_B.objectQuestion.Object5;

class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000; // 時給
		return hoursWorked * hourlyRate;
	}
}
