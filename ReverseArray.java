//WAP to reverse the array elements.
import java.util.Scanner;
public class ReverseArray{
  public static void main(String args[]){
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elements of array");
    for(int i=0;i<a.length;i++)
     a[i]=sc.nextInt();
    ReverseEle r=new ReverseEle();
    r.reverse(a);
    //reverse the array elements
    System.out.println("the reversed elements of array are ");
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
class ReverseEle{
  public int[] reverse(int a[]){
    for( int i=0,j=a.length-1;i<j;i++,j--){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    return a;
  }
}