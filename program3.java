import java.util.Scanner;

class Employee{
    int empId;
    String name;
    String department;
    Employee(int empId, String name, String department){
        this.empId=empId;
        this.name=name;
        this.department=department;
    }
    void display(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
    }
    double calculateSalary(){
        return 0.0;
    }
}
class FullTimeEmployee extends Employee{
    double baseSalary;
    double bonus;
    FullTimeEmployee(int empId, String name, String department, double baseSalary, double bonus){
        super(empId, name,department);
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }
    @Override 
    double calculateSalary(){
        return baseSalary+bonus;
    }
    @Override 
    void display(){
        super.display();
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Totalsalary: "+calculateSalary());
    }
}
class PartTimeEmployee extends Employee{
    int hourWorked;
    double hourlyRate;
    PartTimeEmployee(int empId, String name, String department, int hourWorked, double hourlyRate){
        super(empId, name, department);
        this.hourWorked=hourWorked;
        this.hourlyRate=hourlyRate;
    }
    @Override 
    double calculateSalary(){
        return hourWorked*hourlyRate;
    }
    @Override 
    void display(){
        super.display();
            System.out.println("Hours Worked: "+hourWorked);
            System.out.println("Hourly Rate: "+hourlyRate);
            System.out.println("Total Salary: "+calculateSalary());
        
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Full Time Employee Details: ");
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Department: ");
        String dept=sc.nextLine();
        System.out.println("Enter Base Salary: ");
        double salary=sc.nextDouble();
        System.out.println("Enter Bonus: ");
        double bonus=sc.nextDouble();
        FullTimeEmployee f = new FullTimeEmployee(id, name, dept, salary, bonus);
        System.out.println("Full Time Employee Details: ");
        f.display();

        System.out.println("Enter Part Time Employee Details: ");
        System.out.println("Enter Id: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        System.out.println("Enter Department: ");
        dept=sc.nextLine();
        System.out.println("Enter Hours Weeked: ");
        int hours=sc.nextInt();
        System.out.println("Enter Hourly Rate: ");
        double rate=sc.nextDouble();
        PartTimeEmployee p = new PartTimeEmployee(id, name, dept, hours, rate);
        System.out.println("Part Time Employee Details: ");
        p.display();
        
    }

    
}
