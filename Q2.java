public class Q2
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("Enter a positive number: " + a);
    System.out.println("Enter a positive number: " +b);
    int x = (int)Math.pow(a,b);
    
    System.out.println(x);
    }
}
