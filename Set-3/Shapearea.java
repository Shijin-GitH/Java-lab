import java.util.*;

class Shape
{
    void area(float x)
        {System.out.println("Area of Circle: "+(3.14*x*x));}
    void area(int l, int b)
        {System.out.println("Area of Rectangle: "+(l*b));}
    void area(float b, float h)
        {System.out.println("Area of Triangle: "+(0.5*b*h));}
}

class Shapearea
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        Shape S = new Shape();

        System.out.println("Select Shape: ");
        System.out.println("Press 1 for Circle\nPress 2 for Rectangle\nPress 3 for Triangle");
        int n = SC.nextInt();
        switch(n) {
            case 1:
                System.out.print("Enter radius of circle: ");
                float r = SC.nextInt();
                S.area(r);
                break;
            case 2:
                System.out.print("Enter length & breadth of rectangle: ");
                int l = SC.nextInt();
                int b = SC.nextInt();
                S.area(l,b);
                break;
            case 3:
                System.out.print("Enter base length & height of triangle: ");
                float B = SC.nextFloat();
                float H = SC.nextFloat();
                S.area(B,H);
                break;
            default:
                System.out.print("Enter valid input!");
        }
    }
}