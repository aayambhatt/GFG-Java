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

public class EmployeeToDeveloper {
    public static void main(String[] args) {
        Employee e = new Employee("Aayam", 50000);
        e.printInfo();

        e.setSalary(60000);
        e.printInfo();

        e.setSalary(-1000); // should NOT update
        e.printInfo();

        Developer d = new Developer("Aaryan", 85000, "Java");
        d.printInfo();
    }
}
