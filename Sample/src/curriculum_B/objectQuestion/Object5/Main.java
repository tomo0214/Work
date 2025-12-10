package curriculum_B.objectQuestion.Object5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(); //社員をリストで管理

		//社員をリストに追加
		employees.add(new FullTimeEmployee("A001", "吉田"));
		employees.add(new FullTimeEmployee("A002", "坂本"));
		employees.add(new FullTimeEmployee("A003", "神谷"));
		employees.add(new ContractEmployee("B001", "安井"));
		employees.add(new ContractEmployee("B002", "赤城"));
		employees.add(new ContractEmployee("B003", "青木"));

		int hoursWorked = 9; //労働時間
		for (Employee emp : employees) {
			int wage = emp.calculateDailyWage(hoursWorked);
			System.out.println("社員ID：" + emp.id + " 名前：" + emp.name + " 給与" + wage + "円");

		}

	}

}
