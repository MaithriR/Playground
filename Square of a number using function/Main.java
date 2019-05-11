import java.util.Scanner;
class Main
{
  public static int Square(int n)
  {
    int sqr=n*n;
    return sqr;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int sqr=Square(n);
      System.out.println(sqr);
      
	} 
}