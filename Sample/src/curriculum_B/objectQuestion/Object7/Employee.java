package curriculum_B.objectQuestion.Object7;

//社員の共通的な属性を持つ抽象クラス
abstract class Employee implements Payable {
 private String name;
 private int hours;

 public Employee(String name, int hours) {
     this.name = name;
     this.hours = hours;
 }

 public String getName() { return name; }
 public int getHours() { return hours; }
}