public class Q7
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);
    System.out.println("Enter a positive number: " + a);
    int b = Integer.parseInt(args[1]);
    System.out.println("Enter a positive number: " + b);
    int c = Integer.parseInt(args[2]);
    System.out.println("Enter a positive number: " + c);
    if((a<= b*c)|| (b<= a*c))
    {
      System.out.println("True");
    }
    else if(c<=a*b)
    {
     System.out.println("True");
    }
    else
    {
      System.out.println("False");
     }
   }
 }
