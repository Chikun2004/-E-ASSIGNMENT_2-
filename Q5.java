import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the radius of the hemisphere:");
       double radius=sc.nextDouble();
       double  area=3*Math.PI*Math.pow(radius,2);
       System.out.println("The surface area of the hemisphere is:"+area);
       double volume=(2.0/3)*Math.PI*Math.pow(radius,3);
       System.out.println("The volume area of the hemisphere is "+volume);
       
       
       
       
       
   
	}

}
