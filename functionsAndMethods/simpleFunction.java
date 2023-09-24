import java.util.*;
public class simpleFunction{
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("enter your name");
         String name =sc.nextLine();
         printMyName(name);
    }
}