import java.util.Scanner;
public class ThreeNum{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the three numbers");
        int a =sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        System.out.println("sum of number is"+(a+b+c)/3);

    }
}