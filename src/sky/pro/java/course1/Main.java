package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Department admDepartment = new Department(1, "Руководство");
        Department finDepartvent = new Department(2, "Бухгалтерия");
        Department hrDepartment = new Department(3, "Отдел кадров");
        Department itDepartment = new Department(4, "Технический отдел");
        Department salesDepartment = new Department(5, "Отдел продаж");

        EmployeeBook empl = new EmployeeBook();
        int id = 1;
        empl.addEmployee("Петров Юрий Сергеевич", admDepartment, 200_000f, "Генеральный директор", id);
        id++;
        empl.addEmployee("Якобсон Иосиф Абрамович", admDepartment, 180_000f, "Заместитель генерального директора", id);
        id++;

        empl.printAllStaff();
    }
}
