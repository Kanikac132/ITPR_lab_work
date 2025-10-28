package project1;
import java.util.Scanner;
/*---- defining a class for rectangle ----*/
class Rectangle
{
    //member variable
    private float length,breadth;
    //paramterized Constructor
    Rectangle(float l,float b)
    {
        length = l;//initializing length
        breadth = b; //initializing breadth
    }
    //method for displaying data
    public void displaData()
    {
        System.out.println("----------------------------------------------");
        System.out.println("-------- Rectangle -------");
        System.out.println("Length : "+length+" cm");
        System.out.println("Breadth : "+breadth+" cm");
    }
    //method for calculating area
    public void calculateArea()
    {
        float area = length * breadth;
        System.out.println("Area : "+area+" sq.cm");
    }
    //method for calculating perimeter
    public void calculatePerimeter()
    {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter : "+perimeter+" cm");
    }
}
/*------------- Initial class ---------------------*/
public class RectangleOperation {

    public static void main(String[] args) {
        //creating object of Rectangle class
        Rectangle rect = new Rectangle(10.f,20.0f);
        //rect.inputData();
        rect.displaData();
        rect.calculatePerimeter();
        rect.calculateArea();
    }
}
