//defining class for Addition, Subtraction and Multiplication
class Operations{
    //member variable
    private int num1,num2;

    //parameterized constructor
    Operations(int a, int b){
        num1=a; //initializing number 1
        num2=b; //initializing number 2
    }
    //method for displaying data
    public void displayData(){
        System.out.println("------------Operations------------");
        System.out.println("First Number: "+num1);
        System.out.println("Second Number: "+num2);
    }
    //method for performing Addition
    void add(){
        System.out.println("----------Addition----------");
        System.out.println("Addition of "+ num1+" and "+num2+" is :"+(num1+num2));
    }
    //method for performing subtraction
    void subtract(){
        System.out.println("----------Subtraction----------");
        System.out.println("Subtraction of "+ num1+" from "+num2+" is :"+(num1 - num2));
    }
    //method for performing multiplication
    void multiply(){
        System.out.println("----------Multiplication----------");
        System.out.println("Multiplication of "+ num1+" from "+num2+" is :"+(num1 * num2));
    }
}
/*------------- Initial class ---------------------*/
public class AddSubMul {
    public static void main(String[] args) {
        //creating object of Operations class
        Operations numbers = new Operations(10,20);

        numbers.displayData(); //calling display method
        numbers.add();      //calling addition method
        numbers.subtract(); //calling subtraction method
        numbers.multiply(); //calling multiplication method
    }
}
