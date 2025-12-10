package curriculum_B.objectQuestion.Object6;

//Employee
public abstract class Employee implements Billable {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public abstract int costForDay(int hoursWorked);

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}