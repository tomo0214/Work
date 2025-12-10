package curriculum_B.objectQuestion.Object6;

import java.util.ArrayList;
import java.util.List;
// メインクラス
public class Main {
    public static void main(String[] args) {
        List<Billable> employees = new ArrayList<>();

        // リストに追加
        employees.add(new FullTimeEmployee("F001", "佐藤"));
        employees.add(new FullTimeEmployee("F002", "鈴木"));
        employees.add(new ContractEmployee("C001", "田中"));
        employees.add(new ContractEmployee("C002", "山田"));

        int hoursWorked = 9;

        for (Billable emp : employees) {
            int wage = emp.costForDay(hoursWorked);
            Employee e = (Employee) emp;
            System.out.println("社員ID: " + e.getId() + ", 名前: " + e.getName() +
                               ", 勤務時間: " + hoursWorked + "h, 日給: " + wage + "円");
        }
    }
}