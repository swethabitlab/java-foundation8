//WAP to sort the elements in the integer array in ascending order.
import java.util.Scanner;
import java.util.Arrays;
public class Ascending{
  public static void main(String args[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements of the array");
    
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    
    for(int i=0;i<arr.length;i++){
     for(int j=i+1;j<arr.length;j++){
       int temp=0;
       if(arr[i]>arr[j]){
          temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
       }
     }
    }
      System.out.println("the ascending order of elements are");
      for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]);
    
  }
}