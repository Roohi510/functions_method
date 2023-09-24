import java.util.*;
public class fibSeries {
 public static int  fib(int n){
    if(n<=1){
        return n;
    }
    return fib(n-1)+fib(n-2);
 }
 public static void fibSeries(int n){
      int n1=0;

      int n2 =1;
      int count=0,sum=0;
      while(count<n){
        System.out.print(n1+"  ");
        sum =n1+n2;
        n1 =n2;
        n2 =sum;
        count++;
      }

 }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        System.out.print(fib(i)+"  ");
        System.out.println();
        fibSeries(n);
    }
}
