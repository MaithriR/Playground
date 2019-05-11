import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,p,r,sum=0,save;
       save=n;
      while(n!=0)
      { i=1;
       p=1;
        r=n%10;
        while(i<=r)
        {
          p=p*i;
          i++;
        }
        sum=sum+p;
        n=n/10;
      }
      if(sum==save)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}