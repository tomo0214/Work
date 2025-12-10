package curriculum_B.objectQuestion.Object7;

//契約社員クラス
class ContractEmployee extends Employee {
 public ContractEmployee(String name, int hours) {
     super(name, hours);
 }

 @Override
 public int calculatePay() {
     return getHours() * 1000;
 }
}
