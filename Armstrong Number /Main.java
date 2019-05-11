import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n;
      int rem,res=0,digits=0;
      while(num!=0)
      {
        digits++;
        num=num/10;
      }
      num=n;
      while(num!=0)
      {
        rem=num%10;
        res+= Math.pow(rem,digits);
        num=num/10;
      }
      if(res==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}