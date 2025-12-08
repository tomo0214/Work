package curriculum_B.objectQuestion;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.name = "山田太郎";
		employee.work();// ①基本概念の実行

		employee.employeeid = "E001";
		employee.name = "佐藤太郎";
		employee.showInfo();// ②クラスとオブジェクトの実行

		employee.setEmployeeId("E002");
		employee.setName("山田花子");// ③カプセル化の実行
		System.out.println("社員ID:" + employee.getEmployeeId() + ",名前:" + employee.getName());

	}

}
