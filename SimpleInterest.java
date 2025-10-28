package anudip;

//defining class for Simple Interest
class SI{
        //member variable
        private float principal,rate;
        private int time;
         //paramterized Constructor
        SI(float p, float r, int t){
            principal=p; //initializing principal
            rate=r;  // initializing rate
            time=t;   //initializing time
        }
          //method for displaying data
        public void DisplayData(){
            System.out.println("------------Simple Interest------------");
            System.out.println("Principal: "+principal+"Rs.");
            System.out.println("Rate: "+rate+"%");
            System.out.println("Time: "+time);
        }
    //method for calculating Simple Interest
        public void CalculateSI(){
            float si = (principal*rate*time)/100;
            System.out.println("--------------------------------------");
            System.out.print("Simple Interest is: " + si);
        }
    }
/*------------- Initial class ---------------------*/
public class SimpleInterest {

    public static void main(String[] args) {
        //creating object of SI class
        SI a=new SI(1500f,10f,5);

        a.DisplayData();
        a.CalculateSI();
    }
}
