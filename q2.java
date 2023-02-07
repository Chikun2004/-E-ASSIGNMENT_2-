import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter distance in kilometer");
        double d=sc.nextDouble();
        System.out.println("distance in meters:"+d*1000);
        System.out.println("distance in feets:"+d*3280.8399);
        System.out.println("distance in inches:"+d*39370.0787);
        System.out.println("distance in centimeter:"+d*100000);
	}

}
