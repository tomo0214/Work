package curriculum_B.objectQuestion.Object4;

public abstract class Employee {
protected String employeeId;
protected String name;

	public Employee(String id, String name) {
		this.employeeId = id;
        this.name = name;
	}


	public void work() { 
		System.out.println(name + "は働いています。");
	}

	public void showInfo() { 
		System.out.println("社員ID:" + employeeId + ",名前:" + name);

	}

	public void setEmployeeId(String id) { 
		this.employeeId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getName() {
		return this.name;
	}
	
	
    public abstract int calculateDailyWage(int hoursWorked); // 抽象メソッド（サブクラスで必ず実装）

}

