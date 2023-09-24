import java.util.*;
public class addTwoNos {
public static int addtwo(int a,int b){
           int sum =a+b;
           return sum;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b =sc.nextInt();
        System.out.println(addtwo(a,b));
    }
}
