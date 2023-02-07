import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		double bs,da,hra,gs;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the basic salary of he employer");
		bs=ob.nextDouble();
		da=bs-0.4*bs;
		hra=bs-0.2*bs;
		gs=bs+da+hra;
		System.out.println("Gross salary of the employer ="+gs);
		System.out.println("dearness allowance of the employee= "+da);
		System.out.println("House rent allowance of the employer = "+hra);


	}

}
