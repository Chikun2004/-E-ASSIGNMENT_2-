public class Q1
{
  public static void main(String[] args)
  {
    int dividend = Integer.parseInt(args[0]);
    int divisor = Integer.parseInt(args[1]);
    System.out.println(dividend);
    System.out.println(divisor);
    int Quotient = dividend/divisor;
    int Remainder = dividend % divisor;
    System.out.println("Quotient: " + Quotient);
    System.out.println("Remainder: " + Remainder);
    }
}
