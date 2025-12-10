package curriculum_B.objectQuestion.Object3;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(); // Employeeオブジェクト生成
		emp.setEmployeeId("E002"); // IDを設定
		emp.setName("田中花子"); // 名前を設定

		System.out.println("社員ID: " + emp.getEmployeeId() + ", 名前: " + emp.getName());

	}

}
