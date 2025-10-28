class Cylinder{
    private float height,radius;

    //parameterized constructor
    Cylinder(float h, float r){
        height=h; //initializing height
        radius=r; //initializing radius
    }
    //method for displaying data
    public void displayData(){
        System.out.println("------------Operations------------");
        System.out.println("Height: "+height+ " cm");
        System.out.println("Radius: "+radius+" cm");
    }
    //method for calculating Curved surface area
    void curvedSurfaceArea(){
        float cs=(2*3.14f*radius*height);
        System.out.println("Curved surface area is : "+cs);
    }
    //method for calculating Total surface area
    void totalSurfaceArea(){
        float ts=(2*3.14f*radius*(radius+height));
        System.out.println("Tota surface area is : "+ts);
    }
    //method for calculating volume
    void volume(){
        float vol=3.14f*radius*radius*height;
        System.out.println("Volume of Cylinder is : "+vol);
    }
}
/*------------- Initial class ---------------------*/
public class CylinderOperations {
    public static void main(String[] args) {
        //creating object of Cylinder class
        Cylinder cs=new Cylinder(10f,5f);

        cs.displayData();
        cs.curvedSurfaceArea();
        cs.totalSurfaceArea();
        cs.volume();
    }
}
