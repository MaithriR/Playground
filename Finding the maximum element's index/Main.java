import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a[] = new int[n];
    int i,max=a[0];
for( i=0;i<n;i++)
{
a[i] = in.nextInt();
}
for(i=0;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
      }
    }
    for(i=0;i<n;i++)
    {
      if(a[i]==max)
      {
        System.out.println(i);
      }
    }
  }
  
    
  }
