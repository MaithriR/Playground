import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
       Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n];
       for(int i=0;i<=n-1;i++)
       {
           a[i] = in.nextInt();
       }
        int count = 0;
        for(int i=0;i<=n-1;i++)
        {
            if(a[i] != 0)
            {
                int temp=a[i];
                a[i]=a[count];
                a[count]=temp;
                count++;
            }
        }
      for(int i=0;i<=n-1;i++){
           System.out.print(a[i] + " ");
      }
    }
}
