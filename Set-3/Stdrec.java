import java.util.*;

class Student
{
    Scanner SC = new Scanner(System.in);
    String name;
    int roll;
    int M[] = new int[5];

    void read()
    {
        System.out.print("Enter your name: ");
        name = SC.next();
        System.out.print("Enter your roll number: ");
        roll = SC.nextInt();
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter mark of Subject-"+(i+1)+": ");
            M[i] = SC.nextInt();
        }
    }
    void print()
    {
        System.out.println("Name:\t"+name);
        System.out.println("Roll No.\t"+roll);
        System.out.println("Marks: ");
        for(int i=0; i<5; i++)
            System.out.println("Subject-"+(i+1)+"\t"+M[i]);
    }
}

class Stdrec
{
    public static void main(String args[])
    {
        Student S = new Student();
        S.read();
        S.print();
    }
}