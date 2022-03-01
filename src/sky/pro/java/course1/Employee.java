package sky.pro.java.course1;

public class Employee {
    private FullNameOfEmloyee nameOfEmployee;
    private Department departmentOfEmloyee;
    private float salaryOfEmloyee;

    public Employee(FullNameOfEmloyee nameOfEmployee, Department departmentOfEmloyee, float salaryOfEmloyee) {
        this.nameOfEmployee = nameOfEmployee;
        this.departmentOfEmloyee = departmentOfEmloyee;
        this.salaryOfEmloyee = salaryOfEmloyee;
    }
}
