package classStructure1;

public class Employee {
    String name;
    private Department department;
    private Position position;
    double salary;

    public Employee(String name, Department department, Position position, double salary) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Position getNextPosition(Position currentPosition){
        Position nextPosition = null;

        if (currentPosition == Position.JUNIOR){
            nextPosition = Position.MIDDLE;
        } else if (currentPosition == Position.MIDDLE){
            nextPosition = Position.SENIOR;
        } else if (currentPosition == Position.SENIOR){
            System.out.println("Некуда уже повышать, хватит!");
        }
        return nextPosition;
    }
}
