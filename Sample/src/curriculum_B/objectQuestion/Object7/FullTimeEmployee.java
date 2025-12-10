package curriculum_B.objectQuestion.Object7;

//正社員クラス
class FullTimeEmployee extends Employee {
 public FullTimeEmployee(String name, int hours) {
     super(name, hours);
 }

 @Override
 public int calculatePay() {
     return getHours() * 1200;
 }
}
