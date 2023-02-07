public class Q5
{
 public static void main(String[] args)
 {
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
   int c = Integer.parseInt(args[2]);
   int x = Math.max(a,b);
   int y = Math.max(x,c);
   int z = Math.min(a,b);
   int k = Math.min(z,c);
   int t = a+b+c-y-k;
   System.out.println("Original Order: " + a + "," + b +"," + c);
   System.out.println("Ascending Order: " + k + "<" + t + "<" + y);
   }
}
