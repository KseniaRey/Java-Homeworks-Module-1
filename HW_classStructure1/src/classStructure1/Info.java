package classStructure1;

import java.util.*;

public class Info {
    /*- checker() - на вход сотрудника, на выходе String в зависимости от позишн
  - avgSalary() - на вход департамент, на выход средняя зп по департаменту
  - maxSalary() - на вход департамент, на выход max зп по департаменту + у кого такая зп(имя)
  - minSalary() - на вход департамент, на выход min зп по департаменту + у кого такая зп(имя)
  - getPromotion() - на вход сотрудника. в методе - переход на одну позицию выше и зп на 1,25 больше.*/
    Map<Department, List<Employee>> empList = new HashMap<>();
    public static void main(String[] args) {
        // Task1 - checker() - на вход сотрудника, на выходе String в зависимости от позишн
        Employee employee = new Employee("Anton", Department.IT, Position.JUNIOR, 12.000);
        Employee employee2 = new Employee("Dima", Department.IT, Position.SENIOR, 12.000);
        Info info = new Info();
        System.out.println(info.checker(employee));
        System.out.println(info.checker(employee2));

        // Task2 - avgSalary() - на вход департамент, на выход средняя зп по департаменту
        System.out.println(info.avgSalary(Department.IT));
        System.out.println(info.avgSalary(Department.SECURITY));

        // Task3 - maxSalary() - на вход департамент, на выход max зп по департаменту + у кого такая зп(имя)
        System.out.println(info.maxSalary(Department.IT));

        // Task4  - minSalary() - на вход департамент, на выход min зп по департаменту + у кого такая зп(имя)
        System.out.println(info.minSalary(Department.IT));

        // Task5   - getPromotion() - на вход сотрудника. в методе - переход на одну позицию выше и зп на 1,25 больше.
        System.out.println(info.getPromotion(employee));
    }

    private Map<Position, String> employeeInfo;

    public Info() {
        employeeInfo = new HashMap<>();
        employeeInfo.put(Position.JUNIOR, "junior");
        employeeInfo.put(Position.MIDDLE, "middle");
        employeeInfo.put(Position.SENIOR, "senior");
        List<Employee> workers = new ArrayList<>();
        workers.add(new Employee("Maria", Department.IT, Position.MIDDLE, 23.000));
        workers.add(new Employee("Sara", Department.IT, Position.MIDDLE, 29.000));
        workers.add(new Employee("Andrey", Department.IT, Position.MIDDLE, 12.000));
        empList.put(Department.IT, workers);
        List<Employee> securityWorkers = new ArrayList<>();

        securityWorkers.add(new Employee("Max", Department.SECURITY, Position.MIDDLE, 72.000));
        empList.put(Department.SECURITY, securityWorkers);

    }

    // Task1 - checker() - на вход сотрудника, на выходе String в зависимости от позишн
    public String checker(Employee employee){
        return employeeInfo.get(employee.getPosition());
    }
    // Task2 - avgSalary() - на вход департамент, на выход средняя зп по департаменту
    public double avgSalary (Department department){
        List<Employee> employeeList = empList.get(department);
        double avg = 0;
        for (Employee employee : employeeList) {
            avg += employee.getSalary();
        }
        return avg / employeeList.size();
    }
    // Task3 - maxSalary() - на вход департамент, на выход max зп по департаменту + у кого такая зп(имя)
    public double maxSalary (Department department2){
        List<Employee> employeeList2 = empList.get(department2);
        double max = 0;
        String employeeName = "";
        for (Employee emp : employeeList2) {
            if (emp.getSalary() > max){
                max = emp.getSalary();
                employeeName = emp.getName();
            }
        }
        System.out.println("The max salary is: " + max);
        System.out.println("The employee name is: " + employeeName);
        return max;
    }
    public double minSalary (Department department2){
        List<Employee> employeeList2 = empList.get(department2);
        double min = Double.MAX_VALUE;
        String employeeMinName = "";
        for (Employee emp : employeeList2) {
            if (emp.getSalary() < min){
                min = emp.getSalary();
                employeeMinName = emp.getName();
            }
        }
        System.out.println("The min salary is: " + min);
        System.out.println("The employee name is: " + employeeMinName);
        return min;
    }

    // Task5   - getPromotion() - на вход сотрудника. в методе - переход на одну позицию выше и зп на 1,25 больше.
    public double getPromotion(Employee employee){
        double salary = 0;
        double promotion = 1.25;
        List<Employee> employeeList = empList.get(employee.getDepartment());
        Iterator<Employee> iterator = employeeList.iterator();

        for (Employee emp : employeeList) {
            salary = emp.getSalary() * promotion;

            Position currentPosition = emp.getPosition();
            Position nextPosition = emp.getNextPosition(currentPosition);
            emp.setPosition(nextPosition);
            System.out.println(currentPosition + "is promoted to " + nextPosition + "the new salary is: " + salary);
        }
        return salary;
    }

}
