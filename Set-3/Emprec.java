import java.util.*;

class Employee
{
    Scanner SC = new Scanner(System.in);
    String name;
    int empno, ph;

    Employee(int empno, String name, int ph)
    {
        this.name = name;
        this.empno = empno;
        this.ph = ph;
    }

    void print()
    {
        System.out.println(empno+"\t\t"+name+"\t\t"+ph);
    }
}

class Emprec
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("How many employees? ");
        int n = SC.nextInt();
        Employee E[] = new Employee[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter your name: ");
            String name = SC.next();
            System.out.print("Enter your employee number: ");
            int empno = SC.nextInt();
            System.out.print("Enter your phone number: ");
            int ph = SC.nextInt();
            E[i] = new Employee(empno, name,ph);
        }

        System.out.println("Emp No.\t\tName\t\tPhone Number");
        for(int i=0; i<n; i++)
            E[i].print();
    }
}


