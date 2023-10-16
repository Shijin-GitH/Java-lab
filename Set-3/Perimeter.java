import java.util.*;

class Shape
{
    int r,l,b;
    Shape(float radius)
    {
        System.out.println("Perimeter of circle: "+(2*3.14*r));
    }
    Shape(int l, int b)
    {
        System.out.println("Perimeter of rectangle: "+(2*(l+b)));
    }
}

class Perimeter
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Select Shape: \nPress 1 for Circle\nPress 2 for Rectangle");
        int n = SC.nextInt();
        if(n==1)
        {
            System.out.print("Enter radius of circle: ");
            float r = SC.nextInt();
            Shape S = new Shape(r);
        }
        else if(n==2)
        {
            System.out.print("Enter length & breadth of rectangle: ");
            int l = SC.nextInt();
            int b = SC.nextInt();
            Shape S = new Shape(l,b);
        }
        else
        {
            System.out.println("Enter valid input!");
            return;
        }
    }
}


