import java.util.*;
public class GCD {
public static int hcf(int a,int b){
           if(a==b){
            return b;
           }
           if(b==0){
            return a;
           }
           if(a==0){
            return b;
           }
           if(a>b){
            return hcf(a-b,b);

           }else{
            return hcf(a,b-a);
           }
           
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b =sc.nextInt();
        System.out.println(hcf(a,b));
    }
}