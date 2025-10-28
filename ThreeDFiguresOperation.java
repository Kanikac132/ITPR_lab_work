import java.util.Scanner; //importing Scanner class for user input
/*---- Defining a class for calculating volume of threedfigure --- */
class VolumeCalculator
{
    //method for calculating volume of cube
    private static void calculateVolume(int side)
    {
        System.out.println("----- Cube --------");
        System.out.println("Side : "+side+" cm");
        System.out.println("Volume : "+(side*side*side)+" cubic cm");
        System.out.println("-------------------------------");
    }
    // method for calculating volume of the sphere
    private static void calculateVolume(float radius)
    {
        double volume = (4 * 3.14 *radius * radius*radius)/3;
        System.out.println("----- Sphere--------");
        System.out.println("Radius : "+radius+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }
    // method for calculating volume of the sphere
    private static void calculateVolume(double radius)
    {
        double volume = (2 * 3.14 *radius * radius*radius)/3;
        System.out.println("----- Hemi Sphere--------");
        System.out.println("Radius : "+radius+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }
    //method for calculating volume of the cuboid
    private static void calculateVolume(int length,int breadth,int height)
    {
        System.out.println("----- Cuboid --------");
        System.out.println("Length : "+length+" cm");
        System.out.println("Breadth : "+breadth+" cm");
        System.out.println("Height : "+height+" cm");
        System.out.println("Volume : "+(length * breadth * height)+" cubic cm");
        System.out.println("-------------------------------");
    }
    //method for calculating volume of the cylinder
    private static void calculateVolume(int height,float radius)
    {
        double volume = 3.14 * radius * radius * height;
        System.out.println("-------- Cylinder ----------");
        System.out.println("Radius of Base : "+radius+" cm");
        System.out.println("Height : "+height+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }
    //method for calculating volume of the cone
    private static void calculateVolume(float radius,int height)
    {
        double volume = (3.14 * radius * radius * height)/3;
        System.out.println("-------- Cone ----------");
        System.out.println("Radius of Base : "+radius+" cm");
        System.out.println("Height : "+height+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }

    //method for perfoming opaeration for volume of threedfigures
    public static void volumeCalculation()
    {
        int operation,choice;
        //creating object of Scanner class
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("----- ThreeD Figures Voulme Caluation --------");
            System.out.println("1. Cube");
            System.out.println("2. Cuboid");
            System.out.println("3. Cylinder");
            System.out.println("4. Cone");
            System.out.println("5. Sphere");
            System.out.println("6. Hemi Sphere");
            System.out.println("---------------------------------");
            System.out.print("Select any one operation : ");
            operation = sc.nextInt();
            switch (operation) {
                 case 1: System.out.println("------ Selected Figure : Cube");
                    System.out.println("Enter Side(in cm) : ");
                    int side = sc.nextInt();
                    calculateVolume(side);
                
                    break;
                 case 2: System.out.println("------ Selected Figure : Cuboid");
                    System.out.println("Enter length(in cm) : ");
                    int length = sc.nextInt();
                    System.out.println("Enter breadth(in cm) : ");
                    int breadth = sc.nextInt();
                    System.out.println("Enter height(in cm) : ");
                    int height = sc.nextInt();
                    calculateVolume(length,breadth,height);                
                break;
                case 3: System.out.println("------ Selected Figure : Cylinder");
                    System.out.println("Enter radius(in cm) : ");
                    float radius = sc.nextFloat();
                    System.out.println("Enter height(in cm) : ");
                    int cy_height = sc.nextInt();
                    calculateVolume(cy_height,radius);                
                break;
                case 4: System.out.println("------ Selected Figure : Cone");
                    System.out.println("Enter radius(in cm) : ");
                    float co_radius = sc.nextFloat();
                    System.out.println("Enter height(in cm) : ");
                    int co_height = sc.nextInt();
                    calculateVolume(co_radius,co_height);                
                break;
                case 5: System.out.println("------ Selected Figure : Sphere");
                    System.out.println("Enter radius(in cm) : ");
                    float sp_radius = sc.nextFloat();
                    calculateVolume(sp_radius);                
                break;
                case 6: System.out.println("------ Selected Figure : hemi Sphere");
                    System.out.println("Enter radius(in cm) : ");
                    double hs_radius = sc.nextDouble();
                    calculateVolume(hs_radius);                
                break;
                default: System.out.println("Invalid operation");
            }
            System.out.println("---------------------------------");
            System.out.print("Press 0 to exit or any other number to continue : ");
            choice = sc.nextInt();
        }while(choice!=0);
    }
}
/*--- Initial class */
public class ThreeDFiguresOperation {
    public static void main(String[] args) {
        //performing volume calulation of threed figures
        VolumeCalculator.volumeCalculation();
    }
}
