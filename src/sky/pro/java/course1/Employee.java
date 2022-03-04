package sky.pro.java.course1;

public class Employee {

    private final String fullName;
    private Department department;
    private float salary;
    private String position;
    private int id;

    public Employee(String fullName, Department department, float salary, String position, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.position = position;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }



    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ". " + fullName + ". " + position + ". Отдел: " + department + ", заработная плата: " + salary + "руб.";
    }

    public String toStringFullName() {
        return id + ". " + fullName + ". ";
    }
}