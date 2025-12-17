package OOPs;

class Employee{
    int id;
    int salary;
    Employee(int id, int salary){
        this.id = id;
        this.salary = salary;
    }

    void printDetails(){
        System.out.println("id: " + id + ", salary: " + salary);
    }
}

class SalesEmp extends Employee{
    String departmentName;
    SalesEmp(int id, int salary, String departmentName){
        super(id, salary);
        this.departmentName = departmentName;
    }

    void printDetails(){
        System.out.println("id: " + id + ", salary: " + salary + ", department name: " + departmentName);
    }
}


public class TestInheritance {
    public static void main(String[] args) {
        SalesEmp se = new SalesEmp(1,45000, "IT Service");
        se.printDetails();
    }
}
