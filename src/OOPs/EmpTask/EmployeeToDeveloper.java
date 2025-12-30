package OOPs.EmpTask;

class Employee{
    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<0){
            System.out.println("Salary cannot be less than zero");
            return;
        }
        this.salary = salary;
    }

    void printInfo(){
        System.out.println("Name: " + name + ", Salary: " + salary);
    }


}

class Developer extends Employee{

    private String programmingLanguage;

    Developer(String name, int salary, String programmingLanguage) {
        super(name, salary); // calls parent constructor
        this.programmingLanguage = programmingLanguage;

    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("Languages: " + programmingLanguage);
    }
}

class Manager extends Employee {

    private int teamSize;

    Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Team size: " + teamSize);
    }
}


public class EmployeeToDeveloper {
    public static void main(String[] args) {
        // reference type is Employee, object type is developer
        Employee e1 = new Developer("Aaryan", 85000, "Java");
        Employee e2 = new Manager("Rohit", 120000, 10);

        e1.printInfo();
        System.out.println("-----");
        e2.printInfo();
    }

}
