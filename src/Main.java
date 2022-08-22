public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Pavel Ivanovich", 4, 250_000);
        employees[1] = new Employee("Ivanov Andrey Ivanovich", 2, 270_000);
        printEmployees();
        System.out.println(getEmployeeMinSalary());
        printNameEmployee();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = 0;
        Employee minSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
                index = i;
                break;
            }
        }
        if (minSalaryEmployee == null) return null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmployee = employees[i];
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                index = i;
                break;
            }
        }
        if (maxSalaryEmployee == null) return null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary > employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }
    public static double getCalculateAverageSalary() {
        double sumSalary = getCalculateSumSalary();
        if (employees.length !=0) {
            return sumSalary / employees.length;
        }else {
            return 0;
        }
    }
    public static void printNameEmployee(){
        for (int i=0; i<employees.length; i++) {
            if (employees[i] != null){
                System.out.println(employees[i].getNameEmployee());
            }
        }
    }
}