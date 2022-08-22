public class Employee {
    private String nameEmployee;
    private int id;
    private int department;
    private double salary;
    private static int counter;

    public Employee(String nameEmployee, int department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
        id = ++ counter;
    }

    @Override
    public String toString() {
        return "Список сотрудников: " + nameEmployee + '\'' +
                ", id=" + id +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static void printEmployee(){

    }

    public int getId(){
        return id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
