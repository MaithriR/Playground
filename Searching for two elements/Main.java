import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int key1=in.nextInt();
      int key2=in.nextInt();
      int ele1=-1,ele2=-1;
      for(int i=0;i<=n-1;i++)
      {
        if(key1==arr[i])
        {
          ele1=i;
        }
        if(key2==arr[i])
        {
          ele2=i;
        }
      }
        System.out.println(ele1);
        System.out.println(ele2);
      
    }
}