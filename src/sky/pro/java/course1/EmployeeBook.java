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
        Employee newEmployee = new Employee(fullName, department, salary, position, id);
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] == null) {
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

    public void indexSalary(float ratioOfIndexing) {
        System.out.println("Платёжно-расчетная ведомость.");
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] != null) {
                float newSalary = staffOfEmployee[i].getSalary() + staffOfEmployee[i].getSalary() * (ratioOfIndexing / 100);
                staffOfEmployee[i].setSalary(newSalary);
                System.out.println(staffOfEmployee[i].toStringNameWithSalary());
            }
        }
    }

    public void dataOfDepartment(int numberOfDepartment) {
        EmployeeBook employeeOfDepartment = new EmployeeBook();
        int sizeOfDepartment = 0;
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] != null) {
                if (staffOfEmployee[i].getDepartment().getNumberOfDepartment() == numberOfDepartment) {
                    employeeOfDepartment.addEmployee(staffOfEmployee[i].getFullName(), staffOfEmployee[i].getDepartment(), staffOfEmployee[i].getSalary(), staffOfEmployee[i].getPosition(), staffOfEmployee[i].getId());
                    sizeOfDepartment++;
                }
            }
        }
        System.out.println("В отделе " + employeeOfDepartment.staffOfEmployee[0].getDepartment().toString() + ":");
        Employee employeeOfDepartmentWithMinSalary = null;
        employeeOfDepartmentWithMinSalary = employeeOfDepartment.staffOfEmployee[0];
        for (int j = 1; j < sizeOfDepartment; j++) {
            if (employeeOfDepartment.staffOfEmployee[j].getSalary() < employeeOfDepartmentWithMinSalary.getSalary()) {
                employeeOfDepartmentWithMinSalary = employeeOfDepartment.staffOfEmployee[j];
            }
        }
        System.out.println("Минимальная заработная плата у сотрудника: " + employeeOfDepartmentWithMinSalary.toStringNameWithSalary());

        Employee employeeOfDepartmentWithMaxSalary = null;
        employeeOfDepartmentWithMaxSalary = employeeOfDepartment.staffOfEmployee[0];
        for (int k = 1; k < sizeOfDepartment; k++) {
            if (employeeOfDepartment.staffOfEmployee[k].getSalary() > employeeOfDepartmentWithMaxSalary.getSalary()) {
                employeeOfDepartmentWithMaxSalary = employeeOfDepartment.staffOfEmployee[k];
            }
        }
        System.out.println("Максимальная заработная плата у сотрудника: " + employeeOfDepartmentWithMaxSalary.toStringNameWithSalary());

        employeeOfDepartment.calculateAllSalaries();
        employeeOfDepartment.calculateMediumSalary();
    }

    public void indexSalaryOfDepartment(int numberOfDepartment, float ratioOfIndexing) {
        EmployeeBook employeeOfDepartment = new EmployeeBook();
        int sizeOfDepartment = 0;
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] != null) {
                if (staffOfEmployee[i].getDepartment().getNumberOfDepartment() == numberOfDepartment) {
                    employeeOfDepartment.addEmployee(staffOfEmployee[i].getFullName(), staffOfEmployee[i].getDepartment(), staffOfEmployee[i].getSalary(), staffOfEmployee[i].getPosition(), staffOfEmployee[i].getId());
                    sizeOfDepartment++;
                }
            }
        }
        System.out.println("В отделе " + employeeOfDepartment.staffOfEmployee[0].getDepartment().toString() + " проиндексирована заработная плата на " + ratioOfIndexing + " %:");
        employeeOfDepartment.indexSalary(ratioOfIndexing);
    }

    public void printStaffOfDepartment(int numberOfDepartment) {
        EmployeeBook employeeOfDepartment = new EmployeeBook();
        int sizeOfDepartment = 0;
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i] != null) {
                if (staffOfEmployee[i].getDepartment().getNumberOfDepartment() == numberOfDepartment) {
                    employeeOfDepartment.addEmployee(staffOfEmployee[i].getFullName(), staffOfEmployee[i].getDepartment(), staffOfEmployee[i].getSalary(), staffOfEmployee[i].getPosition(), staffOfEmployee[i].getId());
                    sizeOfDepartment++;
                }
            }
        }
        System.out.println("В отделе " + employeeOfDepartment.staffOfEmployee[0].getDepartment().toString() + " работают следующие сотрудники:");
        for (int j = 0; j < sizeOfDepartment; j++) {
            System.out.println(employeeOfDepartment.staffOfEmployee[j].toStringNameWithSalary());
        }
    }

    public void levelOfSalary(float level) {
        System.out.println("Заработная плата ниже заданного уровня у следущих сотрудников: ");
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if(staffOfEmployee[i] != null) {
                if (staffOfEmployee[i].getSalary() < level) {
                    System.out.println(staffOfEmployee[i].toStringNameWithSalary());;
                }
            }
        }
        System.out.println();
        System.out.println("Заработная плата на заданном уровн или выше у следущих сотрудников: ");
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if(staffOfEmployee[i] != null) {
                if (staffOfEmployee[i].getSalary() >= level) {
                    System.out.println(staffOfEmployee[i].toStringNameWithSalary());;
                }
            }
        }
    }

    public void disMiss (String name) {
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if (staffOfEmployee[i].getFullName().equals(name)) {
                staffOfEmployee[i] = null;
                sizeOfStaff--;
                System.out.println(name + " уволен.");
                return;
            }
        }
    }

    public void moveEmployee(String name, int department, String position, float salary) {
        for (int i = 0; i < staffOfEmployee.length; i++) {
            if(staffOfEmployee[i] != null) {
                if (staffOfEmployee[i].getFullName().equals(name)) {
                    staffOfEmployee[i].getDepartment().setNumberOfDepartment(department);
                    staffOfEmployee[i].setPosition(position);
                    staffOfEmployee[i].setSalary(salary);
                    System.out.println(name + " переведен в отдел " + staffOfEmployee[i].getDepartment().toString() + " на должность " + position + " с окладом " + salary + " руб.");
                    return;
                }
            }
        }
    }

    public int getSizeOfStaff () {
            return sizeOfStaff;
        }
    }
