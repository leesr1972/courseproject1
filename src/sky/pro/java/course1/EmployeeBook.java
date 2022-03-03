package sky.pro.java.course1;

public class EmployeeBook {
    private Employee[] staffOfEmployee;
    private int sizeOfStaff;

    public EmployeeBook() {
        this.staffOfEmployee = new Employee[20];
    }
    public void addEmployee(String fullName, Department department, float salary, String position, int id) {
        if (sizeOfStaff >= staffOfEmployee.length) {
            System.out.println("Штат полностью сформирован. Новый сотрудник не может быть принят.");
        }
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] == null) {
                Employee newEmployee = new Employee(fullName, department, salary, position, id);
                staffOfEmployee[i] = newEmployee;
                sizeOfStaff++;
                return;
            }
        }
    }

    public void printAllStaff() {
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if(staffOfEmployee[i] != null) {
                System.out.println(staffOfEmployee[i].toString());
            }
        }
    }

    public int getSizeOfStaff() {
        return sizeOfStaff;
    }
}
