import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of seconds");
       double t=sc.nextDouble();
       double g=32.174;
       double dis=(1.0/2)*g*Math.pow(t,2);
       System.out.println("Distane travelled:"+dis);
	}

}
