package curriculum_B.objectQuestion.Object7;

public class Main {
    public static void main(String[] args) {
        Payable e1 = new FullTimeEmployee("佐藤", 9); 
        Payable e2 = new ContractEmployee("田中", 9);

        SalaryCalculator calculator = new SalaryCalculator();
        ReportPrinter printer = new ReportPrinter();

        printer.print(e1, calculator.calculate(e1));
        printer.print(e2, calculator.calculate(e2));
    }
}