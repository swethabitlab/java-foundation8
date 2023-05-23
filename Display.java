/*write a java program to read the array elements and then display the following menu.
1. find the sum of array elements
2. find the maximum and minimum elements
3. reverse the array elements
4. find the prime elements of the array.
now read the choice from the user and perform appropriate action*/
import java.util.Scanner;
class DisplayMenu{
  public int tosum(int a[]){
    int sum=0;
    for(int i=0;i<a.length;i++)
      sum=sum+a[i];
     return sum;
  }
  public int maximum(int a[]){
    int max;
    max=a[0];
    for(int i=0;i<a.length;i++)
      if(max<a[i])
        max=a[i];
    return max;
  }
  public int minimum(int a[]){
    int min;
    min=a[0];
    for(int i=0;i<a.length;i++)
      if(min>a[i])
        min=a[i];
    return min;
}
  public int[] reverse(int a[]){
    int temp=0;
    for(int i=0,j=a.length-1;i<j;i++,j--){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    return a;
  }
  public boolean isPrime(int num){
    int i=0, count=0;
    for(i=1;i<=num;i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==2)
      return true;
    else
      return false;
  }
}
public class Display{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    DisplayMenu a1= new DisplayMenu();
    int arr[] = new int[4];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    System.out.println("enter 1: to find the sum of array elements");
    System.out.println("enter 2: to find the maximum and minimum elements ");
    System.out.println("enter 3: to find reverse the array elements");
    System.out.println("enter 4: to find the prime elements of the array");
    System.out.println("enter the choice");
    int choice= sc.nextInt();
    switch(choice){
      case 1:
        int sum = a1.tosum(arr);
         System.out.println("sum is"+sum);
       break;
      case 2:
        int max = a1.maximum(arr);
        int min = a1.minimum(arr);
        System.out.println("max element is"+max+"mim element is"+min);
        break;
      case 3:
       int a[]= a1.reverse(arr);
    System.out.println("array after reverse");
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
        break;
      case 4:
        for(int i=0;i<arr.length;i++){
          boolean b = a1.isPrime(arr[i]);
          if(b)
            System.out.println(arr[i]);
        }
      break;
    }
    
  }
}
