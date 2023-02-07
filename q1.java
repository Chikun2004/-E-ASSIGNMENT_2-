import java.util.Scanner;
public class q1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the degree in fahrenheit");
        Scanner ob=new Scanner(System.in);
        float temp1=ob.nextFloat();
        double temp2;
        temp2=(temp1-32)*(5.0/9);
		System.out.println("The value of temparature in celcius is"+temp2);
		
        
      
        
	}

}
