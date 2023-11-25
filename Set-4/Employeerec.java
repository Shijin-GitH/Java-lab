import java.util.*;

class Employee
{
    String Name;
    String address;
    int age,phno,salary;
    Scanner SC = new Scanner(System.in);

    public void read()
    {
        System.out.print("Name: ");
        Name=SC.nextLine();
        System.out.print("Age: ");
        age=SC.nextInt();
        System.out.print("Phone Number: ");
        phno = SC.nextInt();
        SC.nextLine();
        System.out.print("Enter Address: ");
        address = SC.nextLine();
        System.out.print("Enter Salary: ");
        salary = SC.nextInt();
        SC.nextLine();
    }

    public void print()
    {
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phno);
        System.out.println("Address: "+address);
    }

    public void printsalary()
        {
            System.out.println("Salary: "+salary);
        }
}

class Officer extends Employee
{
    String specialization;
    public void Specialization()
    {
        System.out.print("Enter specialization: ");
        specialization = SC.nextLine();
    }
    public void printspl()
    {
        System.out.println("Specialization: "+specialization);
    }
}

class Manager extends Employee
{
    String department;
    public void Department()
    {
        System.out.print("Enter department: ");
        department = SC.nextLine();
    }
    public void printdept()
    {
        System.out.println("Department: "+department);
    }
}

class Employeerec
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        Officer a = new Officer();
        System.out.println("Enter Details of Officer: ");
        a.read();
        a.Specialization();
        Manager b = new Manager();
        System.out.println("Enter Details of Manager: ");
        b.read();
        b.Department();
        System.out.println("Details of Officer: ");
        a.print();
        a.printsalary();
        a.printspl();
        System.out.println("Details of Manager: ");
        b.print();
        b.printsalary();
        b.printdept();
    }
}