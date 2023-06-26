package classStructure1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Company {
    private String name;
    Set<Employee> employees = new HashSet<>(); // "Vlad", "Ksu"
    Set<Department> departments = new HashSet<>();

    public static Comparator<Company> NameComparator = new Comparator<Company>() {
        public int compare(Company c1, Company c2) {
            return c1.getName().compareTo(c2.getName());
        }
    };

    public String getName() {
        return name;
    }

    public Company(Set<Employee> employees, Set<Department> departments) {
        this.employees = employees;
        this.departments = departments;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

}
