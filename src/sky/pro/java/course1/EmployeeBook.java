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
        System.out.println("Список всех сотрудников:");
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if(staffOfEmployee[i] != null) {
                System.out.println(staffOfEmployee[i].toString());
            }
        }
    }

    public void calculateAllSalaries() {
        float wageFund = 0;
        for (int j = 0; j < staffOfEmployee.length; j++) {
            if(staffOfEmployee[j] != null) {
                wageFund = wageFund + staffOfEmployee[j].getSalary();
            }
        }
        System.out.println("Фонд оплаты труда составляет " + wageFund + " руб.");
    }

    public void findMinSalary() {
        Employee employeeWithMinSalary = null;
        int k = 0;
        while (staffOfEmployee[k] == null) {
            k = k + 1;
        }
        employeeWithMinSalary = staffOfEmployee[k];
        for (k = k + 1; k < staffOfEmployee.length; k++) {
            if(staffOfEmployee[k] != null) {
                if (staffOfEmployee[k].getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = staffOfEmployee[k];
                }
            }
        }
        System.out.println("Минимальная заработная плата у сотрудника:");
        System.out.println(employeeWithMinSalary.toString());
    }

    public void findMaxSalary() {
        Employee employeeWithMaxSalary = null;
        int k = 0;
        while (staffOfEmployee[k] == null) {
            k = k + 1;
        }
        employeeWithMaxSalary = staffOfEmployee[k];
        for (k = k + 1; k < staffOfEmployee.length; k++) {
            if(staffOfEmployee[k] != null) {
                if (staffOfEmployee[k].getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = staffOfEmployee[k];
                }
            }
        }
        System.out.println("Максимальная заработная плата у сотрудника:");
        System.out.println(employeeWithMaxSalary.toString());
    }

    public void calculateMediumSalary() {
        float wageFund = 0;
        for (int j = 0; j < staffOfEmployee.length; j++) {
            if(staffOfEmployee[j] != null) {
                wageFund = wageFund + staffOfEmployee[j].getSalary();
            }
        }
        float mediumSalary = wageFund / sizeOfStaff;
        System.out.println("Средняя заработная плата составляет " + mediumSalary + " руб.");
    }

    public void printFullNameOfAllEmployees() {
        System.out.println("Поименный список всех сотрудников:");
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] != null) {
                System.out.println(staffOfEmployee[i].toStringFullName());
            }
        }
    }

    public int getSizeOfStaff() {
        return sizeOfStaff;
    }
}
