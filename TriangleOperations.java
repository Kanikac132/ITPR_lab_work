//defining class for area and perimeter
class Triangle{
    //member variable
    private float length1,length2,base,height;

    Triangle(float l1,float l2,float b, float h){
        length1=l1;  //initializing length
        length2=l2;  //initializing length
        base=b;      //initializing base
        height=h;    //initializing height
    }
    //method for displaying data
    public void displayData(){
        System.out.println("Length of first side: "+length1+" cm");
        System.out.println("Length of second side: "+length2+" cm");
        System.out.println("Length of third side: "+base+" cm");
        System.out.println("Height of Triangle: "+height+" cm");
        System.out.println("------------Area and Perimeter------------");
    }
    //method for calculating perimeter
    void perimeter(){
        float peri=length1+length2+base;
        System.out.println("Perimeter of Triangle: "+peri+" cm");
    }
    //method for calculating are
    void area(){
        float areaa=((base*height)/2);
        System.out.println("Area of Triangle: "+ areaa +" sq. cm");
    }
}
/*------------- Initial class ---------------------*/
public class TriangleOperations {

    public static void main(String[] args) {
        //creating object of Triangle class
        Triangle tr=new Triangle(10.5f,10.0f,8.0f,8f);

        tr.displayData();   //calling displayData method
        tr.area();          //calling area method
        tr.perimeter();     //calling perimeter method
    }
}
