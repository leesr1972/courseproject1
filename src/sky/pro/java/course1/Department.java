package sky.pro.java.course1;

public class Department {
    private int numberOfDepartment;
    private String nameOfDepartment;

    public Department(int numberOfDepartment, String nameOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
        this.nameOfDepartment = nameOfDepartment;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    @Override
    public String toString() {
        return nameOfDepartment;
    }
}
