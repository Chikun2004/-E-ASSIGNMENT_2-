import java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number between 0 and 1000:");
         int number=sc.nextInt();
         int digit1=number%10;
         number=number/10;
         int digit2=number%10;
         number=number/10;
         int digit3=number%10;
         number=number/10;
         int sumof =digit1+digit2+digit3;
         System.out.println("The sum of digit is "+sumof);
	}

}
