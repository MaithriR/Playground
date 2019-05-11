import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in=new Scanner (System.in);
      int n1,n2,n3;
      n1=in.nextInt();
      n2=in.nextInt();
      n3=in.nextInt();
	   int largest=greatest_of_three_nos(n1,n2,n3);
      System.out.println(largest);
	}
  public static int greatest_of_three_nos(int n1,int n2,int n3)
  {
    int largest=0;
    if(n1>n2 &&n1>n3)
      largest=n1;
    else if(n2>n1 && n2>n3)
      largest=n2;
    else
      largest=n3;
    return largest;
    }
}