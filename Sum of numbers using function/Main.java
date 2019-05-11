import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int n)
  {
    int count=1,sum=0;
    while(count<=n)
    {
     sum=sum+count;
      count++;
    }
    return sum;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sum_of_numbers(n);
      System.out.println(sum);
      
      
	    
	}
}