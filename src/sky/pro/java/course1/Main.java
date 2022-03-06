package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Department admDepartment = new Department(1, "Руководство");
        Department finDepartment = new Department(2, "Бухгалтерия");
        Department hrDepartment = new Department(3, "Отдел кадров");
        Department itDepartment = new Department(4, "Технический отдел");
        Department salesDepartment = new Department(5, "Отдел продаж");

        EmployeeBook newEmployee = new EmployeeBook();
        int id = 1;
        newEmployee.addEmployee("Петров Юрий Сергеевич", admDepartment, 200_000f, "Генеральный директор", id);
        id++;
        newEmployee.addEmployee("Якобсон Иосиф Абрамович", admDepartment, 180_000f, "Заместитель генерального директора", id);
        id++;
        newEmployee.addEmployee("Стивен Джексон", finDepartment, 180_000f, "Финансовый директор", id);
        id++;
        newEmployee.addEmployee("Ким Мария Вячеславовна", finDepartment, 150_000f, "Главный бухгалтер", id);
        id++;
        newEmployee.addEmployee("Мансурова Амира Ринатовна", hrDepartment, 150_000f, "Начальник отдела кадров", id);
        id++;
        newEmployee.addEmployee("Шевченко Ирина Николаевна", hrDepartment, 120_000f, "Инженер по организации труда", id);
        id++;
        newEmployee.addEmployee("Яцехиро Анимото", itDepartment, 180_000f, "Главный инженер", id);
        id++;
        newEmployee.addEmployee("Дорошенко Матвей Семенович", itDepartment, 150_000f, "Системный администратор", id);
        id++;
        newEmployee.addEmployee("Абдуллаев Бахром Саидович", itDepartment, 100_000f, "Инженер по АХЧ", id);
        id++;
        newEmployee.addEmployee("Григорян Ашот Назимович", salesDepartment, 180_000f, "Коммерческий директор", id);
        id++;
        newEmployee.addEmployee("Бочорошвили Георгий Гурамович", salesDepartment, 120_000f, "Инженер-маркетолог:)", id);
        id++;

        System.out.println();
        newEmployee.printAllStaff();

        System.out.println();
        newEmployee.calculateAllSalaries();

        System.out.println();
        newEmployee.findMinSalary();

        System.out.println();
        newEmployee.findMaxSalary();

        System.out.println();
        newEmployee.calculateMediumSalary();

        System.out.println();
        newEmployee.printFullNameOfAllEmployees();

        System.out.println();
        newEmployee.indexSalary(10f);

        System.out.println();
        newEmployee.dataOfDepartment(3);

        System.out.println();
        newEmployee.indexSalaryOfDepartment(4, 20f);

        System.out.println();
        newEmployee.printStaffOfDepartment(2);

        System.out.println();
        newEmployee.levelOfSalary(150_000f);

        System.out.println();
        newEmployee.disMiss("Яцехиро Анимото");

        System.out.println();
        newEmployee.moveEmployee("Дорошенко Матвей Семенович", 1, "Технический директор", 180_000f);
    }
}
